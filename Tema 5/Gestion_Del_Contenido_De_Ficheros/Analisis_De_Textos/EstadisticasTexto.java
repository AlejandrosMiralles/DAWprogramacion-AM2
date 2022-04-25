package Gestion_Del_Contenido_De_Ficheros.Analisis_De_Textos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EstadisticasTexto {
    private File archivo;

    private int vocales = 0;
    private int consonantes = 0;
    private int espacios = 0;
    private int tabuladores = 0;
    private int caracteresDesconocidos = 0;
    private int lineas = 0;


    EstadisticasTexto(String rutaArchivo) {
        this.archivo = new File(rutaArchivo);
    
    }

    void analizarTexto() throws FileNotFoundException, IOException{

        FileReader lector = new FileReader(archivo);
    
        char caracter;

        caracter = (char) lector.read();
        while(caracter != (char)-1){
            switch(caracter){
                case 
            }

            caracter = (char) lector.read();
        }

        lector.close();
    }


}
