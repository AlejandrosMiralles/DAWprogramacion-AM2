import java.util.Scanner;
import java.lang.Math;

//Programa que transforma números decimales en binario

public class Ejercicio45 {
    public static void main(String[] args) {

        int numBin=0, numDec, repeticiones ;
        boolean negative = false ;
        Scanner lector = new Scanner(System.in) ;

        System.out.println("Dame un número(cuyo valor absoluto sea menor de 256.) y te devuelvo ese mismo número, pero en binario:") ;
        numDec = lector.nextInt() ;
        lector.close() ;

        if (numDec<0){
            numDec*= -1 ;
            negative = true ;
        }

        repeticiones = numDec / 2 ;

        if (numDec == 1 || numDec == 0){
            numBin = numDec ;
        }else if (numDec>255 || numDec<-255){
            System.out.println("El valor absoluto máximo es el 255. No te pases.");
        }else{
            for (int i = repeticiones; i>=0; --i){
                numBin+= (numDec%2)*Math.pow(10, repeticiones-i) ;
                numDec /= 2 ;
            }
        }
        if (negative){
            System.out.print("1 ");
        }else{
            System.out.print("0 ");
        }
        System.out.println(numBin) ;
    }
}
