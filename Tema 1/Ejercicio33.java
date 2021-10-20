//Programa que coge un DNi sin número y calcula su letra

import java.util.Scanner ;

public class Ejercicio33 {
    public static void main(String[] args) {

        int dni ;
        Scanner lector = new Scanner(System.in) ;
        String[] array = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"} ;

        System.out.println("Dame un DNI y te daré la versión española del mismo:") ;
        dni = lector.nextInt() ;

        lector.close() ;
        
        System.out.println("El DNI es: "+dni+array[dni%23]) ;
    }
}
