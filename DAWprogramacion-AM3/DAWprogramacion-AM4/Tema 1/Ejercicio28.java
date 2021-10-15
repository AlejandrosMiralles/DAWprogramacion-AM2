//Programa que calcula si un número es primo o no

import java.util.Scanner ;

public class Ejercicio28 {
    public static void main(String[] args) {

        int numero;
        boolean primo= true ;
        Scanner lector = new Scanner(System.in) ;

        System.out.println("Dame un número y te digo si es primo o no:") ;
        numero = lector.nextInt() ;
        lector.close() ;


        if (numero<0){
            System.out.println("Los números negativos no son primos. Recuerda que una de las condiciones para que un número sea primo, es que ha de ser natural.") ;
        }else if (numero == 1 || numero == 0){
            System.out.println("El número "+numero+ " no es primo.") ;
        }else if (numero%2 == 0 && numero !=2){
            primo = false ;
            System.out.println("El número "+numero+" no es primo.") ;
        }else{
            for(int i=3; i<numero; i = i+2){
                if (numero%i == 0){
                    primo = false ;
                    break ;
                }
            }

            if (primo){
                System.out.println("El número "+numero+" es primo.") ;
            }else{
                System.out.println("El número "+numero+" no es primo.") ;
            }

        }
    }
}
