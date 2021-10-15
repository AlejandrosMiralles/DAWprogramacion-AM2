/*Programa para saber si un número es negativo o positivo*/

import java.util.Scanner ;

public class Ejercicio10 {
    public static void main(String[] args) {
        int entero ;

        Scanner inputValue ;
        inputValue = new Scanner(System.in) ;

        System.out.print("Dame un entero y te diré si es positivo o negativo:") ;
        entero = inputValue.nextInt() ;

        inputValue.close() ;

        if (entero<0){
            System.out.println("El entero "+entero+" es negativo") ;
        }else if(entero==0){
            System.out.println("El número es el 0. Nosotros decimos que es positivo.") ;
        }else{
            System.out.println("El entero "+entero+" es positivo.") ;
        }
    }        
}
