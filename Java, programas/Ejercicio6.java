import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        double radius ;
        double length ;
        double area ;
        final double PI= 3.14159 ;

        Scanner inputValue ; 
        inputValue = new Scanner(System.in);
        
        System.out.println("Enter the radius:") ;
        radius = inputValue.nextFloat() ;

        inputValue.close() ;

        length = 2 * PI * radius;
        area = PI * radius * radius ;

        System.out.println("lenght: "+ length);
        System.out.println("Area:"+ area) ;
    }
}
