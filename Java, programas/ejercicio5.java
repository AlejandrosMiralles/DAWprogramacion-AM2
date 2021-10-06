import java.util.Scanner;

class Ejemplo5 { 
	public static void main(String args[]) { 
		float número1 ;
		float número2 ;
		float suma ;
		float resta ;
		float multiplicación ;
		float división ;

		Scanner inputValue;
		inputValue = new Scanner(System.in);

		System.out.println("Introduzca un número:");
		número1 = inputValue.nextFloat();

		System.out.println("Introduzca otro número:");
		número2 = inputValue.nextFloat();

		suma = número1 + número2 ;
		resta= número1 - número2 ;
		multiplicación = número1 * número2 ;
		división = número1 / número2 ;

		System.out.println("Suma="+suma);
		System.out.println("Resta="+resta);
		System.out.println("Multipllicación="+multiplicación);
		System.out.println("División="+división);

		inputValue.close() ;
	}
}
