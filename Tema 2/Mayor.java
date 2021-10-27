import java.util.Scanner ;

public class Mayor {

    public static void adult(int age) {
        if (age>=18){
            System.out.println("U are, or you have been, an adult");
        }else if (age<18 && age>=0){
            System.out.println("You are still a child");
        }else{
            System.out.println("You bitch, don't lie to me.");
        }
    }
    public static void main(String[] args) {
        int age ;
        Scanner output = new Scanner(System.in);

        System.out.println("Give me your age:") ;
        age = output.nextInt();
        output.close() ;

        adult(age);
    }
}
