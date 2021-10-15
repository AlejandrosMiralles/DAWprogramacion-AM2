/*Programa para saber si uno tiene mayoría de edad*/

import java.util.Scanner ;

public class Ejercicio8 {
    public static void main(String[] args) {
        byte age ;

        Scanner inputValue ;
        inputValue = new Scanner(System.in);

        System.out.println("Enter your age:") ;
        age = inputValue.nextByte() ;

        inputValue.close() ;

        if (age>=18){
            System.out.println("You have the legal age") ;
        }
    }    
}

