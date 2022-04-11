package Gestion_Del_Contenido_De_Ficheros.EliminarComentariosJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class EjecutorDeComentarios {

    private final File ficheroTemporal = new File("Tema 5/Gestion_Del_Contenido_De_Ficheros/EliminarComentariosJava/" +
                                                    "temporal.java"); 
    private File ficheroJava;

    boolean tieneComentariosBarraBarra(String linea){
        return linea.contains("//");
    }

    void eliminarComentariosJavaBarraBarra(){
        BufferedReader lector;
        FileWriter unamuno;
        String fila;

        try {
            ficheroJava.createNewFile();
            ficheroTemporal.createNewFile();

            lector = new BufferedReader(new FileReader(ficheroJava));
            unamuno = new FileWriter(ficheroTemporal);

            fila = lector.readLine();
            while(fila != null){
                if (tieneComentariosBarraBarra(fila)){
                    fila = fila.split("//")[0];
                }

                System.out.println(fila);

                unamuno.write(fila);

                unamuno.flush();
            }

            unamuno.close();
            lector.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void traspasarContenidoJava(){
        BufferedReader lector;
        FileWriter unamuno;
        String fila;

        try {
            ficheroJava.createNewFile();
            ficheroTemporal.createNewFile();

            lector = new BufferedReader(new FileReader(ficheroTemporal));
            unamuno = new FileWriter(ficheroJava);

            do {
                fila = lector.readLine();

                unamuno.write(fila);

                unamuno.flush();
            } while (fila != null);

            lector.close();
            unamuno.close();

            ficheroTemporal.delete();
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    void eliminarComentariosJavaBarraBarra(File archivoAModificar){
        ficheroJava = archivoAModificar;

        eliminarComentariosJavaBarraBarra();
        traspasarContenidoJava();
    }    

    public static void main(String[] args) {
        EjecutorDeComentarios tester = new EjecutorDeComentarios();
        File archivoTester = new File("Tema 5/Gestion_Del_Contenido_De_Ficheros/EliminarComentariosJava/" +
                                "Tester.java");

        tester.eliminarComentariosJavaBarraBarra(archivoTester);
    }
}
