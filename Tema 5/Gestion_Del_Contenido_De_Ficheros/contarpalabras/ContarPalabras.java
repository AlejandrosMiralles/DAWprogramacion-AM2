package Gestion_Del_Contenido_De_Ficheros.contarpalabras;

import java.io.*;
import java.util.Scanner;

public class ContarPalabras {
    BufferedReader lector;
    String cadenaAContar = "-Tema";
    
    void prepararingredientes(){
        Scanner input = new Scanner(System.in);
        String rutaYNombre;
        File archivo;

        System.out.println("Cuál es la ruta del archivo?");
        rutaYNombre = input.nextLine();

        System.out.println("Qué palabra quieres contar?");
        //cadenaAContar = input.next();

        input.close();

        archivo = new File(rutaYNombre);

        try {
            archivo.createNewFile();

            lector = new BufferedReader(new FileReader(archivo));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    void setCadenaAContar(String newCadena){ cadenaAContar = newCadena;}

    private static int contarPalabraPorLinea(String linea, String aContar){
        String[] palabrasDeLaLinea = linea.split(" ");

        int contador = 0;

        for (String string : palabrasDeLaLinea) {
            if (string == aContar){ contador++;}
        }

        return contador;
    }

    int contarPalabras(){
        int contador = 0;
        String linea = "";

        try {
            while (linea != null){
                linea = lector.readLine();
                contador+= contarPalabraPorLinea(linea, cadenaAContar);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return contador;
    }

    int contarPalabras(String cadenaAContar){
        int contador = 0;
        String linea = "";

        try {
            while (linea != null){
                linea = lector.readLine();
                contador+= contarPalabraPorLinea(linea, cadenaAContar);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return contador;
    }

    public static void main(String[] args) {
        ContarPalabras tester = new ContarPalabras();

        tester.prepararingredientes();
        System.out.println(tester.contarPalabras());
    }
}
