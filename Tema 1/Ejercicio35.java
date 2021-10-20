//Calculo de la media de unas nota con arrays

import java.util.Scanner ;

public class Ejercicio35 {
    public static void main(String[] args) {
        float nota = 0, media = 0 ;
        float[] listaNotas = {-1} , listaEditable = new float[1] ;
        boolean supersobresaliente = false ;
        Scanner lector = new Scanner(System.in) ;
        
        System.out.println("Vamos a hacer la media de una serie de notas. Si quieres terminar el programa, dame un número negativo o superior a 10.") ;
        
        do{
            System.out.println("Dame una nota:") ;

            if (nota==10){
                supersobresaliente = true ;
            }

            nota = lector.nextFloat() ;

            if (listaNotas[0]==-1){
                listaNotas[0]= nota ;
                listaEditable[0] = nota ;
            }else{
                listaEditable = new float[listaNotas.length+1] ;

                for (int i=0; i<listaNotas.length; ++i){
                    listaEditable[i]= listaNotas[i] ;
                }
                listaEditable[listaEditable.length-1] = nota ;

                listaNotas = java.util.Arrays.copyOfRange(listaEditable, 0, listaEditable.length) ;
            }

        }while(0<=nota && 10>=nota) ;

        if (listaNotas[0] != -1){

            for (int i=0 ; i<listaNotas.length-1; ++i ){
                media = media+ listaNotas[i] ;
            }
            media= media/(listaNotas.length-1) ;
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
