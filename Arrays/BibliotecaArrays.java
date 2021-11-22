//JAVASE-11

import java.util.Scanner;

public class BibliotecaArrays {


    public static void main(String[] args) {
        
        /*(Prueba para eliminar numero de un array de int
        int[] lista = {34, 67, 3254, 46, 25,746, 415, 151, 1854};
        /*for (int numero: EliminarNumero(lista, 4) ){
            System.out.print(numero+" ");
        }*/

        /*Prueba para agregar una serie de numeros a una lista
        int[] aagregar = {35, 24, 74, 96, 48, 12};
        for (int numero: agregarEnteros(lista, aagregar)){
            System.out.print(numero+" ");
        }*/
    }

   public static void escribeArray(int[] lista) {
    for (int i = 0; i < lista.length; i++) {
        System.out.print(" "+lista[i]+" ");
    }
    System.out.println("");
}

    public static int[] eliminarNumero(int[] lista, int indice) { 
        //ELIMINA el número en el índice indicado

        Scanner input = new Scanner(System.in);
        int numero=0, numero2;
        int[] lista2 = new int[lista.length-1];

        if (lista.length==0){
            input.close();
            return lista;
        }
       
        while (indice>lista.length || indice<0){

            if (indice<0){
                System.out.println("Perdone, pero el indice ha de ser superior o igual a 0.\n"+
                                    "Escriba otro indice:");
            }else{
                System.out.println("Perdone, pero el indice supera o iguala el número de elementos del array.\n" +
                                "Vuelva a introducir un indice:");
            }

            indice= input.nextInt();
        }
        input.close();


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

    public static int[] agregarEntero(int[] numeros, int numero) {
        //Agrega un entero a una lista

        int[] lista2= new int[numeros.length+1];

        System.arraycopy(numeros, 0, lista2, 0, numeros.length);
        lista2[lista2.length-1]= numero;

        return lista2;
    
    }

    public static int[] agregarEnteros(int[] lista, int[] numeros) {
        //Agrega una lista de enteros a otra lista

        for (int i=0; i<numeros.length; ++i){
            lista= agregarEntero(lista, numeros[i]);
        }
        return lista;
    }

    public static int[][] agregarMatriz(int[][] lista, int[] aagregar) {
        //Agrega una fila en una matriz

        int[][] lista2= new int[lista.length+1][];

        System.arraycopy(lista, 0, lista2, 0, lista.length);
        lista2[lista2.length-1]= aagregar;

        return lista2;
    }


	public static int[] rellenaArray(int tamano, int min, int max) {
        //Rellena un array nuevo de un tamaño con numeros aleatorios

        int[] array= new int[tamano];

		for (int i = 0; i < array.length; i++) {
			int aleatorio = (int) (Math.random() * (max - min + 1) + min);
			array[i] = aleatorio;
		}
        return array;
    }

    public static int[] alFinal(int[] lista, int indice) {
        //Coloca el número en la posición array en un indice al final del array

        Scanner input = new Scanner(System.in);
        int numero=0, numero2;
    
        if (lista.length==0){
            input.close();
            return lista;
        }
           
        while (indice>lista.length || indice<0){
    
            if (indice<0){
                System.out.println("Perdone, pero el indice ha de ser superior o igual a 0.\n"+
                                    "Escriba otro indice:");
            }else{
                System.out.println("Perdone, pero el indice supera o iguala el número de elementos del array.\n" +
                                   "Vuelva a introducir un indice:");
            }
    
            indice= input.nextInt();
        }
        input.close();
    
        for (int i=lista.length-1; i>=indice; --i){
            numero2= lista[i];
                
            if (i==lista.length-1){
                lista[i]=lista[indice];
            }else{
                lista[i]=numero;
            }
            numero=numero2;
        }

        return lista;
    }


}