//Programa que recibe un número y escribe todos los números naturales hasta él

import java.util.Scanner ;

public class Ejercicio27 {
    public static void main(String[] args) {
    
        int numero ;
        Scanner lector = new Scanner(System.in);

        System.out.println("Dame un número entero y te escribo todos los números hasta él:") ;
        numero = lector.nextInt() ;
        lector.close() ;
        
        for(int i=0; i<= numero; ++i){
            System.out.println(i) ;
        }
    }
}
