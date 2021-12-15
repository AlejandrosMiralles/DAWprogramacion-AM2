import java.util.Scanner;

public class P116HolaMundo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        
        for (int i= input.nextInt(); i>0; --i){
            System.out.println("Hola mundo.");
        }
        input.close();
    }
}