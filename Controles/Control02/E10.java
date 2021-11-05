package Control02;

import java.util.Scanner;

//http://progra.usm.cl/apunte/ejercicios/1/huevos-a-la-copa.html

public class E10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double masa, densidad, capCalor, condCalor, temInic, temEbullAgua, temYema;
        double resultado ;

        masa = 47;
        densidad = 1.038 ;
        capCalor = 3.7 ; 
        condCalor = 0.0054 ;
        temEbullAgua = 100.0 + 273 ;
        temYema = 343 ;

        System.out.print("A cuántos grados está el huevo?(En Celsius): ");
        temInic = input.nextDouble() +273;
        input.close();

        resultado = Math.pow(masa, 2/3)* Math.pow(densidad, 1/3)* capCalor ;
        resultado = resultado/ (condCalor* Math.pow(Math.PI, 2)* Math.pow((4*Math.PI/3), 2/3)) ;
        resultado = resultado * ((Math.log(0.76*(temInic-temEbullAgua)/(temYema-temEbullAgua)))/Math.log(Math.E)) ;

        System.out.println("Tardará "+resultado+" segundos.");
    }    
}