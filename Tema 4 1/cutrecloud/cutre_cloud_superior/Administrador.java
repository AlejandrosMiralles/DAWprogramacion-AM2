package cutrecloud.cutre_cloud_superior;

import cutrecloud.cutre_cloud_inferior.*;

public class Administrador{
 
    public void eliminarArchivo(String nombre){
        BaseDatos.eliminarArchivo(nombre);
    }
    
    public void eliminarUsuariosPorDominio(String dominio){
        BaseDatos.eliminarUsuariosPorDominio(dominio);
    }

    public void eliminarTodosLosArchivos(TiposMedia tipo){
        BaseDatos.eliminarTodosLosArchivos(tipo);
    }

    public void eliminarUsuariosPorEmail(String email){
        BaseDatos.eliminarUsuariosPorEmail(email);
    }
}
