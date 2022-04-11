package Gestion_Del_Contenido_De_Ficheros.EliminarComentariosJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class EjecutorDeComentarios {

    private final File ficheroTemporal = new File("Tema 5/Gestion_Del_Contenido_De_Ficheros/EliminarComentariosJava/" +
                                                    "temporal.java"); 
    private File ficheroJava;

    private boolean tieneComentariosBarraBarra(String linea){
        return linea.contains("//");
    }

    private boolean tieneComentariosEnBloque(String linea){
        return linea.contains("/*");
    }

    private boolean tieneComentarios(String linea){
        return tieneComentariosBarraBarra(linea) || tieneComentariosEnBloque(linea);
    }

    private void eliminarComentariosJavaBarraBarra(){
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

                unamuno.write(fila + "\n");
                unamuno.flush();

                fila = lector.readLine();
            }

            unamuno.close();
            lector.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void eliminarComentariosJava(){
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
                if (tieneComentarios(fila)){
                    if (tieneComentariosBarraBarra(fila)){
                        fila = fila.split("//")[0];
                    }

                    String copiaFila = fila;

                    /*
                    for (int i = 0; tieneComentariosEnBloque(fila); i++) {
                        
                    }
                    */

                    fila = copiaFila.replace("/*.+*/", ""); //Repasar
                }

                unamuno.write(fila + "\n");
                unamuno.flush();

                fila = lector.readLine();
            }

            unamuno.close();
            lector.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void traspasarContenidoJava(){
        BufferedReader lector;
        FileWriter unamuno;
        String fila;

        try {
            ficheroJava.createNewFile();
            ficheroTemporal.createNewFile();

            lector = new BufferedReader(new FileReader(ficheroTemporal));
            unamuno = new FileWriter(ficheroJava);


            fila = lector.readLine();
            while(fila != null){
                unamuno.write(fila + "\n");
                unamuno.flush();

                fila = lector.readLine();
            }

            lector.close();
            unamuno.close();

            ficheroTemporal.delete();
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public void eliminarComentariosJavaBarraBarra(File archivoAModificar){
        ficheroJava = archivoAModificar;

        eliminarComentariosJavaBarraBarra();
        traspasarContenidoJava();
    }  
    
    public void eliminarComentariosJava(File archivoAModificar){
        ficheroJava = archivoAModificar;

        eliminarComentariosJava();
        traspasarContenidoJava();
    }

    public static void main(String[] args) {
        EjecutorDeComentarios tester = new EjecutorDeComentarios();
        File archivoTester = new File("Tema 5/Gestion_Del_Contenido_De_Ficheros/EliminarComentariosJava/" +
                                "Tester.java");

        tester.eliminarComentariosJavaBarraBarra(archivoTester);
    }
}
