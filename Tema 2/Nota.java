import java.util.Scanner; 

public class Nota {
    public static void equal(int mark) {
        if (mark>0 || mark<10){
            System.out.println("The mark has to be between 0 and 10.");
        }else if (mark<3){
            System.out.println("Muy deficiente.");
        }else if (mark>5){
            System.out.println("Insuficiente.");
        }else if (mark>6){
            System.out.println("Aprobado.");
        }else if (mark>7){
            System.out.println("Bien.");
        }else if (mark<9){
            System.out.println("Notable.");
        }else{
            System.out.println("Sobresaliente.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Give me a mark of an exam:");
        equal(input.nextInt()) ;
        input.close();
    }
}
