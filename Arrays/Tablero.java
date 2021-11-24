public class Tablero {
    public static int[][] rellenamatrices30000() {
        //código copiado de #RellenaMatriz

        int[][] matriz = new int[0][8];
        int[] lista;

        for (int i = 0; i < 8; i++) {
            lista= BibliotecaArrays.rellenaArray(8, 0, 3);
            matriz= BibliotecaArrays.agregarMatriz(matriz, lista);
        }

        return matriz;
    }

    public static void main(String[] args) {
        int[][] matrizInt = rellenamatrices30000();
        String[][] matrizStr = new String [9][9];
        String[] filainfo = {" ", "1","2","3","4","5","6","7","8"},
                columnainfo = {" ", "A","B","C","D","E","F","G","H"};
        

        for (int i = 0; i < matrizInt.length; i++) {
            for (int j = 0; j < matrizInt[1].length; j++) {
                if (matrizInt[i][j]==0){
                    matrizStr[i+1][j+1] = "."; 
                }else if(matrizInt[i][j]==1){
                    matrizStr[i+1][j+1]= "+";
                }else if(matrizInt[i][j]==2){
                    matrizStr[i+1][j+1] = "O";
                }else{
                    matrizStr[i+1][1+j] = "X";
                }
            }
        }
    
        for (int i = 1; i < matrizStr.length; i++) {
            matrizStr[i][0]= columnainfo[i];
        }
        for (int j = 0; j < matrizStr.length; j++) {
            matrizStr[0][j] = filainfo[j];
        }

        System.out.println("\n");
        for (int i = 0; i < matrizStr.length; i++) {
            for (int j = 0; j < matrizStr.length; j++) {
                System.out.print(" "+matrizStr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
