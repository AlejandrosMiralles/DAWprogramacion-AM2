package Gestion_Del_Contenido_De_Ficheros.ControlFicherosDatosDelCliente;

public class Persona {
    private String nif;
    private String nombre;
    private String apellidos;

    protected String getNif() {
        return nif;
    }
    protected void setNif(String nif) {
        this.nif = nif;
    }
    protected String getNombre() {
        return nombre;
    }
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    protected String getApellidos() {
        return apellidos;
    }
    protected void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
