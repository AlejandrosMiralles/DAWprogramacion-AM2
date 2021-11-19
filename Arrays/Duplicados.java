public class Duplicados {
    public static int[] repetidos(int[] numeros) {

        int[] repetidos = new int[0], repe;
        int repeticiones, resto=0;

        for (int i=0; i<numeros.length-resto; ++i){
            repe = new int[0];
            repeticiones = 0;

            for (int j=0; j<numeros.length-resto; ++j){
                if (numeros[i]==numeros[j] && i!=j){
                    repeticiones++;
                    repe= BibliotecaArrays.agregarEntero(repe,j);
                }
            }
            resto+= repeticiones;

            if (repe.length>0){
                repetidos = BibliotecaArrays.agregarEntero(repetidos, numeros[i]);
            }

            for (int posicion=0; posicion<repe.length; ++posicion){
                numeros = BibliotecaArrays.alFinal(numeros, repe[posicion]-posicion);
            }

        }
        return repetidos;
        
    }

    public static void main(String[] args) {
        int[] lista5= BibliotecaArrays.rellenaArray(100, -20, 20);
        
       
        System.out.print("\n\n\nLista 5.0: ");
        for (int i=0; i<lista5.length; ++i){
            System.out.print(lista5[i]+"  ");
        }

        lista5= repetidos(lista5);

        System.out.print("\n\n\nLista 5.5: ");
        for (int i=0; i<lista5.length; ++i){
            System.out.print(lista5[i]+"  ");

        }  
    }
}
