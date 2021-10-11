import java.util.Scanner ;

public class Ejercicio23 {
    public static void main(String[] args) {
        int contador = 0, numero, repeticiones ;
        Scanner lector = new Scanner (System.in) ;

        System.out.println("Cuántos números vas a introducir? Los números negativos equivalen a 0:") ;
        repeticiones = lector.nextInt() ;

        System.out.println("Si te arrepientes y quieres terminar el programa, escribe el número 0.") ;

        for (int i = 0; i < repeticiones; ++i){

            System.out.println("Dame un número:") ;
            numero = lector.nextInt() ;

            if (numero==0){
                break ;
            }
            
            if (numero>=0){
                ++contador ;
            }
        }

        lector.close() ;

        System.out.println("Me has dado "+contador+" números positivos.") ;
    }   
}
