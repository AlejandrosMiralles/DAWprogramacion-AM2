//Programa que recibe un número natural y devuelve una lista de sus divisores

import java.util.Scanner ;

public class Ejercicio39 {
    public static void main(String[] args) {

        int numero ;
        Scanner lector = new Scanner(System.in) ;

        System.out.println("Dame un número natural y te digo sus divisores:");
        numero = lector.nextInt() ;

        lector.close() ;

        if (numero>1){ //Divido el número entre todos a no ser que sea el 1, el 0 o un número negativo
            for (int divisor=1; divisor<numero; ++divisor){
                if (numero%divisor == 0){
                    System.out.print(divisor+", ");
                }
            }
            System.out.println(numero+".");
               
        }else{
            if (numero<0){
                System.out.println("Debes darme un número natural. El "+numero+" es un número negativo.") ;
            }else if(numero ==0){
                System.out.println("Es el 0. Todos los números pueden dividir al 0.") ;
            }else{
                System.out.println("El número sólo tiene un divisor, él mismo.") ;
            }
        }
    }
}
