import java.util.Scanner;

//Programa que transforma números decimales en binario

public class Ejercicio44 {
    public static void main(String[] args) {

        int numBin=0, numDec, repeticiones ;
        Scanner lector = new Scanner(System.in) ;

        System.out.println("Dame un número y te devuelvo ese mismo número, pero en binario:") ;
        numDec = lector.nextInt() ;
        lector.close() ;

        repeticiones = numDec / 2 ;

        if (numDec == 1 || numDec == 0){
            numBin = numDec ;
        }else{
            for (int i = repeticiones; i>=0; --i){
                numBin = (numDec%2)*10^i ;
                numDec /= 2 ;
            }
        }

        System.out.println(numBin) ;
    }
}
