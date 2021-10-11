/*Programa que coge una hora, un minuto y un segundo, y devuelve la misma hora, pero con un segundo más*/

import java.util.Scanner ;

public class Ejercicio18 {
    public static void main(String[] args) {
        int hora, minuto, segundo ;
        Scanner lector = new Scanner(System.in) ;

        System.out.println("Escribeme una hora, un minuto y un segundo, en ese orden:") ;

        hora= lector.nextInt() ;
        minuto = lector.nextInt() ;
        segundo = lector.nextInt() ;        

        lector.close();

        if (segundo>=60 || minuto>=60){
            System.out.println("Los segundos y los minutos, lógicamente, no pueden superar las 60 unidades.") ;

        }else{
            ++segundo ;

            
            if (segundo == 60){ 
                segundo = 0 ;
                ++minuto ;

                if (minuto == 60){
                    minuto = 0 ;
                    ++hora ;
                }
            }
            System.out.println("El tiempo es: "+hora+" horas, "+minuto+" minutos, "+segundo+" segundos.") ;
        }    
    }
    
}
