package cutrecloud;
import cutrecloud.cutre_cloud_inferior.*;
import cutrecloud.cutre_cloud_superior.*;

public class Tester {
    public static void main(String[] args) {
        Administrador admin = new Administrador();
        

        new Media("Archivo", null, TiposMedia.AUDIO, new Usuario("JulioJesus@gmail.com", null));
        new Media("Archivo", null, TiposMedia.AUDIO, new Usuario("JulioRockero@ieselcaminas.org", null));
        new Media("Archivo", null, TiposMedia.AUDIO, new Usuario("JulioXesus@ieselcaminas.org", null));
        new Media("Fichero", null, TiposMedia.VIDEO, new Usuario("JulioJavaLover@gmail.com", null));
        new Media("Fichero", null, TiposMedia.VIDEO, new Usuario("JulioCPlusPlus@ieselcaminas.org", null));

        admin.eliminarUsuariosPorDominio("ieselcaminas.org");
        admin.eliminarUsuariosPorDominio("@ieselcaminas.o");
        admin.eliminarUsuariosPorDominio("@ieselcaminas.org");

        System.out.println("Testeo terminado");

    }
}
