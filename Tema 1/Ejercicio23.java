import java.util.Scanner ;

public class Ejercicio23 {
    public static void main(String[] args) {
        int contador = 0, numero ;
        Scanner lector = new Scanner (System.in) ;

        System.out.println("Programa que recibe un número indefinido de número, y devuelve la cantidad de positivos\nSi te arrepientes y quieres terminar el programa, escribe el número 0.") ;

        do{

            System.out.println("Dame un número:") ;
            numero = lector.nextInt() ;

            if (numero > 0){
                ++contador ;
            }
        }while(numero == 0) ;

        lector.close() ;

        System.out.println("Me has dado "+contador+" números positivos.") ;
    }   
}