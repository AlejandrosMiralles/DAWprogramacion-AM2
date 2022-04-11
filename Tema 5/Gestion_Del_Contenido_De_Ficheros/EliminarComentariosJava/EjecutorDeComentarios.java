package Gestion_Del_Contenido_De_Ficheros.EliminarComentariosJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import rpg.item.Food.PoisonousFoodDecorator;

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

    
    private void eliminarComentariosJava(int algo){
        BufferedReader lector;
        FileWriter unamuno;
        String fila;
        boolean comentarioabierto = false;

        try {
            ficheroJava.createNewFile();
            ficheroTemporal.createNewFile();

            lector = new BufferedReader(new FileReader(ficheroJava));
            unamuno = new FileWriter(ficheroTemporal);

            fila = lector.readLine();
            while(fila != null){
                if (tieneComentarios(fila) || comentarioabierto){
                    if (tieneComentariosBarraBarra(fila)){
                        fila = fila.split("//")[0];
                    }

                    if (tieneComentariosEnBloque(fila) || comentarioabierto ){ 
                        if (comentarioabierto){
                            
                        }
                    }

                    String copiaFila = fila;

                    for (int i = 0; tieneComentariosEnBloque(fila) || comentarioabierto; i++) {

                    }
                    


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
    
    private void eliminarComentariosJava(){
        BufferedReader lector;
        FileWriter unamuno;
        char primerChar, segundoChar = 0;

        final int POR_LEER = 0;
        final int COMENTARIO_EN_BLQOUE = 1;
        final int COMENTARIO_EN_LINEA = 2;
        final int CADENA_DE_TEXTO = 3;

        int estado = 0;

        try {
            ficheroJava.createNewFile();
            ficheroTemporal.createNewFile();

            lector = new BufferedReader(new FileReader(ficheroJava));
            unamuno = new FileWriter(ficheroTemporal);

            primerChar = (char) lector.read();
            while(primerChar != (char) -1){
                switch(estado){
                    case POR_LEER:
                        if (segundoChar == '/' && primerChar == '/'){ estado = COMENTARIO_EN_LINEA; continue;}
                        if (segundoChar == '/' && primerChar == '*'){ estado = COMENTARIO_EN_BLQOUE; continue;} 
                        if (primerChar == '"'){ estado = CADENA_DE_TEXTO;}break;

                    case COMENTARIO_EN_LINEA:
                        if ( primerChar == '\n'){ estado = POR_LEER; unamuno.write(primerChar);} 
                        segundoChar = primerChar;
                        primerChar = (char) lector.read();
                        continue;

                    case COMENTARIO_EN_BLQOUE: 
                        if (segundoChar == '*' && primerChar == '/'){
                             estado = POR_LEER;
                        }
                        segundoChar = primerChar;
                        primerChar = (char) lector.read();
                        continue;        

                    case CADENA_DE_TEXTO:
                        if (primerChar == '"'){ estado = POR_LEER;} break;
                }

                unamuno.write(primerChar);
                unamuno.flush();

                segundoChar = primerChar;
                primerChar = (char) lector.read();
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

        tester.eliminarComentariosJava(archivoTester);
    }
}
