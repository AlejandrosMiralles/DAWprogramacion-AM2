import java.util.Scanner;

public class JadenCase {
    public static String toJadenCase(String phrase) {
        String finalPhrase = "", word;
        Scanner input = new Scanner(phrase);

        while (input.hasNext()){
            word = input.next();
            finalPhrase += Character.toUpperCase(word.charAt(0)) +
                         word.substring(1);
            
            if (input.hasNext()) finalPhrase+= " ";
        }

        input.close();

        return finalPhrase;
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase("hola mundo qué tal el día?"));
        System.out.println(toJadenCase("Si mis ojos son azules,por qué veo sangre?"));
    }
}
