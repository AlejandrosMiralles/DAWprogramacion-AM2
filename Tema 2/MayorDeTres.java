import java.util.Scanner;
 
public class MayorDeTres {
    public static void major(int x, int y, int z){
        if (x>y && x>z){
            System.out.println(x);
        }else if (y>z){
            System.out.println(y);
        }else{
            System.out.println(z);
        }
    }    

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in) ;
        
        System.out.println("Give me 3 numbers and I'll return you the highest one:");
        major(input.nextInt(), input.nextInt(), input.nextInt()) ;
        input.close();
    }
}
