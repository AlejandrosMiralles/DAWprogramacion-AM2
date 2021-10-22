//Program that translates a binary to a decimal.

import java.util.Scanner ;
import java.lang.Math ;

public class Ejercicio44 {
    public static void main(String[] args) {
        String numBin ;
        int numDec = 0 ;
        boolean binary = true ;
        Scanner input = new Scanner(System.in) ;

        System.out.println("Give me a binary number(only an enter positive) and I will return you that number in decimal:");
        numBin = input.next() ;
        input.close() ;

        for (int i=0 ; i<numBin.length() ; ++i){
            if ('1'== numBin.charAt(i)){
                numDec+= Math.pow(2.0, (double)(numBin.length()-1-i)) ;
            }else if ('0'!= numBin.charAt(i)){
                binary = false ;
            }
        }
        if (binary){
            System.out.println("Decimal: "+numDec);
        }else{
            System.out.println("Dame solo el número binario.");
        }
    }
}
