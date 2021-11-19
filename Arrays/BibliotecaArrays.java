import java.util.Scanner;

public class BibliotecaArrays {


    public static void main(String[] args) {
        
        /*(Prueba para eliminar numero de un array de int
        int[] lista = {34, 67, 3254, 46, 25,746, 415, 151, 1854};
        /*for (int numero: EliminarNumero(lista, 4) ){
            System.out.print(numero+" ");
        }*/

        /*Prueba para agregar una swerie de numeros a una lista
        int[] aagregar = {35, 24, 74, 96, 48, 12};
        for (int numero: agregarEnteros(lista, aagregar)){
            System.out.print(numero+" ");
        }*/
    }

    public static int[] EliminarNumero(int[] lista, int indice) {
        Scanner input = new Scanner(System.in);
        int numero=0, numero2;
        int[] lista2 = new int[lista.length-2];

        if (lista.length==0){
            input.close();
            return lista;
        }
       
        while (indice>lista.length || indice<=0){

            if (indice<=0){
                System.out.println("Perdone, pero el indice ha de ser superior a 0.\n"+
                                    "Escriba otro indice:");
            }else{
                System.out.println("Perdone, pero el indice supera el número de elementos del array.\n" +
                                "Vuelva a introducir un indice:");
            }

            indice= input.nextInt();
        }
        input.close();
        --indice;

        for (int i=lista.length-1; i>=indice; --i){
            numero2= lista[i];
            
            if (i==lista.length-1){
                lista[i]=lista[indice];
            }else{
                lista[i]=numero;
            }
            numero=numero2;
        }

        System.arraycopy(lista, 0, lista2,0, lista.length-1);

        return lista2;
    }

    public static int[] AgregarEntero(int[] numeros, int numero) {
        int[] lista2= new int[numeros.length+1];

        System.arraycopy(numeros, 0, lista2, 0, numeros.length);
        lista2[lista2.length-1]= numero;

        return lista2;
    
    }

    public static int[] agregarEnteros(int[] lista, int[] numeros) {
        for (int i=0; i<numeros.length; ++i){
            lista= AgregarEntero(lista, numeros[i]);
        }
        return lista;
    }



}
