package cutrecloud.cutre_cloud_inferior;

import cutrecloud.cutre_cloud_superior.Connector;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Usuario implements ParserXML {
    private int id = 0;
    private String email;
    private String password;
    private static int idGenerator = 1;
    
    public int getID(){ return id;}
    public String getEmail(){ return email;}
    public String getPassword() { return password;}
    
    public void setEmail(String email) {
        if (Connector.emailUsuarioValido(email)){ return;}
        this.email = email;
    }
    public void setPassword(String password) { this.password = password;}

    public Usuario(String email, String password) {

        Connector.addUser(this);
        
        if (! Connector.eseUsuarioEsValido(email)){ return;}

        id = idGenerator++;
        this.email = email;
        this.password = password;

    }

    public String generateXML(){
        String result = "";

        result+= "<Usuario>";
        result+= "\n\t<id valor='"+ id + "' />";
        result+= "\n\t<email> "+ email + " </email>";
        result+= "\n\t<password> "+ password + "</password>";
        result+= "\n</Usuario>";

        return result;
    }

    public void writeXML(){
        String ficheroNombre = getClass().getSimpleName()+id+".xml";
        String path = "Tema 4 1/cutrecloud/cutre_cloud_inferior/ficherosxml/usuariosxml/";
        String contenidoFichero = generateXML();
        File archivo;
        FileWriter cervantes;

        try {
            archivo = new File(path+ficheroNombre);
            archivo.createNewFile();
            cervantes = new FileWriter(archivo, false);
            cervantes.write(contenidoFichero);
            cervantes.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void loadXML(){
        File folder = new File("./usuarios");

        
        for (File xmlFile : folder.listFiles()) {
            getLoadSingleXML(xmlFile);
        }
   }

   private static Usuario getLoadSingleXML(File xmlFile) {

       DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
       DocumentBuilder dBuilder;
       Document doc;
       Usuario newUser = null;

       try {
           dBuilder = dbFactory.newDocumentBuilder();
           doc = dBuilder.parse(xmlFile);
           String email = doc.getElementsByTagName("email").item(0).getTextContent();
           String password = doc.getElementsByTagName("password").item(0).getTextContent();
           newUser = new Usuario(email, password);
       } catch (ParserConfigurationException e) {
           e.printStackTrace();
       } catch (SAXException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
       
       return newUser;
   }
}