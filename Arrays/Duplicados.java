public class Duplicados {
    public static int[] repetidos(int[] numeros) {

        int[] repetidos = new int[0], repe;
        int repeticiones=0;

        for (int i=0; i<numeros.length-repeticiones; ++i){
            repe = new int[0];

            for (int j=0; j<numeros.length-repeticiones; ++j){
                if (numeros[i]==numeros[j] && i==j){
                    repeticiones++;
                    repe= BibliotecaArrays.agregarEntero(repe,j);
                }
            }

            if (repe.length>0){
                repetidos = BibliotecaArrays.agregarEntero(repetidos, numeros[i]);
            }

            for (int posicion : repe){
                numeros = BibliotecaArrays.alFinal(numeros, posicion);
            }

        }
        return repetidos;
        
    }

    public static void main(String[] args) {
        int[] lista5= BibliotecaArrays.rellenaArray(10, -10, 10);
       
        lista5= repetidos(lista5);


        System.out.print("\n\n\nLista 5: ");
        for (int i=0; i<lista5.length; ++i){
            System.out.print(lista5[i]+"  ");
        }
    }
}
