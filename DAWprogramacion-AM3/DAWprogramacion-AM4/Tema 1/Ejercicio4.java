import java.util.Scanner;

class Ejercicio4{
	public static void main  (String  argv[]) {
	float side;
	float squarearea;

	System.out.println("Enter the size:");

	Scanner inputValue;
	inputValue = new Scanner (System.in);

	side =  inputValue.nextFloat();

	inputValue.close() ;

	squarearea= side * side;
	System.out.println(squarearea);
	}
}

