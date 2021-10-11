/*Programa para saber si un número es más grande que otro*/

import java.util.Scanner ;

public class Ejercicio12 {
    public static void main(String[] args) { 
        double numero1 ;
        double numero2 ;

        Scanner inputValue ;
        inputValue = new Scanner(System.in) ;

        System.out.println("Escribe dos números. Diferencialos con un enter:") ;
        
        numero1= inputValue.nextDouble() ;
        numero2= inputValue.nextDouble() ;

        inputValue.close() ;

        if (numero1>=numero2){
            System.out.println(numero1) ;
        }else{
            System.out.println(numero2) ;
        }
    }
}
