package Gestion_Del_Contenido_De_Ficheros.Primos;

import java.io.File;
import java.io.FileWriter;

public class Primos {

    //Se considera el 1 como primo
    public static boolean esPrimo(int posiblePrimo){
        if (posiblePrimo<1){ return false;}

        for (int i = 4; i < posiblePrimo; i++) {
            if (posiblePrimo%i == 0){
                return false;
            }
        }

        return true;
    }

    public static int siguientePrimo(int numeroActual){
        int primo = numeroActual;

        while (! esPrimo(++primo)) {}

        return primo;
    }

    public static void imprimirPrimos(int limite){
        String ruta = "Tema 5/Gestion_Del_Contenido_De_Ficheros/Primos/";
        String nombreArchivo = "primos.dat";
        File destino = new File(ruta + nombreArchivo);
        FileWriter escritor;
        int primo = 1; //El 0 no es primo

        try {
            destino.createNewFile();
            escritor = new FileWriter(destino);

            if (limite < 1){ escritor.close(); return ;}

            do {
                escritor.write(primo + "\n");
                
                primo = siguientePrimo(primo);
            } while (limite > primo);

            escritor.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        imprimirPrimos(500);
    }
}
