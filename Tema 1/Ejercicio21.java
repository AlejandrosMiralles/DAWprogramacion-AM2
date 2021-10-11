import java.util.Scanner ;

public class Ejercicio21 {
    public static void main(String[] args) {

        int año ;
        boolean bisiesto ;
        Scanner lector = new Scanner(System.in) ;
    
        System.out.println("Dame un año y te digo si es bisiesto o no:") ;
        año = lector.nextInt() ;
    
        lector.close() ;

        if ((año%400 == 0) || (año%100 != 0 && año%4 == 0)){
            bisiesto = true ;
        }else{
            bisiesto = false ;
        }

        System.out.print("El año "+año) ;
        if (bisiesto){
            System.out.println(" es bisiesto.") ;
        }else{
            System.out.println(" no es bisiesto.") ;
        }
    }
}
