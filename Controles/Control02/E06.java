package Control02;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el cateto a: ");
        a = input.nextDouble();

        System.out.print("Ingrese el cateto b: ");
        b = input.nextDouble() ;

        input.close();

        c= Math.pow(a, 2)+Math.pow(b, 2) ;
        c= Math.pow(c, 0.5);

        System.out.println("La hipotenusa es "+c);
    }
}
