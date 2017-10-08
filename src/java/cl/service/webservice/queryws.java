/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.service.webservice;

import cl.models.pojos.Doctores;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import cl.model.dao.query;
import java.util.List;
/**
 *
 * @author ZERO
 */
@WebService(serviceName = "queryws")
public class queryws {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ingresardoctor")
    public String ingresardoctor(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "telefono") int telefono) {
        Doctores d = new Doctores(id,nombre,apellido,telefono);
        query q = new query();
        q.ingresar(d);
        return "Doctor Ingresado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscardoctor")
    public String buscardoctor(@WebParam(name = "codigo") int codigo) {
        query q = new query();
        return q.consultar(codigo); 
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultardoctor")
    public List<Doctores> consultardoctor() {
        query q = new query();
        List<Doctores> listadoctores = q.verdoctores();
        return listadoctores;
    }
}
