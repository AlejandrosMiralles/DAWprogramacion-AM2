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
    private int lineas = 1; //Incluso si un fichero está vacío, se contará como que tiene una linea


    EstadisticasTexto(String rutaArchivo) throws FileNotFoundException, IOException{
        this.archivo = new File(rutaArchivo);
    
        if (archivo.exists()){
            analizarTexto();
        }
    }

    private void analizarTexto() throws FileNotFoundException, IOException{

        FileReader lector = new FileReader(archivo);
    
        char caracter;

        caracter = (char) lector.read();
        while(caracter != (char)-1){
            String aComprobar = "" + Character.toLowerCase(caracter);

            if (aComprobar.matches("[aeiou]|[á-ú]")){ vocales++;}
            else if(aComprobar.matches("[a-z]|[ñç]")){ consonantes++;}
            else if(aComprobar.equals(" ")){ espacios++;}
            else if(aComprobar.equals("\n")){ lineas++;}
            else if(aComprobar.equals("\t")){ tabuladores++;}
            else{ caracteresDesconocidos++;}

            caracter = (char) lector.read();
        }

        lector.close();
    }

    public void setFile(String rutaArchivo) throws FileNotFoundException, IOException{
        this.archivo = new File(rutaArchivo);

        reiniciarCamposDelObjeto();
    
        if (archivo.exists()){
            analizarTexto();
        }
    }

    private void reiniciarCamposDelObjeto() {
        vocales = 0;
        consonantes = 0;
        espacios = 0;
        tabuladores = 0;
        caracteresDesconocidos = 0;
        lineas = 1;
    }

    public void imprimirAnalisisDelFichero(){
        int letras = vocales + consonantes;
        int caracteresTotales = letras + espacios + tabuladores + caracteresDesconocidos;

        if (caracteresTotales == 0){
            System.out.printf("Ficher: %s \nLineas: %-4d\nLetras: %-4d\nVocale: %-4d %.2f%%\n" + 
              "Conson: %-4d %.2f%%\nEspaci: %-4d %.2f%%\nTabula: %-4d %.2f%%\n",
                    archivo.getAbsolutePath(),
                    lineas, 
                    letras,
                    vocales, 0.0,
                    consonantes, 0.0, 
                    espacios, 0.0, 
                    tabuladores, 0.0);
        }else{
            System.out.printf("%-15s %s \n%-15s %-7d\n%-15s %-7d\n%-15s %-7d %.2f%%\n" + 
                "%-15s %-7d %.2f%%\n%-15s %-7d %.2f%%\n%-15s %-7d %.2f%%\n",
                        "Fichero:", archivo.getAbsolutePath(),
                        "Lineas:", lineas, 
                        "Letras:", letras,
                        "Vocales:", vocales, (float) vocales/caracteresTotales * 100,
                        "Consonantes:", consonantes, (float) consonantes/caracteresTotales*100, 
                        "Espacios:", espacios, (float) espacios/caracteresTotales *100, 
                        "Tabuladores:", tabuladores, (float) tabuladores/caracteresTotales *100);
        }
    }

    public static void main(String[] args) {
        try {
            String archivo = "Tema 5/Gestion_Del_Contenido_De_Ficheros/Analisis_De_Textos/" +
                "readme.md";

            EstadisticasTexto tester = new EstadisticasTexto(archivo);

            tester.imprimirAnalisisDelFichero();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}