//https://www.aceptaelreto.com/problem/statement.php?id=614

//Supongo que las puertas NO tienen ningún orden en especifico.

//FRACASO:Da bucle infinito.

import java.util.Scanner;

public class P616TrenyAndenV1 {

    public static int callong(int[] posiciones, int numpuertas, int long1){       

        int long2, long3;

        for (int j=0; j<posiciones.length-numpuertas; ++j){ //Miro todos los posibles lugares de las puertas
            long2=0;

            for (int i=0; i<posiciones.length; ++i){ //Calculo cuánto tarda en cada caso de las puertas
                if (j>i){
                    long3= (j-i)*posiciones[i];
                    long2+=long3;
                }else if(j+(numpuertas-1)<i){
                    long3= (i-(j+numpuertas-1))*posiciones[i];
                    long2+= long3;
                }
            }
           
            if (long1>long2){
                long1 = long2;
            }

        }

        return long1 ;
    }


    public static void main(String[] args) {
        
        int puertas, posicionesnum, longitud = 10000000 ;
        int posiciones[];
        Scanner input = new Scanner(System.in);

        
        puertas = input.nextInt() ;
        posicionesnum = input.nextInt();


        posiciones = new int[posicionesnum];


        //Darle valores a la variable posiciones
        for (int i=0; i<posicionesnum; ++i){
            posiciones[i]= input.nextInt();
        }

        input.close();

        if (puertas>=posicionesnum){
            longitud = 0 ;
        }else{
            System.out.println(callong(posiciones, puertas, longitud));
        }
    }
}
