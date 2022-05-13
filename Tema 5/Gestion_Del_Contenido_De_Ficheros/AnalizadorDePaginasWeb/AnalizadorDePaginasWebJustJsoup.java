package Gestion_Del_Contenido_De_Ficheros.AnalizadorDePaginasWeb;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;



//Decidir si hacer la clase estática o una en la que haya que instanciar y qué método hacer público y esas cosas
public class AnalizadorDePaginasWebJustJsoup {
    private Document document;

    AnalizadorDePaginasWebJustJsoup(URL url) throws IOException{
        int timeOut = 10000;
        document = Jsoup.parse(url, timeOut);
    }
    AnalizadorDePaginasWebJustJsoup(URL url, int timeOut) throws IOException{
        document = Jsoup.parse(url, timeOut);
    }

    //Equivale a hacer //ETIQUETA_A_BUSCAR/@VALOR_A_BUSCAR/text(). Aunque solo coge el primer atributo que coincida en cada etiqueta
    private String sacarAtributos(final String ETIQUETA_A_BUSCAR, final String VALOR_A_BUSCAR){
        StringBuilder contenidoDeseado = new StringBuilder();

        Element body = document.body();
        Elements hijosDelBody = body.select(ETIQUETA_A_BUSCAR);
        List<String> resultados = hijosDelBody.eachAttr(VALOR_A_BUSCAR);

        for (String resultadoAAnadir : resultados) {
            System.out.println(resultadoAAnadir);
            contenidoDeseado.append(resultadoAAnadir + "\n");
        }
        return contenidoDeseado.toString();
    }

    public String sacarURLs(){
        final String ETIQUETA_DE_ENLACES = "a";
        final String ATRIBUTO_URL_DE_LOS_ENLACES = "href";

        // imprimirNodos(document);

        return sacarAtributos(ETIQUETA_DE_ENLACES, ATRIBUTO_URL_DE_LOS_ENLACES);
    }

    public String sacarNombreImagenes(){
        final String ETIQUETA_IMAGEN = "img";
        final String ATRIBUTO_URL_IMAGEN = "src";

        StringBuilder nombreImagenes = new StringBuilder();
        
        String urlImagenes = sacarAtributos(ETIQUETA_IMAGEN, ATRIBUTO_URL_IMAGEN);


        Matcher matcher = Pattern.compile("/\\w+(\\.\\w+)?$", Pattern.MULTILINE).matcher(urlImagenes);
        while (matcher.find()){
            nombreImagenes.append(matcher.group().substring(1) + "\n"); //Cojo un substring porque el patrón me lo coge a partir del /
        }

        return nombreImagenes.toString();
    }

    public boolean descargarImagenes(File carpetaDestino) {
        boolean seHaDescargadoAlgo = true;

        try {
            if (! carpetaDestino.mkdir()){
                if (! carpetaDestino.isDirectory()){ 
                    seHaDescargadoAlgo = false;
                    return seHaDescargadoAlgo;
                }
            }

            final String ETIQUETA_IMAGEN = "img";
            final String ATRIBUTO_URL_IMAGEN = "src";
            String urlRelativaImagenes = sacarAtributos(ETIQUETA_IMAGEN, ATRIBUTO_URL_IMAGEN);
            LinkedHashSet<String> urlAbsolutaImagenes = new LinkedHashSet<String>();
            for (String urlRelativa : urlRelativaImagenes.split("\n")) {
                urlAbsolutaImagenes.add(document.location() + "/../" + urlRelativa);
            }

            File ficheroDestino;
            URL urlDescargaDeLaImagen;
            Iterator<String> iterator = urlAbsolutaImagenes.iterator();  
            String nombreYextensionFichero;
            while(iterator.hasNext()){
                urlDescargaDeLaImagen = new URL(iterator.next());
                nombreYextensionFichero = urlDescargaDeLaImagen.getFile().replaceAll(".*/", "");
                ficheroDestino = new File(carpetaDestino.getAbsolutePath() + "/" + nombreYextensionFichero);
                
                descargarImagen(urlDescargaDeLaImagen, ficheroDestino);
            }

            return seHaDescargadoAlgo;


        } catch (Exception e) {
            System.out.println("Error:\n\t" + e.getMessage() + "\n\n" + e);

            seHaDescargadoAlgo = false;
            return seHaDescargadoAlgo;
        }
    }

    public static boolean descargarImagen(URL url, File nuevoFichero) throws Exception{
        boolean seHaDescargado = true;

        try {    
            OutputStream escritor = new FileOutputStream(nuevoFichero);
            InputStream lector = url.openStream();

            for (int byteALeer = lector.read(); byteALeer != -1; byteALeer = lector.read()) {
                escritor.write(byteALeer);
            }

            escritor.close();
            lector.close();

            return seHaDescargado;

        } catch (Exception e) {
            System.err.println("Error:\n\t"+ e.getMessage());
            
            seHaDescargado = false;
            return seHaDescargado;
        }
    }

    public void setDocument(URL newURl) throws IOException{
        int timeOut = 10000;
        document = Jsoup.parse(newURl, timeOut);
    }
    public void setDocument(URL newURl, int timeOut) throws IOException{
        document = Jsoup.parse(newURl, timeOut);
    }

}

