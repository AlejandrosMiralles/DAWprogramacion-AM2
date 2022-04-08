package Gestion_Del_Contenido_De_Ficheros.Primos;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class LeerPrimos{
    static void leerPrimos(){
        File libro;
        String ruta = "Tema 5/Gestion_Del_Contenido_De_Ficheros/Primos/";
        String nombre = "primos.dat";
        BufferedReader lector;
        String contenido = "";

        libro= new File(ruta + nombre);

        try{
            libro.createNewFile();

            lector = new BufferedReader(new FileReader(libro));

            while(contenido != null){
                System.out.println(contenido);
                contenido = lector.readLine();
            }

            lector.close();
            
        }catch(IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] arg){
        leerPrimos();
    }

}