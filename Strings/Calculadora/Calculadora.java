package Calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

       // double startTime = System.nanoTime();

        boolean acabar = false;
        String cadena;
        Traductor descodificador = new Traductor();
        OperacionesBasicas aritmetico = new OperacionesBasicas();
        Scanner input = new Scanner(System.in);
        
        while(!acabar){

    
            System.out.print("Dame una operación: ");
            cadena = input.nextLine();
            
    
            if (cadena.toLowerCase().equals("fin")){ 
                break;    
            }

            cadena = descodificador.descodificar(cadena);
            
            if (cadena == "Operación incorrecta"){
                System.out.println(cadena);
                acabar = true;
            }else{
                System.out.println( cadena + " = "+ aritmetico.menu(cadena));
            }
        }

        input.close();

    //    double stopTime = System.nanoTime();
    //    System.out.println("Tiempo: "+(stopTime-startTime)+"nanosegundos o "+((stopTime-startTime)/1000000000.0)+" segundos.");
    }
}