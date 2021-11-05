package Control02;

import java.util.Scanner;

public class E02 {

    public static void main(String[] args) {
        double radius, area, perimetro ;
        Scanner input = new Scanner(System.in) ;    

        System.out.print("Ingrese el radio: ") ;
        radius = input.nextDouble() ;
        input.close() ;

        perimetro = 2* radius* Math.PI ;
        area = Math.PI * Math.pow(radius, 2);

        System.out.println("Perimetro: "+perimetro) ;
        System.out.println("Area: "+area) ;

    }
}
