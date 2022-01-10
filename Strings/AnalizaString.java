import java.util.Scanner;

public class AnalizaString {
    public static void main(String[] args) {
        int letter = 0, digit = 0, extra = 0;
        String phrase;
    
        Scanner input = new Scanner(System.in);

        phrase = input.nextLine();
        input.close();
    
    //    phrase = "1234590áéíóúñAaz +-*/¿";

        char character;
        for (int i = 0; i < phrase.length(); i++) {
            character = phrase.charAt(i);
            
    
            if (Character.getNumericValue(character) < 10 && Character.getNumericValue(character) >= 0){
                digit++;
            }else if (Character.getNumericValue(character) < 37 && Character.getNumericValue(character) >= 10){
                letter++;
            }else if(Character.toLowerCase(character) == 'á' || Character.toLowerCase(character) == 'é' ||
                    Character.toLowerCase(character) == 'í' || Character.toLowerCase(character) == 'ó' ||
                    Character.toLowerCase(character) == 'ú' || Character.toLowerCase(character) == 'ñ'){
                letter++;
    /*
            if (Character.isDigit(character)){
                digit++;
            }else if (Character.isLetter(character)){
                letter++;

        Este código está mejor hecho. Más  conciso y MUCHO más fácil de leer
    */
    
            }else{
                extra++;
            }
        }

        System.out.println("Digitos: "+digit+"\nLetras: "+letter+"\nOtros: "+extra);
    }
}