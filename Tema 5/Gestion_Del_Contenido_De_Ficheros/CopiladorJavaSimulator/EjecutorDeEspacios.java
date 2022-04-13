package Gestion_Del_Contenido_De_Ficheros.CopiladorJavaSimulator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class EjecutorDeEspacios {

    public static void eliminarEspaciosDobles(File ficheroJava){
        File ficheroFinal ;

        BufferedReader lector;
        FileWriter unamuno;
        String palabra;

        try {
            ficheroFinal = new File(ficheroJava.getCanonicalPath().split(".java")[0] + "_SinEspaciosDobles.java" ) ;

            ficheroJava.createNewFile();
            ficheroFinal.createNewFile();

            lector = new BufferedReader(new FileReader(ficheroJava));
            unamuno = new FileWriter(ficheroFinal);


            palabra = siguientePalabra(lector);
            while(palabra != "" && palabra.charAt(0) != (char) -1){
                unamuno.write(palabra + " ");
                unamuno.flush();

                palabra = siguientePalabra(lector);
            }

            lector.close();
            unamuno.close();

        }catch (Exception e) {
            System.out.println(e);
        }
    }

    private static String siguientePalabra(BufferedReader lector) throws IOException {
        char letra;
        String palabra = "" ;
        boolean estaEscribiendoUnaPalabra = false;
        boolean haTerminadoLaPalabra = false ;
        do {
            letra = (char) lector.read();

            if (letra != ' ' && letra != '\n'){
                estaEscribiendoUnaPalabra = true ;

                palabra += letra;
            }else if(estaEscribiendoUnaPalabra){
                haTerminadoLaPalabra = true;
            }

        } while (! haTerminadoLaPalabra && letra != (char) -1);

        return palabra;
    }

    public static void main(String[] args) {
        File archivoTester = new File("Tema 5/Gestion_Del_Contenido_De_Ficheros/CopiladorJavaSimulator/" +
                                "Tester.java");

        eliminarEspaciosDobles(archivoTester);
    }
}
