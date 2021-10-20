import java.util.Scanner ;

public class Ejercicio38 {
    public static void main(String[] args) {
        int contador = 0 ;
        String cadena ;
        char letra ;
        Scanner lector = new Scanner(System.in) ;

        System.out.println("Dame una cadena de texto y te digo cuantas vocales tiene(los acentos no se cuentan)") ;
        cadena = lector.nextLine() ;

        lector.close() ;

        for (int i=0; i<cadena.length(); ++i){
            letra = cadena.charAt(i) ;
            letra = Character.toLowerCase(letra);

            if (letra== 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                ++contador ;
            }
            
        }

        System.out.println("Hay "+contador+" vocales.") ;

    }
}
