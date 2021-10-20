import java.util.Scanner ;

public class Ejercicio36 {
    public static void main(String[] args) {
        int candidato, mayor ;
        Scanner lector = new Scanner(System.in) ;

        System.out.println("Me vas a dar 10 números y yo te voy a devolver el mayor de ellos.\nDame un número:") ;
        mayor = lector.nextInt() ;

        for (int i=0; i<9; ++i){
            System.out.println("Dame otro número;") ;
            candidato = lector.nextInt() ;

            if (candidato>mayor){
                mayor = candidato ;
            }
        }
        lector.close() ;

        System.out.println("El mayor número es el "+mayor) ;
    }
}
