package cl.models.pojos;
// Generated 10-08-2017 12:01:10 AM by Hibernate Tools 4.3.1



/**
 * Pacientes generated by hbm2java
 */
public class Pacientes  implements java.io.Serializable {


     private int id;
     private String title;
     private String cedula;
     private int cell;
     private String dir1;
     private String dob;
     private String fecharegistro;
     private String fname;
     private String lname;
     private char sex;
     private String status;
     private int tel1;

    public Pacientes() {
    }

    public Pacientes(int id, String title, String cedula, int cell, String dir1, String dob, String fecharegistro, String fname, String lname, char sex, String status, int tel1) {
       this.id = id;
       this.title = title;
       this.cedula = cedula;
       this.cell = cell;
       this.dir1 = dir1;
       this.dob = dob;
       this.fecharegistro = fecharegistro;
       this.fname = fname;
       this.lname = lname;
       this.sex = sex;
       this.status = status;
       this.tel1 = tel1;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public int getCell() {
        return this.cell;
    }
    
    public void setCell(int cell) {
        this.cell = cell;
    }
    public String getDir1() {
        return this.dir1;
    }
    
    public void setDir1(String dir1) {
        this.dir1 = dir1;
    }
    public String getDob() {
        return this.dob;
    }
    
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getFecharegistro() {
        return this.fecharegistro;
    }
    
    public void setFecharegistro(String fecharegistro) {
        this.fecharegistro = fecharegistro;
    }
    public String getFname() {
        return this.fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return this.lname;
    }
    
    public void setLname(String lname) {
        this.lname = lname;
    }
    public char getSex() {
        return this.sex;
    }
    
    public void setSex(char sex) {
        this.sex = sex;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public int getTel1() {
        return this.tel1;
    }
    
    public void setTel1(int tel1) {
        this.tel1 = tel1;
    }




}


