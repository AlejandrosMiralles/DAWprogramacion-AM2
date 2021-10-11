/*Programa para recibir un nota (entre 0 y 10) y saber si se ha aprobado, suspendido y con qué*/

import java.util.Scanner ;

class Ejercicio14{
	public static void main(String[] args){

        byte nota ;

        Scanner inputValue ;
        inputValue = new Scanner(System.in) ;

        System.out.println("Dame una nota y te diré si es un sobresaliente,un notable,etc,:") ;
        nota = inputValue.nextByte() ;

        inputValue.close() ;

        switch (nota){
            case 1:
            case 2:
            case 3:
            case 4: System.out.println(nota+" es un suspenso.") ;
                    break ;
            case 5: System.out.println(nota+" es un suficiente. Felicidades por aprobar.") ;
                    break ;
            case 6: System.out.println(nota+" es un bien");
                    break ;
            case 7:
            case 8: System.out.println(nota+" es un notable.") ;
                    break ;
            case 9:
            case 10: System.out.println(nota+" es un sobresaliente.") ;
                    break ;
            default: System.out.println("La nota debe estar entre el 0 y el 10 y ser un número natural."+nota+" no lo es.") ;
        
        }




    }
}