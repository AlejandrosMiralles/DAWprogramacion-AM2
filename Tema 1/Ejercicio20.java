import java.util.Scanner ;

public class Ejercicio20 {
    public static void main(String[] args) {

        double preciobase, preciofinal ;
        Scanner lector = new Scanner(System.in) ;

        System.out.println("¿Cuál es el precio base del producto? :") ;
        preciobase = lector.nextDouble() ;

        lector.close();

        if (preciobase < 6){
            preciofinal = preciobase ;
        }else if(preciobase < 60){
            preciofinal = preciobase * 0.95 ;
        }else{
            preciofinal = preciobase * 0.90 ;
        }

        System.out.println("El precio final de ese producto es de "+preciofinal+" euros.") ;
    }
}
