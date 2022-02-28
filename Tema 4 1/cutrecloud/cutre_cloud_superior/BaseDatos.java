package cutrecloud.cutre_cloud_superior;

import java.util.ArrayList;

import cutrecloud.cutre_cloud_inferior.*;

class BaseDatos {

    static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    static ArrayList<Media> listaMedia = new ArrayList<Media>();

    static void addUser(Usuario user){ listaUsuarios.add(user);}
    static void addMedia(Media media){ listaMedia.add(media);}

    static boolean idMediaValido(int id){
        for (Media media : listaMedia) {
            if (media.getUsuario_id() == id){
                return false;
            }
        }

        return true;
    }
    
    static boolean emailUsuarioValido(String email){
        for (Usuario user : listaUsuarios) {
            if (! (user.getEmail() == null) && user.getEmail().equals(email)){
                return false;
            }
        }

        return true;
    }

    static boolean esaMediaEsValida(int id){
        return idMediaValido(id);
    }

    static boolean eseUsuarioEsValido(String email){
        return emailUsuarioValido(email);
    }

    static void eliminarArchivo(String nombre){
        for (Media archivo : listaMedia) {
            if (!(archivo.getNombre() == null) &&
                archivo.getNombre().equals(nombre)){
                listaMedia.remove(archivo);
                break;
            }
        }
    }

    static void eliminarTodosLosArchivos(TiposMedia tipo){
        boolean seHaEliminado = false;
        Media archivo;
        for (int i = 0; i < listaMedia.size(); i++) {
            if (seHaEliminado){ 
                --i;
                seHaEliminado = false;
            }

            archivo = listaMedia.get(i);
            if (archivo.getTipo().equals(tipo)){
                listaMedia.remove(archivo);
                seHaEliminado = true;
            }
        }
    }
   
    static void eliminarUsuariosPorEmail(String email){
        boolean seHaEliminado = false;
        Usuario user;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (seHaEliminado){
                --i;
                seHaEliminado = false;
            }

            user = listaUsuarios.get(i);

            if (user.getEmail().equals(email)){
                listaUsuarios.remove(user);
                eliminarSusArchivos(user);
                seHaEliminado = true;
            }

        }
    }

    static void eliminarSusArchivos(Usuario user){
        boolean seHaEliminado = false;
        Media archivo;
        for (int i = 0; i < listaMedia.size(); i++) {
            if (seHaEliminado){ 
                --i;
                seHaEliminado = false;
            }

            archivo = listaMedia.get(i);
            if (archivo.getUsuario_id() == user.getID()){
                listaMedia.remove(archivo);
                seHaEliminado = true;
            }
        }
    }

    static void eliminarUsuariosPorDominio(String dominio){
        if (! dominio.startsWith("@")){ return;}

        boolean seHaEliminado = false;
        Usuario user;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (seHaEliminado){
                --i;
                seHaEliminado = false;
            }

            user = listaUsuarios.get(i);

            if (user.getEmail().endsWith(dominio)){
                listaUsuarios.remove(user);
                eliminarSusArchivos(user);
                seHaEliminado = true;
            }

        }
    }
}
