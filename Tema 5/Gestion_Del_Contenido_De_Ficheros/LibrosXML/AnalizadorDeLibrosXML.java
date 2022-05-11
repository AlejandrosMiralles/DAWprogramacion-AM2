package Gestion_Del_Contenido_De_Ficheros.LibrosXML;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class AnalizadorDeLibrosXML {
    static final String RUTA = "Tema 5/Gestion_Del_Contenido_De_Ficheros/LibrosXML/";
    String nombre = "";

    AnalizadorDeLibrosXML(String nombre){ this.nombre = nombre; }

    String todosLosGeneros() throws Exception{
        final String ETIQUETA_A_BUSCAR = "genre"; 
        StringBuilder generos = new StringBuilder();
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(RUTA + nombre); 
        Element root = (Element) document.getFirstChild();
        NodeList nodosDeGenero = root.getElementsByTagName(ETIQUETA_A_BUSCAR);

        String generoEncontrado;
        for (int i = 0; i < nodosDeGenero.getLength(); i++) {
            generoEncontrado = nodosDeGenero.item(i).getFirstChild().getTextContent();
            if (! generos.toString().contains(generoEncontrado)){
                generos.append(generoEncontrado);
                generos.append("\n");
            }
        }

        return generos.toString();
    }

    public static void main(String[] args){
        try {
            System.out.println(new AnalizadorDeLibrosXML("books.xml").todosLosGeneros());
        } catch (Exception e) {
            System.err.println(e.getMessage() + "\n\n\n\n" + e);
        }
    }
}
