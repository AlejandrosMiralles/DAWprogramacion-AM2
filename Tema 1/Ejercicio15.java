/*Programa para recibir un número natural (entre el 0 y el 10) y escribe el número en letra*/

import java.util.Scanner ;

class Ejercicio15{
	public static void main(String[] args){

        byte numero ;

        Scanner inputValue ;
        inputValue = new Scanner(System.in) ;

        System.out.println("Dame un número y te diré su escritura:") ;
        numero = inputValue.nextByte() ;

        inputValue.close() ;

        switch (numero){
            case 0: System.out.println("Cero") ;
                    break ;
            case 1: System.out.println("Uno") ;
                    break ;
            case 2: System.out.println("Dos") ;
                    break ;
            case 3: System.out.println("Tres") ;
                    break ;
            case 4: System.out.println("Cuatro") ;
                    break ;
            case 5: System.out.println("Cinco") ;
                    break ;
            case 6: System.out.println("Seis");
                    break ;
            case 7: System.out.println("Siete") ;
                    break ;
            case 8: System.out.println("Ocho") ;
                    break ;
            case 9: System.out.println("Nuewe") ;
                    break ;
            case 10: System.out.println("Diez") ;
                    break ;
            default: System.out.println("El número debe estar entre el 0 y el 10 y ha de ser un número natural."+numero+" no lo es.") ;
        
        }
    }
}