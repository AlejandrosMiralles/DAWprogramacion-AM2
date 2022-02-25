package ProyectoNetwork;

import java.util.*;

public class Servidor {
    private static List<Mensaje> mensajes = new ArrayList<Mensaje>();

    static void publicarMensajes(Mensaje... mensajesAPublicar) {
        for (Mensaje mensaje : mensajesAPublicar) {
            mensajes.add(mensaje);
        }
    }

    public static List<Mensaje> buscarMensajesDe(Usuarios usuario){
        List<Mensaje> mnesajesDelUsuario = new ArrayList<Mensaje>();
        for (Mensaje mensaje : mensajes) {
            if (mensaje.autor.equals(usuario)){ mnesajesDelUsuario.add(mensaje);}
        }

        return mnesajesDelUsuario;
    }

    public static List<Mensaje> buscarMensajesEntreMyN(Date m, Date n) {
        List<Mensaje> mensajesTemporalmenteCorrectos = new ArrayList<Mensaje>();

        if (m.after(n)){
            Date l = m;
            m = n;
            n = l;
        }

        for (Mensaje mensaje : mensajes) {
            if (m.before(mensaje.publicadoEl) && n.after(mensaje.publicadoEl)){
                mensajesTemporalmenteCorrectos.add(mensaje);
            }
        }

        return mensajesTemporalmenteCorrectos;
    }

    public static void imprimirMensajesRecientes() {
        for (Mensaje mensaje : buscarMensajesEntreMyN(new Date( (long) (new Date().getTime() * 0.9)), new Date())) {
            System.out.println(mensaje);
        }
    }

    public static void imprimirMensajesDeAlguien(Usuarios alguien) {
        for (Mensaje mensaje : buscarMensajesDe(alguien)) {
            System.out.println(mensaje);
        }
    }
}
