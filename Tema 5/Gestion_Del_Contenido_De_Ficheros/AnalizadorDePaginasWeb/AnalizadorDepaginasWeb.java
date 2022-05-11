package Gestion_Del_Contenido_De_Ficheros.AnalizadorDePaginasWeb;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilderFactory;

import org.jsoup.Jsoup;
import org.jsoup.helper.W3CDom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;



//Decidir si hacer la clase estática o una en la que haya que instanciar y qué método hacer público y esas cosas
public class AnalizadorDepaginasWeb {
    //TODO: depurar este método
    //Equivale a hacer //ETIQUETA_A_BUSCAR/@VALOR_A_BUSCAR/text(). Aunque solo coge el primer atributo que coincida en cada etiqueta
    private String sacarAtributos(Document document, final String ETIQUETA_A_BUSCAR, final String VALOR_A_BUSCAR){
        StringBuilder urls = new StringBuilder();

        Element root = (Element) document.getFirstChild();
        NodeList etiquetasEncontradas = root.getElementsByTagName(ETIQUETA_A_BUSCAR);

        Element etiquetaEncontrada;
        String atributoDeseadoDeLaEtiquetaEncontrada;
        for (int i = 0; i < etiquetasEncontradas.getLength(); i++) {
            etiquetaEncontrada = (Element) etiquetasEncontradas.item(i);
           
            atributoDeseadoDeLaEtiquetaEncontrada = etiquetaEncontrada.getAttribute(VALOR_A_BUSCAR);
                
            if (! urls.toString().contains(atributoDeseadoDeLaEtiquetaEncontrada)){
                urls.append(atributoDeseadoDeLaEtiquetaEncontrada);
                urls.append("\n");
            }        
            
        }

        return urls.toString();
    }

    //TODO: confirmar que esto es correcto
    private String sacarURLs(Document document){
        final String ETIQUETA_DE_ENLACES = "a";
        final String ATRIBUTO_URL_DE_LOS_ENLACES = "href";

        imprimirNodos(document);

        return sacarAtributos(document, ETIQUETA_DE_ENLACES, ATRIBUTO_URL_DE_LOS_ENLACES);
    }

    //TODO: confirmar que esto es correcto Y la expresion sea la deseada
    private String sacarNombreImagenes(Document document){
        final String ETIQUETA_IMAGEN = "img";
        final String ATRIBUTO_URL_IMAGEN = "src";

        imprimirNodos(document);

        StringBuilder nombreImagenes = new StringBuilder();
        
        String urlImagenes = sacarAtributos(document, ETIQUETA_IMAGEN, ATRIBUTO_URL_IMAGEN);


        Matcher matcher = Pattern.compile("/.*|^\\w+(\\.\\w+)?", Pattern.MULTILINE).matcher(urlImagenes);
        while (matcher.find()){
            nombreImagenes.append(matcher.group());
        }

        return nombreImagenes.toString();
    }

    private Document sacarCodigoPagina(String urlPagina){
        return W3CDom.convert(Jsoup.parse(urlPagina));
    }

    void metodoParaTestear(String url){
        Document document = sacarCodigoPagina(url);
        String nombreDeLasUrls = sacarURLs(document);
        String nombreDeLasImagenes = sacarNombreImagenes(document);
        
        System.out.printf("%s\n", "URL: " + url);
        System.out.println("\tURLs: " + nombreDeLasUrls);
        System.out.println("\n\tImagenes: " + nombreDeLasImagenes);
    }

    private void imprimirNodos(Document documentoAImprimir){
        Node root = documentoAImprimir.getFirstChild();
        NodeList hijos = root.getChildNodes();

        System.out.println(root.getTextContent());
        for (int i = 0; i < hijos.getLength(); i++) {
            System.out.println(hijos.item(i).getTextContent());
        }
    }

    public static void main(String[] args) {
        new AnalizadorDepaginasWeb().metodoParaTestear("https://uniwebsidad.com/libros/xhtml/capitulo-6");
    }

}
