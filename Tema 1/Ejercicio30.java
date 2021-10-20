//Programa que descubre si una frase es palíndroma o no. (Usar length())

import java.util.Scanner ;

public class Ejercicio30 {
    public static void main(String[] args) {
        boolean palindromo ;
        int i, j ;
        String cadena ;
        Scanner lector = new Scanner(System.in) ;

        System.out.println("Dame una palabra o una frase y te digo si es palíndroma o no:");
        cadena = lector.nextLine() ;
        lector.close() ;


        i = 0 ; //el i sirve para coger las letras del principio y la j las del final
        j = cadena.length()-1 ;
        palindromo = true ;

        while(i<cadena.length()){
            if (cadena.charAt(i) != ' ' && cadena.charAt(j) != ' '){
                if (cadena.charAt(j) != cadena.charAt(i)){
                    palindromo= false ;
                    break ;
                }
                ++i ;
                --j ;
            }else{
                if (cadena.charAt(i) == ' '){
                    ++i ;
                }else{
                    --j ;
                }
            }
        }

        if (palindromo){
            System.out.println(cadena+" es un palíndromo!");
        }else{
            System.out.print(cadena+" no es un palíndromo. Así se escribe al revés: ");
            for (int x=cadena.length()-1; x>= 0; --x){
                System.out.print(cadena.charAt(x));
            }
            System.out.println("");
        }
    }
}