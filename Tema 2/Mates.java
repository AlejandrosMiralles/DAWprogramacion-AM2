import java.util.Scanner ;

public class Mates {
    public static double suma(double x, double y) {
        return x+y ;
    }   
    public static double resta(double x, double y) {
        return x-y ;
    } 
    public static double multiplicacion(double x, double y) {
        return x*y ;
    }
    public static double division(double x, double y) {
        return x/y ;
    }


    public static void main(String[] args) {
        double x, y ;
        Scanner input = new Scanner (System.in) ;

        System.out.println("Give me two numbers:");
        x = input.nextDouble();
        y = input.nextDouble();
        input.close();

        System.out.println("Suma: "+suma(x,y)) ;
        System.out.println("Resta: "+resta(x,y)) ;
        System.out.println("Multiplicación: "+multiplicacion(x,y)) ;
        System.out.println("División: "+division(x,y)) ;
    }
}