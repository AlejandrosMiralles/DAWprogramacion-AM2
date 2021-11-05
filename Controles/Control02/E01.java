package Control02;

import java.util.Scanner;

public class E01{
    public static void main(String[] args) {
        String nombre ;
        Scanner input = new Scanner(System.in) ;

        System.out.println("Ingrese su nombre:");
        nombre = input.next() ;
        input.close();

        System.out.println("Hola "+nombre);
    }
}