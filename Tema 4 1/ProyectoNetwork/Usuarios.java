package ProyectoNetwork;

import java.util.Date;

public class Usuarios {
    private String nombre;

    Usuarios(String nombre) {
        this.nombre = nombre;
    }

    String getNombre() {
        return nombre;
    }
    
    public void crearMensaje(String mensaje){
        Servidor.publicarMensajes(new PublicacionesTexto(this, mensaje));
    }
    public void crearMensaje(String mensaje, Date fecha){
        Servidor.publicarMensajes(new PublicacionesTexto(this, fecha, mensaje));
    }
    public void crearMensaje(String titulo, String imagen){
        Servidor.publicarMensajes(new PublicacionesImagenes(this, titulo, imagen));
    }
    public void crearMensaje(String titulo, String imagen, Date fecha){
        Servidor.publicarMensajes(new PublicacionesImagenes(this, fecha, titulo, imagen));
    }

    public void darMeGusta(Mensaje mensaje){
        mensaje.aumentarLikes();
    }
}