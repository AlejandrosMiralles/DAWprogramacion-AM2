package cutrecloud;
import cutrecloud.cutre_cloud_inferior.*;
import cutrecloud.cutre_cloud_superior.*;

public class Tester {
    public static void main(String[] args) {
        Administrador admin = new Administrador();
        
        new Media(34345445, "Archivo", null, TiposMedia.AUDIO, new Usuario("JulioJesus@gmail.com", null));
        new Media(34533445, "Archivo", null, TiposMedia.AUDIO, new Usuario("JulioRockero@ieselcaminas.org", null));
        new Media(345235, "Archivo", null, TiposMedia.AUDIO, new Usuario("JulioXesus@ieselcaminas.org", null));
        new Media(45345, "Fichero", null, TiposMedia.VIDEO, new Usuario("JulioJavaLover@gmail.com", null));
        new Media(3445, "Fichero", null, TiposMedia.VIDEO, new Usuario("JulioCPlusPlus@ieselcaminas.org", null));

        admin.eliminarTodosLosArchivos(TiposMedia.AUDIO);

        System.out.println("Testeo terminado");

    }
}
