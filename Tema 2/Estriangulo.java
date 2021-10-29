import java.util.Scanner;

public class Estriangulo {
    public static boolean canbe(int x, int y, int z){
        if (x>y+z || y>x+y || z>x+y){
            return false ;
        }else{
            return true ;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Give 3 sides of an triangle, and I'll tell ypu if they can form a triangle:");
        if (canbe(input.nextInt(), input.nextInt(), input.nextInt())){
            System.out.println("They can form a triangle.");
        }else{
            System.out.println("They can't form a triangle.");
        }
        input.close() ;
    }
}
