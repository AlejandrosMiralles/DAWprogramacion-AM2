package Gestion_Del_Contenido_De_Ficheros.ControlFicherosDatosDelCliente;

import java.io.Serializable;

public class Persona implements Serializable {
    protected String nif;
    protected String nombre;
    protected String apellidos;

    public String getNif() {
        return nif;
    }
    public void setNif(String nif) {
        this.nif = nif;
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
}
