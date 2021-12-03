//a= 10 y z= 35. Las mayúsculas valen lo mismo que las minúsculas
//Los digitos son iguales

//import java.util.Scanner;

public class Encriptar {
    //Hago dos funciones distintas porque debo diferenciar entre digitos y letras. 
    //Me lo piden
    public static char encripDigitos(char digito, int clave) {
        int utfOcho = Character.getNumericValue(digito);

        return Character.forDigit((utfOcho+clave)%10, 10);
    }

    public static char encripLetra(char letra, int clave) {
        int utfOcho = Character.getNumericValue(letra);
        char codificado;
        boolean highCase = false;

        if (Character.isUpperCase(letra)){
            highCase = true;
        }

        codificado =  Character.forDigit(((utfOcho+clave)%26)+10, 36);

        if (highCase){
            codificado = Character.toUpperCase(codificado);
        }

        return codificado;
    }

    public static void main(String[] args) {
        String cadena;
       // Scanner input = new Scanner(System.in);
        int clave = 33, utfOcho;
        char encriptado;

        cadena = "Una de las tecnicas de criptografia mas rudimentarias consiste en sustituir cada uno de los caracteres por otro situado n posiciones mas a la derecha del abecedario. Si n = 2, sustituiremos la 'a' por la 'c', la 'b' por la 'd', y asi sucesivamente. El problema que aparece con las ultimas n letras del alfabeto tiene facil solucion: en el ejemplo, la letra 'y' se sustituye por la 'a' y la 'z' por la 'b'. La sustitucion debe aplicarse a las letras minusculas y mayusculas y a los digitos. Las letras no deben incluir caracteres no ingleses (es decir sin ni acentos)";
 
        /*
        System.out.println("Dame una frase: ");
        cadena = input.nextLine();
        input.close();
*/
        for (int i = 0; i < cadena.length(); i++) {
            utfOcho = Character.getNumericValue(cadena.charAt(i));

            if (utfOcho<=9 && utfOcho>=0){
                encriptado = encripDigitos(cadena.charAt(i), clave);
            }else if (utfOcho<36 && utfOcho>0){
                encriptado= encripLetra(cadena.charAt(i), clave);
            }else{
                encriptado = cadena.charAt(i);
            }

            System.out.print(encriptado);
        }
        System.out.println("");
    }
}
