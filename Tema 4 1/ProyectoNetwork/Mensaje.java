package ProyectoNetwork;

import java.util.*;

class Mensaje {
    protected Usuarios autor;
    protected int likes = 0;
    protected Date publicadoEl;
    protected List<Mensaje> comentarios = new ArrayList<Mensaje>();

    Mensaje(Usuarios creador, Date fecha){
        autor = creador;
        publicadoEl = fecha;
    }

    Mensaje(Usuarios creador){
        autor = creador;
        publicadoEl = new Date();
    }

    void aumentarLikes(){ ++likes;}
    void contestado(Mensaje respuesta){
        comentarios.add(respuesta);
    }
}
