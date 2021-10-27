import java.util.Scanner;

public class Descendente {

    public static void descendent(int x, int y) {
        if (x>y){
            System.out.println("\n\n"+x+"\n"+y+"\n");
        }else{
            System.out.println("\n\n"+y+"\n"+x+"\n");
        } 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Give me you numbers and I'll return them in descendent sequence: ");
        descendent(input.nextInt(), input.nextInt()) ;
        input.close() ;
    }
}