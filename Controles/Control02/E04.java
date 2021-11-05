package Control02;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        double pulgada, centimetro;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese longitud: ");
        centimetro = input.nextDouble();
        input.close();

        pulgada = centimetro / 2.54;
        System.out.println(centimetro+" cm = "+pulgada+" in");
    }
}