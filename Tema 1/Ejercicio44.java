//Program that translates a binary to a decimal.

import java.util.Scanner ;
import java.lang.Math ;

public class Ejercicio44 {
    public static void main(String[] args) {
        
        int numDec = 0 , numBin, remainder ;
        Scanner input = new Scanner(System.in) ;

        System.out.println("Give me a binary number(positive or negative) and I will return you that number in decimal:");
        numBin = input.nextInt() ;
        input.close() ;

        if (numBin == 0 || numBin == 1){
            numDec = numBin ;

        }else{
            for (int i= (int) Math.log10(numBin) ; i>= 0 ; --i){
                remainder = numBin % (int) Math.pow(10.0, (double)i) ;
                numBin /= Math.pow(10.0, (double)i) ;

                if (remainder==0){
                    numDec+= Math.pow(2.0, (double)i) ;
                }
            }
        }
        System.out.println("Binary: "+numDec);
    }
}
