public class Ejercicio31 {
    public static void main(String[] args) {

        int[] anArray = new int[10] ;
        int valor = 100 ;

        for (int i = 0; 10>i; ++i){
            anArray[i] = valor ;
            valor = valor + 100 ;
        }
        for (int i=0; 10>i; ++i){
            System.out.println(anArray[i]) ;
        }
    }
}
