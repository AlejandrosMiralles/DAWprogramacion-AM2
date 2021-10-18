import java.util.Scanner ;

public class Ejercicio43 {
    public static void main(String[] args) {
        int dividendo, divisor ;
        Scanner lector = new Scanner(System.in) ;

        System.out.print("Dame el dividendo:") ;
        dividendo = lector.nextInt() ;

        System.out.print("Dame el divisor:");
        divisor = lector.nextInt() ;

        lector.close() ;
        while(dividendo>=divisor){
            dividendo-= divisor ;
        }
        System.out.println(dividendo) ;
    }
}
