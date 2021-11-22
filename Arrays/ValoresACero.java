public class ValoresACero {
    public static void main(String[] args) {
        //Código copiado de "RellenaMatriz.java"
        int[][] matriz = new int[0][5];
        int[] lista;

        for (int i = 0; i < 5; i++) {
            lista= BibliotecaArrays.rellenaArray(5, 0, 1);
            matriz= BibliotecaArrays.agregarMatriz(matriz, lista);
        }

        for (int i = 0; i < matriz.length; i++) {
            BibliotecaArrays.escribeArray(matriz[i]);;
        }

        //Código original
        int ceros, filasnulas=0;
        for ( int i = 0; i < matriz.length; i++) {
            ceros=0;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]==0){
                    ++ceros;
                }
            }
            if (ceros==5){
                filasnulas++;
            }
        }

        int columnasnulas=0;
        for (int i = 0; i < matriz.length; i++) {
            ceros=0;
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[j][i]==0){
                    ++ceros;
                }
            }
            if (ceros==5){
                ++columnasnulas;
            }
        }

        System.out.println("\nFilas nulas: "+filasnulas+"\nColumnas nulas: "+columnasnulas);
    }
}
