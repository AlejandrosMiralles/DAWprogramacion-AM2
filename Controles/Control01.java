//Programa que calcula el perímetro de un polígono equilatrero si, y sólo si, tiene tres o cuatro lados

import java.util.Scanner ;

public class Control01 {
    public static void main(String[] args) {

        int numero_de_lados ;
        Scanner lector = new Scanner(System.in) ;

        System.out.println("Dime el número de lados del polígono:")
        numero_de_lados= lector.nextInt() ;

        if (numero_de_lados == 3 || numero_de_lados == 4){
            int lado ;

            System.out.println("Dime la longitud del lado del polígono:") ;
            
            lado = lector.nextInt() ;

            if (numero_de_lados == 3){
                System.out.println("El perímetro del triángulo es "+lado*3) ;
            }else {
                System.out.println("El perímetro del cuadrado es")
            }
        }



    }
}
