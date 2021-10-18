import java.util.Scanner ;

public class Ejercicio37 {
    public static void main(String[] args) {
        int candidato, mayor, menor ;
        Scanner lector = new Scanner(System.in) ;

        System.out.println("Me vas a dar 10 números y yo te voy a devolver el mayor de ellos.\nDame un número:") ;
        mayor = lector.nextInt() ;
        menor = mayor ;

        for (int i=0; i<3; ++i){
            System.out.println("Dame otro número;") ;
            candidato = lector.nextInt() ;

            if (candidato>mayor){
                mayor = candidato ;
            }else if(candidato<menor){
                menor = candidato ;
            }
        }
        lector.close() ;

        System.out.println("El mayor número es el "+mayor+". Y el menor número es el "+menor) ;
    }
}
