package Control02;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        int numero;
        Scanner input= new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        numero = input.nextInt();
        input.close();

        System.out.print(numero%10);
        numero/=10;
        System.out.print(numero%10);
        numero/= 10 ;
        System.out.print(numero) ;
    }
}
