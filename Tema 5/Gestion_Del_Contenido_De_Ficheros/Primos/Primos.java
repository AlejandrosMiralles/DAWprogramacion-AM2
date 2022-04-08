package Gestion_Del_Contenido_De_Ficheros.Primos;

import java.io.File;
import java.io.FileWriter;

public class Primos {

    public static boolean esPrimo(int posiblePrimo){
        if (posiblePrimo<1){ return false;}

        for (int i = 2; i < posiblePrimo; i++) {
            if (posiblePrimo%i == 0){
                return false;
            }
        }

        return true;
    }

    public static int siguientePrimo(int numeroActual){
        int primo = -1;
        for (int i = 1+ numeroActual; !esPrimo(i) ; i++) {
            primo = i;
        }

        return primo;
    }

    public static void imprimirPrimos(int limite){
        String ruta = "Tema 5/Gestion_Del_Contenido_De_Ficheros/Primos/";
        String nombreArchivo = "primos.dat";
        File destino = new File(ruta + nombreArchivo);
        FileWriter escritor;
        int primo = 2;

        try {
            destino.createNewFile();
            escritor = new FileWriter(destino);

            if (limite < 1){ escritor.close(); return ;}

            escritor.write("1\n");

            while(limite > primo){
                primo = siguientePrimo(primo);

                if (primo < limite){
                    escritor.write("" + primo + "\n");
                }

            }

            escritor.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("Empezando a correr");
        imprimirPrimos(500);
        System.out.println("Se ha dejado de correr");
    }
}
