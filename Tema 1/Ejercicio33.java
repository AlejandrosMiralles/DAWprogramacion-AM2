//Programa que coge un DNi sin número y calcula su letra

import java.util.Scanner ;

public class Ejercicio33 {
    public static void main(String[] args) {

        int dni ;
        Scanner lector = new Scanner(System.in) ;
        String[] array = new String[23] ;

        System.out.println("Dame un DNI y te daré la versión española del mismo:") ;
        dni = lector.nextInt() ;

        lector.close() ;

        //Defino el array, que dará la letra según el resto del DNI

        array[0] = "T" ;
        array[1] = "R" ;
        array[2] = "W" ;
        array[3] = "A" ;
        array[4] = "G" ;
        array[5] = "M" ;
        array[6] = "Y" ;
        array[7] = "F" ;
        array[8] = "P" ;
        array[9] = "D" ;
        array[10] = "X" ;
        array[11] = "B" ;
        array[12] = "N" ;
        array[13] = "J" ;
        array[14] = "Z" ;
        array[15] = "S" ;
        array[16] = "Q" ;
        array[17] = "V" ;
        array[18] = "H" ;
        array[19] = "L" ;
        array[20] = "C" ;
        array[21] = "K" ;
        array[22] = "E" ;
        
        System.out.println("El DNI es: "+dni+array[dni%23]) ;
    }
}
