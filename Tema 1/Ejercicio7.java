/*Programa para descubrir el descuento a partir del precio original y el rebajado*/

import java.util.Scanner ;

public class Ejercicio7 {

    public static void main(String[] args) {    

        Scanner inputValue ;
        inputValue = new Scanner(System.in) ;

        float precio ;
        System.out.println("Introduce el precio real:") ;
        precio = inputValue.nextFloat() ;

        float precioRebajado ;
        System.out.println("Introduce el precio rebajado:") ;
        precioRebajado = inputValue.nextFloat() ;

        inputValue.close() ;

        if (precio>= precioRebajado){
            float descuento ;
            descuento = ( precio - precioRebajado) / precio * 100 ;
    
            System.out.println("Descuento="+descuento+"%") ;
        }else{
            System.out.println("El precio no puede ser más barato que el precio rebajado. Te han timado!") ;
        }
     }                
}
