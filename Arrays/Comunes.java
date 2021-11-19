public class Comunes {
    public static int[] comunes(int[] lista1, int[] lista2) {
        int[] repeticiones = new int[0];
        boolean repetido;

        for (int i=0; i<lista1.length; ++i){
            repetido= false;
            for (int j=0; j<lista2.length;++j){
                if (lista1[i]==lista2[j]){
                    for (int k = 0; k < repeticiones.length; k++) {
                        if (lista1[i]==repeticiones[k]){
                            repetido= true;
                            break;
                        }
                    }
                    if (!repetido){
                    repeticiones = BibliotecaArrays.agregarEntero(repeticiones, lista1[i]);                    
                    }
                }
            }
        }
        return repeticiones;
    }

    public static void main(String[] args) {
        int[] lista5= BibliotecaArrays.rellenaArray(10, 20, 40), lista6 = BibliotecaArrays.rellenaArray(10, 23, 30);
        
       
        System.out.print("\n\n\nLista 5.0: ");
        for (int i=0; i<lista5.length; ++i){
            System.out.print(lista5[i]+"  ");
        }
        System.out.print("\n\n\nLista 6.0: ");
        for (int i=0; i<lista6.length; ++i){
            System.out.print(lista6[i]+"  ");
        }

        int[] lista7= comunes(lista5, lista6);

        System.out.print("\n\n\n\n\nLista 7: ");
        for (int i=0; i<lista7.length; ++i){
            System.out.print(lista7[i]+"  ");

        }  
    }
}
