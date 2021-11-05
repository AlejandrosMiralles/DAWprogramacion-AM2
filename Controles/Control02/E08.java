package Control02;

import java.util.Scanner; 

public class E08 {
    public static void main(String[] args) {
        float numero;
        int numeroint;
        Scanner input =new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        numero = input.nextFloat();
        input.close();

        if (numero<0){
            numero*=-1;
        }
 
        numeroint = (int)numero ;

        System.out.println(numero-numeroint);
        System.out.println(13-13.19);
    }
}
