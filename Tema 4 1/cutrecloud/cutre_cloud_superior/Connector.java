package cutrecloud.cutre_cloud_superior;

import cutrecloud.cutre_cloud_inferior.*;

public class Connector {

    public static void addUser(Usuario user){ BaseDatos.addUser(user);}
    public static void addMedia(Media media){ BaseDatos.addMedia(media);}

    public static boolean idMediaValido(int id){
        return BaseDatos.idMediaValido(id);
    }

    public static boolean emailUsuarioValido(String email){
        return BaseDatos.emailUsuarioValido(email);
    }

    public static boolean esaMediaEsValida(int id){
        return BaseDatos.esaMediaEsValida(id);
    }

    public static boolean eseUsuarioEsValido(String email){
        return BaseDatos.eseUsuarioEsValido(email);
    }
}
