import java.util.Scanner ;

public class Ejercicio5 {
	public static void main(String args[]) {
		int numero1;
		int numero2;
		int suma ;
		int resta ;
		int multiplicacion ;
		int division ;
		
		Scanner inputValue ;
		inputValue = new Scanner(System.in) ;
		
		System.out.println("Introduzca un número:") ;
		numero1= inputValue.nextInt() ;
		
		System.out.println("Introduzca un segunda número") ;
		numero2= inputValue.nextInt() ;

		inputValue.close() ;
		
		suma= numero1 + numero2 ;
		resta= numero1 - numero2 ;
		multiplicacion = numero1 * numero2 ;
		division = numero1 / numero2 ;
		
		System.out.println(suma) ;
		System.out.println(resta) ;
		System.out.println(multiplicacion);
		System.out.println(division) ;
	}
}

