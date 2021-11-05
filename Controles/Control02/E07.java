package Control02;

import java.util.Scanner; 

public class E07 {
    public static void main(String[] args) {
        int hora, cantidad, futuro;
        Scanner input = new Scanner(System.in);        

        System.out.print("Hora actual: ");
        hora = input.nextInt();

        System.out.print("Cantidad de horas: ");
        cantidad= input.nextInt();

        input.close();

        futuro = (hora+cantidad)%12;

        System.out.println("En "+cantidad+" horas, el reloj marcara las "+futuro);
    }
}
