package Calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
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
    }
}