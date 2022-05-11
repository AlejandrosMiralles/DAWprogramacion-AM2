package Gestion_Del_Contenido_De_Ficheros.AnalizadorDePaginasWeb;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

//Decidir si hacer la clase estática o una en la que haya que instanciar y qué método hacer público y esas cosas
public class AnalizadorDepaginasWeb {
    //TODO: depurar este método
    //Equivale a hacer //ETIQUETA_A_BUSCAR/@VALOR_A_BUSCAR/text(). Aunque solo coge el primer atributo que coincida en cada etiqueta
    private String sacarAtributos(Document document, final String ETIQUETA_A_BUSCAR, final String VALOR_A_BUSCAR){
        StringBuilder urls = new StringBuilder();

        Element root = (Element) document.getFirstChild();
        NodeList etiquetasEncontradas = root.getElementsByTagName(ETIQUETA_A_BUSCAR);

        Node etiquetaEncontrada;
        NamedNodeMap atributosDeLaEtiquetaEncontrada;
        Node atributoEncontrado;
        for (int i = 0; i < etiquetasEncontradas.getLength(); i++) {
            etiquetaEncontrada = etiquetasEncontradas.item(i);
           
            atributosDeLaEtiquetaEncontrada = etiquetaEncontrada.getAttributes();

            atributoEncontrado = atributosDeLaEtiquetaEncontrada.getNamedItem(VALOR_A_BUSCAR);
                
            if (! urls.toString().contains(atributoEncontrado.getNodeValue())){
                urls.append(atributoEncontrado.getNodeValue());
                urls.append("\n");
            }        
            
        }

        return urls.toString();
    }

    //TODO: confirmar que esto es correcto
    String sacarURLs(Document document){
        return sacarAtributos(document, "a", "herf");
    }

    //TODO: confirmar que esto es correcto 
    String sacarNombreImagenes(Document document){
        StringBuilder nombreImagenes = new StringBuilder();
        String urlImagenes = sacarAtributos(document, "img", "url");


        Matcher matcher = Pattern.compile("/.*", Pattern.MULTILINE).matcher(urlImagenes);
        while (matcher.find()){
            nombreImagenes.append(matcher.group());
        }

        return nombreImagenes.toString();
    }

    
}
