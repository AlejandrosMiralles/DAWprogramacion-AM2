//Programa que imprime todos los números primos desde el 3 hasta el 100

public class Ejercicio29 {
    public static void main(String[] args) {

        boolean primo ;
        System.out.println("Aquí tienes una lista de todos los números primos desde el 3 hasta el 100:") ;
    
        for (int posible_primo=3; posible_primo < 100; posible_primo= posible_primo+2){
            //Mira todos los posibles números primos entre el 3 y el 100

            primo = true ;

            for(int i=3; i<posible_primo; i = i+2){
            //Comprueba si el número es primo y lo imprime
                if (posible_primo%i == 0){
                    primo=false ;
                    break ;
                }
            }
            
            if (primo){
                System.out.println(posible_primo) ;
            }
        }
    }
}
