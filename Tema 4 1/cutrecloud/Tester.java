package cutrecloud;
import cutrecloud.cutre_cloud_inferior.*;
import cutrecloud.cutre_cloud_superior.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Administrador admin = new Administrador();
        
        new Usuario("dee", "sdcms").writeXML();
        //Usuario tester = new Usuario("dmeor e ", "dmemr e");
        new Media("Pepe", "wc", TiposMedia.IMAGEN, new Usuario("email", "22233")).writeXML();
        //Media testerMedia = new Media("Pepe", "wc", TiposMedia.IMAGEN, new Usuario("email", "22233"));    
    
        /*
        String nombreArchivo= "Usuario1.xml";
        String path = "Tema 4 1/cutrecloud/cutre_cloud_inferior/ficherosxml/usuariosxml/";
        try {
            File archivo = new File(path+nombreArchivo);
            Scanner myScanner = new Scanner(archivo);
            while(myScanner.hasNext()){ 
                System.out.println(myScanner.nextLine());
            }
            myScanner.close();

        }
        catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
        */
    
    
    }
}
