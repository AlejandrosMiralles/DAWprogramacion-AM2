package contarpalabras; 

import java.io.*;
import java.util.Scanner;

public class ContarPalabras {
    private BufferedReader lector;
    private String cadenaAContar;
    
    ContarPalabras(){
        Scanner input = new Scanner(System.in);
        String rutaYNombre;
        File archivo;

        System.out.println("Cuál es la ruta del archivo?");
        rutaYNombre = input.nextLine();

        System.out.println("Qué palabra quieres contar?");
        cadenaAContar = input.next();

        input.close();

        archivo = new File(rutaYNombre);

        try {
            archivo.createNewFile();

            lector = new BufferedReader(new FileReader(archivo));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void setCadenaAContar(String newCadena){ cadenaAContar = newCadena;}

    private static int contarPalabraPorLinea(String linea, String aContar){
        if (linea == null || aContar == ""){ return 0;}

        String[] palabrasDeLaLinea = linea.split(" ");

        int contador = 0;

        for (String string : palabrasDeLaLinea) {
            if (string.equals(aContar)){ 
                contador++;
            }
        }

        return contador;
    }

    public int contarPalabras(){
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

    public int contarPalabras(String cadenaAContar){
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

        System.out.println(tester.contarPalabras());
    }
}
