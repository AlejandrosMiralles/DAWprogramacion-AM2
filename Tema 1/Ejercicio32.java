//Progrma que recibe 10 números y los muestra en un orden inverso. Utilizar los arrays

import java.util.Scanner ;

public class Ejercicio32 {
    public static void main(String[] args) {

        int[] array = new int[10] ;
        Scanner lector = new Scanner(System.in) ;
        
        System.out.println("Dame 10 números y te los devuelvo al revés:") ;

        for (int i = 0; i<10; ++i){
            System.out.println("Dame un número:") ;
            array[i] = lector.nextInt() ;
        }

        lector.close() ;

        System.out.println("Aquí te devuelvo esos números, pero al revés:") ;
        for (int i = 9;i>=0; --i){
            System.out.println(array[i]) ;
        }
    }
}
