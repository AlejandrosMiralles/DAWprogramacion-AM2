package Control02;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        int nota1, nota2, nota3, nota4 ;
        double media;
        Scanner input = new Scanner(System.in) ;

        System.out.print("Primera nota: ") ;
        nota1 = input.nextInt() ;
        System.out.print("Segunda nota: ") ;
        nota2 = input.nextInt() ;
        System.out.print("Tercera nota: ") ;
        nota3 = input.nextInt() ;
        System.out.print("Cuarta nota: ") ;
        nota4 = input.nextInt() ;
        
        input.close();

        media = nota1+nota2+nota3+nota4 ;
        media/= 4 ;
        System.out.println("El promedio es: "+media);
    }
}
