public class SumaIgual {
    public static int[][] pares(int[] lista, int resultado) {
        int[][] pares = new int[0][2];
        int[] par_aPoner;

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i]+lista[j] == resultado && i!=j){
                    par_aPoner= new int[0];
                    par_aPoner= BibliotecaArrays.agregarEntero(par_aPoner, lista[i]);
                    par_aPoner= BibliotecaArrays.agregarEntero(par_aPoner, lista[j]);

                    pares = BibliotecaArrays.agregarMatriz(pares, par_aPoner);
                    break;
                }
            }
        }
        return pares;
    }

    public static void main(String[] args) {
        int[] lista5= BibliotecaArrays.rellenaArray(50, 0, 30);
        int[][] listaParejas = pares(lista5, 34);

        System.out.print("Parejas: ");
        for (int i = 0; i < listaParejas.length; i++) {
            for (int j = 0; j < listaParejas[0].length; j++) {
                System.out.print(listaParejas[i][j]);
                if (j==0){
                    System.out.print(" y ");
                }else{
                    System.out.print(" | ");
                }
            }
        }
    }
}
