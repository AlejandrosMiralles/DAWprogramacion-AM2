//Programa que coge un DNi sin número y calcula su letra

import java.util.Scanner ;

public class Ejercicio33 {
    public static void main(String[] args) {

        int dni , resto ;
        Scanner lector = new Scanner(System.in) ;


        System.out.println("Dame un DNI y te daré la versión española del mismo:") ;
        dni = lector.nextInt() ;

        resto = dni%23 ;

        switch (resto){
            case 0: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            case 1: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            case 2: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            case 3: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            case 4: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            case 5: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            case 6: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            case 7: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            case 8: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            case 9: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            case 10: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            case 11: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            case 12: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            case 13: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            case 14: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            case 15: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            case 16: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            case 17: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;case 0: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            }
        }
    }
}
