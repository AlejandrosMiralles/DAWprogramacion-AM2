//Programa para recibir un número y devolver su factorial

import java.util.Scanner ;

public class Ejercicio25 {
    public static void main(String[] args) {

        int resultado = 1, numero ;
        Scanner lector = new Scanner(System.in) ;

        System.out.print("Dame un número y te devuelvo su factorial:") ;
        numero = lector.nextInt() ;
        lector.close() ;

        if (numero<0){
            System.out.println("El número debe ser un número natural.") ;
        }else if(numero == 0){
            System.out.println("EL factorial de 0 es 1.") ;
        }else{
            for (int i = 1; i <= numero; ++i){
                resultado = resultado * i ;
            }

            System.out.println("El factorial de "+numero+" es "+resultado) ;
        }
    }
}
