public class RellenaMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[0][10];
        int[] lista;

        for (int i = 0; i < 10; i++) {
            lista= BibliotecaArrays.rellenaArray(10, 0, 1);
            matriz= BibliotecaArrays.agregarMatriz(matriz, lista);
        }

        for (int i = 0; i < matriz.length; i++) {
            BibliotecaArrays.escribeArray(matriz[i]);;
        }
    }
}