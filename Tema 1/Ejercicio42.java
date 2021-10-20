import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        int x, y, i, mult ;
        Scanner lector = new Scanner(System.in) ;


        System.out.println("Enter the number 1:");
        x = lector.nextInt();

        System.out.println("Enter number 2:") ;
        y = lector.nextInt() ;

        lector.close() ;

        mult = x ;
        i = 1 ;

        while(i<y){
            mult+= x ;
            ++i ;
        }

        System.out.println(mult);
    }
}
