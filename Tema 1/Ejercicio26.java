//Programa que recibe un número y devuelve su tabla de multiplicar

import java.util.Scanner ;

public class Ejercicio26 {
    public static void main(String[] args) {

        int numero ;
        Scanner lector = new Scanner(System.in) ;

        System.out.println("Dame un número y te devuelvo su tabla de multiplicar del 10:") ;
        numero = lector.nextInt() ;
        lector.close() ;
        
        for(int i = 0; i <= 10; ++i){

            System.out.println(numero+" * "+i+" = "+i*numero) ;
        }
    }
}
