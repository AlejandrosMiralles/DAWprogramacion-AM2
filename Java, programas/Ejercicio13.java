/*Programa para saber si un número es más grande que otro*/

import java.util.Scanner ;
public class Ejercicio13 {
    public static void main(String[] args) { 
        short numero1 ;
        short numero2 ;
        byte opcion ;

        Scanner inputValue ;
        inputValue = new Scanner(System.in) ;

        System.out.println("Escribe dos números. Diferencialos con un enter:") ;
        
        numero1= inputValue.nextShort() ;
        numero2= inputValue.nextShort() ;

        System.out.println("Escoja una opción con el uno o el dos:\n1 = Orden ascendente\n2 = Orden descendente\nEscoge:") ;
        opcion = inputValue.nextByte() ;

        inputValue.close() ;

        if (opcion != 1 && opcion != 2){
            System.out.println("Escoge una de las dos opciones. No te inventes otras.") ;
        }else if (numero1==numero2){
            System.out.println(numero1) ;
        }else if (numero1>numero2){
            if (opcion == 1){
                System.out.println(numero2+"\n\n"+numero1) ;
            }else{
                System.out.println(numero1+"\n\n"+numero2) ;
            }
        }else{
            if (opcion == 1){
                System.out.println(numero1+"\n\n"+numero2) ;
            }else{
                System.out.println(numero2+"\n\n"+numero1) ;
            }
        }
    }
}
