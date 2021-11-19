import java.util.Scanner;

public class Eliminar {


	public static int[] rellenaArray(int tamano, int min, int max) {
        int[] array= new int[tamano];

		for (int i = 0; i < array.length; i++) {
			int aleatorio = (int) (Math.random() * (max - min + 1) + min);
			array[i] = aleatorio;
		}
        return array;
    }

    public static int[] eliminarNumero(int[] lista, int indice) {
        Scanner input = new Scanner(System.in);
        int numero=0, numero2;

        if (lista.length==0){
            input.close();
            return lista;
        }
       
        while (indice>lista.length || indice<0){

            if (indice<0){
                System.out.println("Perdone, pero el indice ha de ser superior a 0.\n"+
                                    "Escriba otro indice:");
            }else{
                System.out.println("Perdone, pero el indice supera el número de elementos del array.\n" +
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

    public static void main(String[] args) {
        int[] lista1= {34, 56, 1}, lista2= {0, 23,45,05,18,79,51,4852,15,56};
        int[] lista3= {498,12,894,6,1654,874,84};
        int[] lista4= rellenaArray(4, 0, 100), lista5= rellenaArray(10, -10, 10);
       

        lista1= eliminarNumero(lista1, 2);
        lista2= eliminarNumero(lista2, 5);
        lista3= eliminarNumero(lista3, 6);
        lista4= eliminarNumero(lista4, 4);
        lista5= eliminarNumero(lista5, 0);


        System.out.print("Lista 1: ");
        for (int i=0; i < lista1.length; ++i){
            System.out.print(lista1[i]+"  ");
        }
        System.out.print("\nLista 2: ");
        for (int i=0; i<lista2.length; ++i){
            System.out.print(lista2[i]+"  ");
        }
        System.out.print("\nLista 3: ");
        for (int i=0; i<lista3.length; ++i){
            System.out.print(lista3[i]+"  ");
        }
        System.out.print("\nLista 4: ");
        for (int i=0; i<lista4.length; ++i){
            System.out.print(lista4[i]+"  ");
        }
        System.out.print("\nLista 5: ");
        for (int i=0; i<lista5.length; ++i){
            System.out.print(lista5[i]+"  ");
        }
    }
}
