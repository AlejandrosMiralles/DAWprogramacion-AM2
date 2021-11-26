import java.util.Scanner;

public class HundirLaFlota {
    public static String[][] createTable() {
        //cçodigo modificado de Tablero.java

        String[][] matriz = new String[9][9];
        String[] lista, 
            filainfo = {" ", "1","2","3","4","5","6","7","8"},
            columnainfo = {" ", "A","B","C","D","E","F","G","H"};


        for (int i = 1; i < 9; i++) {

            lista= new String[9];

            for (int j = 1; j < lista.length; j++) { //relleno un array de String
                lista[j] = ".";
            }

            matriz[i] = lista; //agrego una matriz
        }

        for (int z = 0; z < matriz.length; z++) {
            matriz[0][z] = filainfo[z];
            matriz[z][0] = columnainfo[z];
        }

        return matriz;
    }

    public static void createShips(int numShips, int[][] shipPlaces) {
        int r1, r2;
        int cont = 0;
    
        while (cont < numShips) {
            r1 = (int) (Math.random()*8); 
            r2 = (int) (Math.random()*8);
            if (shipPlaces[r1][r2] != 1) {
                shipPlaces[r1][r2]=1;
                cont++;
            }
        }

        System.out.println("Posición de los barcos:");
        for (int i = 0; i < shipPlaces.length; i++) {
            
            for (int j = 0; j < shipPlaces[i].length; j++) {
                System.out.print(" "+shipPlaces[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void mostrarTabla(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" "+matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static int rowTranslator(char letter){
        char[] array= {' ','A','B','C','D','E','F','G','H'};

        for (int i = 0; i < array.length; i++) {
            if (array[i]==letter){
                return i;
            }
        }
        return 0;
        
    }
    
    public static void main(String[] args) {
        String[][] playField = createTable();
        int[][] shipPlaces=new int[8][8];
        int rowInt, column, sunk=0, shots=0;
        double accuraccy;
        char row;
        boolean stop = false;
        String answer;
        Scanner input = new Scanner(System.in);


        createShips(10, shipPlaces);

        System.out.println("Game starts:\n\n\n\n\n");

        while (!(stop || sunk==10)){
            System.out.println("SHOTS: "+shots+"\nSUNK SHIPS: "+sunk);
            mostrarTabla(playField);


            do{
                System.out.print("Enter row (LETTER): ");
            row = Character.toUpperCase(input.next().charAt(0));
            rowInt= rowTranslator(row);
            }while(!(row =='A' || row =='B' || row =='C' || row =='D' || row =='E' ||
            row =='F' || row =='G' || row =='H'));

            do {
            System.out.print("Enter column (Number): ");
            column = input.nextInt();
            }while(!(0<column && column<9));




            if (shipPlaces[rowInt-1][column-1]==1){
                ++sunk;
                ++shots;

                playField[rowInt][column] = "X";
                shipPlaces[rowInt-1][column-1] = 2;
            }else if(shipPlaces[rowInt-1][column-1]==2){
                ++shots;
            }else{
                ++shots;
                playField[rowInt][column] = "O";
            }

            if (shots!=10){
                do{
                    System.out.println("Do you want to stop: 'Yes' or 'no'?");
                answer= input.next();
                answer = answer.toLowerCase();
                }while(!(answer.equals("yes") || answer.equals("no")));

                if (answer.equals("yes")){
                    stop= true;
                }
            }
        }

        input.close();
        accuraccy = ((float)sunk/(float)shots)*100;

        System.out.println("Game ended");
        if (sunk==10){
            System.out.println("Congratulations. You beat the game!!");
        }
        System.out.println("You shoted "+sunk+" ships. You neened "+shots+" shots.\n"+
                "You have un accuraccy of "+accuraccy+"%.");
    }
}