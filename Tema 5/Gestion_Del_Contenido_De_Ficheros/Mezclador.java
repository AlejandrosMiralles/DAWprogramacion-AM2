package Gestion_Del_Contenido_De_Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Mezclador {

    private FileWriter escritor;
    private BufferedReader lector1;
    private BufferedReader lector2;
    private final Scanner input = new Scanner(System.in);

    @Override
    public void finalize() {
        input.close();
    }

    private void mezclar(BufferedReader lector1, 
            BufferedReader lector2, FileWriter escritor) {
        String primerTexto, segundoTexto;

        try {
            primerTexto = lector1.readLine();
            segundoTexto = lector2.readLine();

            if (primerTexto != null && segundoTexto != null) {
                escritor.write(primerTexto + "\n");
                escritor.write(segundoTexto + "\n");

                mezclar(lector1, lector2, escritor);
            } else if (primerTexto != null && segundoTexto == null) {
                escritor.write(primerTexto + "\n");
                mezclar(lector1, escritor);
            } else if (segundoTexto != null && primerTexto == null) {
                escritor.write(segundoTexto + "\n");
                mezclar(lector2, escritor);
            } else {
                return;
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private void mezclar(BufferedReader lector, 
                        FileWriter escritor) {
        String textoAIntroducir;

        try {
            textoAIntroducir = lector.readLine();

            if (textoAIntroducir != null) {
                escritor.write(textoAIntroducir + "\n");
                mezclar(lector, escritor);
            } else {
                return;
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static BufferedReader crearLector(String ruta, 
            String nombreFichero) throws FileNotFoundException,
                                         IOException {
        BufferedReader lector;
        File fichero;
        fichero = new File(ruta + nombreFichero);
        fichero.createNewFile();
        lector = new BufferedReader(new FileReader(fichero));
        return lector;
    }

    private void prepararIngredientes()
         throws FileNotFoundException, IOException {
        
        File fichero;
        String ruta, nombreFichero;

        ruta = "Tema 5/Gestion_Del_Contenido_De_Ficheros/ficherosDeTexto/";

        System.out.println("Escriba el nombre del primer fichero: ");
        nombreFichero = input.next();
        lector1 = crearLector(ruta, nombreFichero);

        System.out.println("Escriba el nombre del segundo fichero: ");
        nombreFichero = input.next();
        lector2 = crearLector(ruta, nombreFichero);  


        fichero = new File(ruta + "mezcla.txt");
        fichero.createNewFile();
        escritor = new FileWriter(fichero);
    }

    public void mezclar() {
        try {
            prepararIngredientes();
            mezclar(lector1, lector2, escritor);

            lector1.close();
            lector2.close();
            escritor.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Mezclador tester = new Mezclador();
        tester.mezclar();
        tester.finalize();
        
    }
}