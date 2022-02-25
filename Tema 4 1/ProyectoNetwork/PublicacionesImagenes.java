package ProyectoNetwork;

import java.util.*;

class PublicacionesImagenes extends Mensaje {
    private String titulo;
    private String imagen;
    
    PublicacionesImagenes(Usuarios creador, String titulo, String imagen) {
        super(creador);
        this.titulo = titulo;
        this.imagen = imagen;
    }

    PublicacionesImagenes(Usuarios creador, Date fecha, String titulo, String imagen){
        super(creador, fecha);
        this.titulo = titulo;
        this.imagen = imagen;
    }

    public String to_String(){
        return autor+"\n\t "+titulo+"\n"+imagen+"\n\t\t\t"+publicadoEl.toString();
    }
}
