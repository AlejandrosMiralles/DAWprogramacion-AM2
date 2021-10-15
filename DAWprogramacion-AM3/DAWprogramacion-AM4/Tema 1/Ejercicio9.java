/*Programa para saber si uno tiene mayoría de edad o es menor de edad*/

import java.util.Scanner ;

public class Ejercicio9 {
    public static void main(String[] args) {
        byte age ;

        Scanner inputValue ;
        inputValue = new Scanner(System.in);

        System.out.println("Enter your age:") ;
        age = inputValue.nextByte() ;

        inputValue.close() ;

        if (age>=18){
            System.out.println("You have the legal age") ;
        }else{
            System.out.println("You don't have the legal age") ;
        }
    }    
}
