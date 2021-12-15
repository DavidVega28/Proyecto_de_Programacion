
package clases;


public class Usuario {
    private String nombre,apellidos,numcedula,usuario,contra,celular,email,rol;
    

    public Usuario(String nombre, String apellidos, String numcedula, String usuario, String contra, String celular, String email, String rol) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numcedula = numcedula;
        this.usuario = usuario;
        this.contra = contra;
        this.celular = celular;
        this.email = email;
        this.rol = rol;

    }

    public Usuario(String código, String cupos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumcedula() {
        return numcedula;
    }

    public void setNumcedula(String numcedula) {
        this.numcedula = numcedula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}