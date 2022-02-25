package ProyectoNetwork;

import java.util.Date;

class PublicacionesTexto extends Mensaje {
    private String texto;

    PublicacionesTexto(Usuarios creador, String texto) {
        super(creador);
        this.texto = texto;
    }

    PublicacionesTexto(Usuarios creador, Date fecha, String contenido){
        super(creador, fecha);
        texto = contenido;
    }

    @Override
    public String toString() {
        return autor+"\n\t "+texto+"\n\t\t\t"+publicadoEl.toString();
    }
}
