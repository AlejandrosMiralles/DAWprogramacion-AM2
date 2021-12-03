public class Tablero { 

    public static int[] rellenaArray(int tamano, int min, int max) {
        //Rellena un array nuevo de un tamaño con numeros aleatorios

        int[] array= new int[tamano];

		for (int i = 0; i < array.length; i++) {
			int aleatorio = (int) (Math.random() * (max - min + 1) + min);
			array[i] = aleatorio;
		}
        return array;
    }

    public static int[][] agregarMatriz(int[][] lista, int[] aagregar) {
        //Agrega una fila en una matriz

        int[][] lista2= new int[lista.length+1][];

        System.arraycopy(lista, 0, lista2, 0, lista.length);
        lista2[lista2.length-1]= aagregar;

        return lista2;
    }

    public static int[][] creaTableros() {
        //creo el tablero con 

        int[][] matriz = new int[0][8];
        int[] lista;

        for (int i = 0; i < 8; i++) {
            lista= rellenaArray(8, 0, 3);
            matriz= agregarMatriz(matriz, lista);
        }

        //Escribo el array para ver si el programa está bien hecho
        /*for (int i = 0; i < matriz.length; i++) {  
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" "+matriz[i][j]+" ");
            }
            System.out.println("");
        }*/

        

        return matriz;
    }

    public static void main(String[] args) {
        int[][] matrizInt = creaTableros();
        String[][] matrizStr = new String [9][9];
        String[] filainfo = {" ", "1","2","3","4","5","6","7","8"},
        columnainfo = {" ", "A","B","C","D","E","F","G","H"};

        
        //Copia la natrizInt en la matrizStr, pero codificandola
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
    

        //Añado la leyenda
        for (int i = 1; i < matrizStr.length; i++) {
            matrizStr[i][0]= columnainfo[i];
            matrizStr[0][i]= filainfo[i];
        }
        matrizStr[0][0]= " ";


        //Imprimo el tablero
        System.out.println("\n\n\n\n\n");
        for (int i = 0; i < matrizStr.length; i++) {
            for (int j = 0; j < matrizStr.length; j++) {
                System.out.print(" "+matrizStr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
