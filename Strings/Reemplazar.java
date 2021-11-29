import java.util.Scanner;

public class Reemplazar {
    public static void main(String[] args) {
        String cadena;
        char aremplazar, por;
        Scanner input = new Scanner(System.in);

        System.out.println("Dame una cadena: ");
        cadena= input.nextLine();

        System.out.println("Qué letra quieres reemplazar?:");
        aremplazar= input.next().charAt(0);
        System.out.println("Por qué letra la quieres cambiar?: ");
        por= input.next().charAt(0);

        input.close();

        cadena= cadena.replace(aremplazar, por);

        System.out.println(cadena);
    }
}
