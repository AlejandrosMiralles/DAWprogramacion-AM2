package cutrecloud;
import cutrecloud.cutre_cloud_inferior.*;
import cutrecloud.cutre_cloud_superior.*;

public class Tester {
    public static void main(String[] args) {
        Administrador admin = new Administrador();
        
        new Usuario("dee", "sdcms").writeXML();
        //Usuario tester = new Usuario("dmeor e ", "dmemr e");
    //    new Media("Pepe", "wc", TiposMedia.IMAGEN, new Usuario("email", "22233")).writeXML();
        //Media testerMedia = new Media("Pepe", "wc", TiposMedia.IMAGEN, new Usuario("email", "22233"));    
    }
}
