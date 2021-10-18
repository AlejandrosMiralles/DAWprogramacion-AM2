import java.util.Scanner ;

public class Ejercicio39 {
    public static void main(String[] args) {

        int numero ;
        int[] listaDivisores = {-1}, listaEditable = new int[1] ;
        Scanner lector = new Scanner(System.in) ;

        System.out.println("Dame un número natural y te digo sus divisores:");
        numero = lector.nextInt() ;

        lector.close() ;

        if (numero>1){ //Divido el número entre todos a no ser que sea el 1, el 0 o un número negativo
            for (int divisor=1; divisor<numero; ++divisor){
                if (numero%divisor == 0){

                    if (listaDivisores[0]==-1){
                        listaDivisores[0]= divisor ;
                        listaEditable[0] = divisor ;
                    }else{
                        listaEditable = new int[listaDivisores.length+1] ;

                        for (int i=0; i<listaDivisores.length; ++i){
                            listaEditable[i]= listaDivisores[i] ;
                        }
                        listaEditable[listaEditable.length-1] = divisor ;

                        listaDivisores = java.util.Arrays.copyOfRange(listaEditable, 0, listaEditable.length) ;
                    }
                }
            } //Aquí ya tengo una lista de los divisores de un numero.

            //Aquí imprimo esa lista.
            System.out.print("Los divisores de "+numero+" son: ");
            for (int divisor : listaDivisores){
                System.out.print(divisor+", ") ;
            }
            System.out.println(numero+".");
            
        
        }else{
            if (numero<0){
                System.out.println("Debes darme un número natural. El "+numero+" es un número negativo.") ;
            }else if(numero ==1){
                System.out.println("Es el 0. Todos los números pueden dividir al 0.") ;
            }else{
                System.out.println("El número sólo tiene un divisor, él mismo.") ;
            }
        }
    }
}
