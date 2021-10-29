import java.util.Scanner;

public class Positivos {
    public static void positive(int x){
        if (x>=0){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        
        System.out.println("Give me 10 numbers.");
        for (int i=0; i<10; ++i){
            positive(input.nextInt());
        }
        input.close() ;
    }
}