//Adivinar un número random

import java.util.Scanner;
import java.util.Random ;

public class Ejercicio46 {
    public static void main(String[] args) {

        Random randomnum = new Random() ;
        int candidate, secretnumber = randomnum.nextInt(100-1+1) + 1 ;
        Scanner input = new Scanner(System.in) ;

        System.out.println("Let's play a game. I think a number,a secret number, and you have to guess it. ");
        System.out.println("If you want to give up, type '-1'.");
        System.out.println(secretnumber);

        do{
            System.out.println("Give me a number:");
            candidate = input.nextInt() ;

            if (candidate == -1){
                System.out.println("You have gaven up. The secret number is: "+secretnumber);
            }else if (candidate<0){
               System.out.println("The lowest possible value of the secret number is 0.") ;
            }else if (candidate==secretnumber){
                System.out.println("Congratulations. You guess the number");
            }else if (candidate>100){
                System.out.println("The max. possible value of number is 100.");
              
            }else if (candidate<secretnumber){
                System.out.println("The secret number is higher than "+candidate);
            }else{
                System.out.println("The secret numer is lower than "+candidate);
            }
        }while(candidate!= -1 && candidate!=secretnumber) ;
        input.close() ;
    }
}