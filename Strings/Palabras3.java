import java.io.BufferedReader;

import java.lang.StringBuilder;

import java.io.FileReader; 

import java.io.IOException;

public class Palabras3 {

    public static String leerFichero(){

        BufferedReader br = null;

        String everything = "";

        try {

            br = new BufferedReader(new FileReader("./Carpeta_Directorios/fichero.txt"));

            StringBuilder sb = new StringBuilder();

            String line = br.readLine();

            while (line != null) {

                sb.append(line);

                sb.append(System.lineSeparator());

                line = br.readLine();

            }

            everything = sb.toString();

        }catch(Exception e){

            e.printStackTrace();

        } finally {

            try {

                if (br != null)

                    br.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

        return everything;

    }

    public static void main(String[] args) {

        String cadena = leerFichero();

        long startTime = System.currentTimeMillis();

        System.out.println(cadena);

        
        String[] palabras = Palabras1.dividirEnPalabras(cadena);
    
        System.out.println("Hay "+palabras.length+" palabras.");

        long endTime = System.currentTimeMillis();

        long tiempoPrimero = endTime - startTime;

        //Imprimimos cuántos milisegundos has tardado en procesarlo

        System.out.println(tiempoPrimero);

    }

}
