import java.util.Scanner ;

public class Ejercicio24 {

    public static void main(String[] args) {

        float nota = 0, media = 0;
        int contador = -1 ;
        boolean supersobresaliente = false ;
        Scanner lector = new Scanner(System.in) ;

        System.out.println("Vamos a hacer la media de una serie de notas. Si quieres terminar el programa, dame un número negativo o superior a 10.") ;
        
        do{
            System.out.println("Dame una nota:") ;



            ++contador ;

            media= media+nota ;

            if (nota==10){
                supersobresaliente = true ;
            }

            nota = lector.nextFloat() ;
        }while(0<=nota && 10>=nota) ;

        if (contador!=0){
            media= media/contador ;
            System.out.println("La media es "+media+".") ;
        }else{
            System.out.println("No has puesto ninguna nota, por lo que no hay media.") ;
        }
        
        if (supersobresaliente){
            System.out.println("Ha habido un 10!! Increible.") ;
        }
        
        lector.close() ;
    }  
}