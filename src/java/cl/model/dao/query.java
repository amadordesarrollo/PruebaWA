/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;
import cl.models.pojos.Doctores;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class query {
    public void ingresar(Doctores d){
        SessionFactory sf = null;
        Session sesion = null;
        Transaction tx = null;
        
        try {
            sf = NewHibernateUtil.getSessionFactory();
            sesion = sf.openSession();
            tx = sesion.beginTransaction();
            sesion.save(d);
            tx.commit();
            sesion.close();
            
        } catch (Exception e) {
            tx.rollback();
            throw new RuntimeException("no se puede guardar el producto");
        }
    }
    
    public String consultar(int codigo){
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Doctores d = (Doctores)sesion.get(Doctores.class, codigo); // casteamos a Doctores
        sesion.close();
        if (d!=null) {
            return "el codigo es " +d.getId();
        } else {
            return "El doctor no existe en la base de datos ";
        }
    }
    
    public List<Doctores> verdoctores(){
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Query query = sesion.createQuery("from Doctores");
        List<Doctores> lista = query.list();
        sesion.close();
        return lista;
        
        
    }
}
