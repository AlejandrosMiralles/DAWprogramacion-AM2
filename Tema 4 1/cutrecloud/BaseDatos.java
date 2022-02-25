package cutrecloud;

import java.util.ArrayList;

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

    static boolean validoTipoMedia(String tipo){
        switch(tipo.toLowerCase()){
            case("audio"):
            case("video"):
            case("imagen"): return true;
            default: return false;
        }
    }

    static boolean idUsuarioValido(int id){
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getID() == id){
                return false;
            }
        }

        return true;
    }   
    
    static boolean emailUsuarioValido(String email){
        for (Usuario user : listaUsuarios) {
            if (user.getEmail().equals(email)){
                return false;
            }
        }

        return true;
    }

    static boolean esaRelacionUsuarioMediaYaExiste(int id){
        for (Media objecto : listaMedia) {
            if (objecto.getUsuario_id() == id){
                return true;
            }
        }

        return false;
    }

    static boolean esaMediaEsValida(int id, int userID, String tipo){
        return idUsuarioValido(userID) && validoTipoMedia(tipo)
            && ! esaRelacionUsuarioMediaYaExiste(userID) && idMediaValido(id);
    }

    static boolean eseUsuarioEsValido(int id, String email){
        return idUsuarioValido(id) && emailUsuarioValido(email);
    }

   
}
