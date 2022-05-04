package Gestion_Del_Contenido_De_Ficheros.ControlFicherosDatosDelCliente;

import java.io.Serializable;

public class Persona implements Serializable {
    protected String nif;
    protected String nombre;
    protected String apellidos;

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
