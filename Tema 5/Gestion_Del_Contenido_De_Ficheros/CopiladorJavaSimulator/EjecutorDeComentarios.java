package Gestion_Del_Contenido_De_Ficheros.CopiladorJavaSimulator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;




public class EjecutorDeComentarios {

    private final File ficheroTemporal = new File("Tema 5/Gestion_Del_Contenido_De_Ficheros/EliminarComentariosJava/" +
                                                    "temporal.java"); 
    private File ficheroJava;

    private final int CADENA_DE_TEXTO = 3;
    private final int POSIBLE_COMENTARIO = 4;
    private final int POR_LEER = 0;
    private final int COMENTARIO_EN_BLQOUE = 1;
    private final int COMENTARIO_EN_LINEA = 2;
    
    private int estado = 0;

    /* private void eliminarComentariosJavaBarraBarra(int mec){
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
    } */

    private void eliminarComentariosJavaBarraBarra(){
        BufferedReader lector;
        FileWriter unamuno;
        char primerChar, segundoChar = 0;

        try {
            ficheroJava.createNewFile();
            ficheroTemporal.createNewFile();

            lector = new BufferedReader(new FileReader(ficheroJava));
            unamuno = new FileWriter(ficheroTemporal);

            primerChar = (char) lector.read();
            while(primerChar != (char) -1){
                switch(estado){
                    case POR_LEER:
                        if (primerChar == '"'){ estado = CADENA_DE_TEXTO; break;}
                        if (primerChar == '/'){ estado = POSIBLE_COMENTARIO; continue; }
                        break;

                    case COMENTARIO_EN_LINEA:
                        if ( primerChar == '\n'){ estado = POR_LEER; unamuno.write(primerChar);} 
                        segundoChar = primerChar;
                        primerChar = (char) lector.read();
                        continue;

                    case CADENA_DE_TEXTO:
                        if (primerChar == '"'){ estado = POR_LEER;} 
                        break;

                    case POSIBLE_COMENTARIO:
                        segundoChar = primerChar ;
                        primerChar = (char) lector.read() ;

                        switch (primerChar) {
                            case '/':
                                estado = COMENTARIO_EN_LINEA; 
                                continue;
                            default:
                                unamuno.write(segundoChar);
                                estado = POR_LEER;
                        }
                        break ;
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
    
    private void eliminarComentariosJava(){
        BufferedReader lector;
        FileWriter unamuno;
        char primerChar, segundoChar = 0;

        

        try {
            ficheroJava.createNewFile();
            ficheroTemporal.createNewFile();

            lector = new BufferedReader(new FileReader(ficheroJava));
            unamuno = new FileWriter(ficheroTemporal);

            primerChar = (char) lector.read();
            while(primerChar != (char) -1){
                switch(estado){
                    case POR_LEER:
                        if (primerChar == '"'){ estado = CADENA_DE_TEXTO; break;}
                        if (primerChar == '/'){ estado = POSIBLE_COMENTARIO; continue; }
                        break;

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
                        if (primerChar == '"'){ estado = POR_LEER;} 
                        break;

                    case POSIBLE_COMENTARIO:
                        segundoChar = primerChar ;
                        primerChar = (char) lector.read() ;

                        switch (primerChar) {
                            case '/':
                                estado = COMENTARIO_EN_LINEA; 
                                continue;
                            case '*':
                                estado = COMENTARIO_EN_BLQOUE; 
                                continue;
                            default:
                                unamuno.write(segundoChar);
                                estado = POR_LEER;
                        }
                        
                        break ;
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
