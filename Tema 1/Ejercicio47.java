//Programa que recibe 5 cadenas y las muestra con una cadena

import java.util.Scanner ;

public class Ejercicio47 {
    public static void main(String[] args) {

        String mayor = "" ;
        String[] cadena = new String[5] ;
        Scanner lector = new Scanner(System.in) ;

        System.out.print("Dame 5 palabras:");
        for (int i=0; i<5; ++i){
            cadena[i] = lector.next() ;
        }

        lector.close() ;

        //Calculo la palabra con mayor carácteres

        for (int i=0; i<5; ++i){
            if (cadena[i].length()>mayor.length()){
                mayor = cadena[i] ;
            }
        }

        /*
        Impresión!
        */

        for (int i=0; i<mayor.length()+4; ++i){
            System.out.print('*');
        }
        System.out.println("");
        for (int i=0; i<5; ++i){
            System.out.print("* "+cadena[i]);
            for (int j=0; mayor.length()-cadena[i].length()>j; ++j){
                System.out.print(' ');
            }
            System.out.println(" *");
        }
        for (int i=0; i<mayor.length()+4; ++i){
            System.out.print('*');
        }
        System.out.println("");
    }
}