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
            //TODO: arreglar esto
            LinkedHashSet<String> urlAbsolutaImagenes = new LinkedHashSet<String>();
            for (String urlRelativa : urlRelativaImagenes.split("\n")) {
                urlAbsolutaImagenes.add(document.location() + urlRelativa);
            }

            int numeroArchivo = 0;
            File ficheroDestino;
            URL urlDescargaDeLaImagen;
            Iterator<String> iterator = urlAbsolutaImagenes.iterator();
            while(iterator.hasNext()){
                ficheroDestino = new File(carpetaDestino.getAbsolutePath() + "/" + ++numeroArchivo + ".png");
                urlDescargaDeLaImagen = new URL(iterator.next());

                descargarImagen(urlDescargaDeLaImagen, ficheroDestino);
            }
            return seHaDescargadoAlgo;
        } catch (Exception e) {
            seHaDescargadoAlgo = false;
            return seHaDescargadoAlgo;
        }
    }

    private void descargarImagen(URL url, File nuevoFichero) throws Exception{
        OutputStream escritor = new FileOutputStream(nuevoFichero);
        InputStream lector = url.openStream();

        for (int byteALeer = lector.read(); byteALeer > 0; byteALeer = lector.read()) {
            escritor.write(byteALeer);
        }

        escritor.close();
        lector.close();
    }

    public void setDocument(URL newURl) throws IOException{
        int timeOut = 10000;
        document = Jsoup.parse(newURl, timeOut);
    }
    public void setDocument(URL newURl, int timeOut) throws IOException{
        document = Jsoup.parse(newURl, timeOut);
    }

    private void metodoParaTestear() throws Exception{
        String nombre = "imagenesDescargadas";
        String ruta = "Tema 5/Gestion_Del_Contenido_De_Ficheros/AnalizadorDePaginasWeb/";

        descargarImagenes(
            new File(ruta + nombre));
    }

    public static void main(String[] args) {
        try {
            new AnalizadorDePaginasWebJustJsoup(new URL("https://alejandrosmiralles.github.io/AlejMiraFFVII/Modo%20d%C3%ADa/Monstruos/Monstruos.html"))
                                                .metodoParaTestear();
        } catch (Exception e) {
            System.err.println("Error\n\t" + e.getMessage() + "\n\n\n" + e);
        }
    }
}

