//Programa que calcula la letra de un NIe a partir del número

import java.util.Scanner ;

public class Ejercicio34 {
    public static void main(String[] args) {

        int dni , digitoControl ;
        Scanner lector = new Scanner(System.in) ;
        char letraControl ;
        String[] array = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"} ;


        System.out.println("Dame el número de un NIE y te daré la versión española del mismo:") ;
        dni = lector.nextInt() ;

        System.out.println("Dame la letra de identificación del NIE (el X, Y o Z de delante):") ;
        letraControl = lector.next().charAt(0) ;
        letraControl = Character.toUpperCase(letraControl);

        lector.close() ;
        
        if (letraControl == 'X'){
            digitoControl = 0 ;
        }else if (letraControl =='Y'){
            digitoControl = 1 ;
        }else if (letraControl =='Z'){
            digitoControl = 2 ;
        }else{
            digitoControl = 20 ;
        }

        if (digitoControl == 20){
            System.out.println("La letra de control ha de ser X, Y o Z. De otra forma no es un NIE español.") ;
        }else{
            System.out.println("El NIE es: "+digitoControl+dni+array[dni%23]) ;
        }     
    }
}

