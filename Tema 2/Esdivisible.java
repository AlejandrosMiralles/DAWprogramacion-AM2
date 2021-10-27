import java.util.Scanner;

public class Esdivisible {
    public static boolean divisible(int x, int y){
        if (x%y==0){
            return true ;
        }else{
            return false ;
        }
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in) ;

       System.out.println("Give me 2 numbers and I'll tell if the first number can divide the second one:");
       if (divisible(input.nextInt(), input.nextInt())){
           System.out.println("Is divisible.");
       }else{
           System.out.println("Isn't divisible.");
       }
       input.close();
    }
}