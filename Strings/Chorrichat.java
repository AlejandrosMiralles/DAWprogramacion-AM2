import java.util.Scanner;

public class Chorrichat{
    public static Scanner user = new Scanner(System.in);

    public static boolean greeting() {
        String phrase;

        phrase = user.nextLine();
        phrase = phrase.toLowerCase();

        if (phrase.equals("hola") || phrase.equals("buenas")
            || phrase.equals("buenos dias")){
                System.out.println("Hola, soy Chorri, tu asistente personal.");
                return true;
        }else{
            System.out.println("Eres una persona maleducada.");
            return false;
        }
    }

    public static boolean sayGoodbye() {
        String phrase;

        phrase = user.nextLine();
        phrase = phrase.toLowerCase();

        if (!(!phrase.equals("chao") && !phrase.equals("adios") && !phrase.equals("bye")
            && !phrase.equals("ta luego"))){
                System.out.println("Ha sido un placer, bebé.");
                return true;
        }else{
            System.out.println(reply());

            return false;
        }
    }

    public static String reply() {
        String answer;
        int option = (int) (Math.random() * (3 - 1 + 1) + 1);

        switch(option){
            case 1: answer = "Mmmm...., es un tema interesante.";
                break;
            case 2: answer = "No he entendido lo que dices.";
                break;
            default:
                answer= "Noooo habloooo tu idioma";
        }

        return answer;
    }

    public static void main(String[] args) {

        while (!greeting()){}
        while (!sayGoodbye()){}

        user.close();
    }
}