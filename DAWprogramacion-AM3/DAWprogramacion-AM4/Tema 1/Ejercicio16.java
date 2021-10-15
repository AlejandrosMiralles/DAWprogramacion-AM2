import java.util.Scanner ;

public class Ejercicio16 {
	public static void main(String args[]) {
		int numero1;
		int numero2;
		int resultado ;
        String opcion ;
		Scanner inputValue = new Scanner(System.in) ;
		

		System.out.println("Introduzca un número:") ;
		numero1 = inputValue.nextInt() ;
		
		System.out.println("Introduzca un segundo número") ;
		numero2 = inputValue.nextInt() ;

        System.out.println("\nIntroduce una de las siguientes operaciones:\nSuma(+)\nResta(-)\nDivisión(/)\nMultiplicación(*)\nEscoge las opciones con el signo correspondiente:") ;
        opcion = inputValue.next() ;

		inputValue.close() ;

        switch (opcion){
            case "+": 
                resultado= numero1 + numero2 ;
                System.out.println("Sum: "+resultado) ;
                break ;
            case "-": 
                resultado= numero1 - numero2 ;
                System.out.println("Resta: "+resultado) ;
                break ;                      
            case "/": 
                resultado= numero1 / numero2 ;
                System.out.println("División: "+resultado) ;
                break ;
            case "*": 
                resultado= numero1 * numero2 ;
                System.out.println("Multiplicación: "+resultado) ;
                break ;
            default: 
                System.out.println("Escribe únicamente uno de los 4 caracteres") ;
        }
	}
}

