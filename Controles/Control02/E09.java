package Control02;

import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        double C1,C2, C3, NL;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese nota C1: ");
        C1 = input.nextDouble();
        System.out.print("Ingrese nota C2: ");
        C2 = input.nextDouble();
        System.out.print("Ingrese nota laboratorio: ");
        NL = input.nextDouble();

        input.close();
        
        C3 = (60- (C1+C2)*(0.7/3) - NL*0.3)/(0.7/3);


        System.out.println("Necesita nota "+C3+" en el certamen 3");
    }
}
