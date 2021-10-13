//Programa que coge un DNi sin número y calcula su letra

import java.util.Scanner ;

public class Ejercicio33 {
    public static void main(String[] args) {

        int dni , resto ;
        Scanner lector = new Scanner(System.in) ;


        System.out.println("Dame un DNI y te daré la versión española del mismo:") ;
        dni = lector.nextInt() ;

        lector.close() ;

        resto = dni%23 ;

        switch (resto){
            case 0: 
                    System.out.println("El DNi es: "+dni+"T") ;
                    break ;
            case 1: 
                    System.out.println("El DNi es: "+dni+"R") ;
                    break ;
            case 2: 
                    System.out.println("El DNi es: "+dni+"W") ;
                    break ;
            case 3: 
                    System.out.println("El DNi es: "+dni+"A") ;
                    break ;
            case 4: 
                    System.out.println("El DNi es: "+dni+"G") ;
                    break ;
            case 5: 
                    System.out.println("El DNi es: "+dni+"M") ;
                    break ;
            case 6: 
                    System.out.println("El DNi es: "+dni+"Y") ;
                    break ;
            case 7: 
                    System.out.println("El DNi es: "+dni+"F") ;
                    break ;
            case 8: 
                    System.out.println("El DNi es: "+dni+"P") ;
                    break ;
            case 9: 
                    System.out.println("El DNi es: "+dni+"D") ;
                    break ;
            case 10: 
                    System.out.println("El DNi es: "+dni+"X") ;
                    break ;
            case 11: 
                    System.out.println("El DNi es: "+dni+"B") ;
                    break ;
            case 12: 
                    System.out.println("El DNi es: "+dni+"N") ;
                    break ;
            case 13: 
                    System.out.println("El DNi es: "+dni+"J") ;
                    break ;
            case 14: 
                    System.out.println("El DNi es: "+dni+"Z") ;
                    break ;
            case 15: 
                    System.out.println("El DNi es: "+dni+"S") ;
                    break ;
            case 16: 
                    System.out.println("El DNi es: "+dni+"Q") ;
                    break ;
            case 17: 
                    System.out.println("El DNi es: "+dni+"V") ;
                    break ;
            case 18: 
                    System.out.println("El DNi es: "+dni+"H") ;
                    break ;
            case 19: 
                    System.out.println("El DNi es: "+dni+"L") ;
                    break ;
            case 20: 
                    System.out.println("El DNi es: "+dni+"C") ;
                    break ;
            case 21: 
                    System.out.println("El DNi es: "+dni+"K") ;
                    break ;
            default: 
                    System.out.println("El DNi es: "+dni+"E") ;
                    break ;
        }
    }
}
