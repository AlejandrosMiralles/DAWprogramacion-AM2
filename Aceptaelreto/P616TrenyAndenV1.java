//https://www.aceptaelreto.com/problem/statement.php?id=614

//Supongo que las puertas NO tienen ningún orden en especifico.

//FRACASO:Da bucle infinito.

import java.util.Scanner;

public class P616TrenyAndenV1 {

    public static int callong(int repe,int[] posiciones, int puertas[], int long1){
        if (repe!=0){
            for (int x=0; x<posiciones.length; ++x){
                if (repe>0){
                    --repe;
                }else{
                    repe= puertas.length ;
                }

                for (int z=0; z<puertas.length; ++z){
                    if (puertas[z] == -1){
                        puertas[z] = x;
                    }
                }

                long1= callong(repe, posiciones, puertas, long1) ;
            }
         

        }else{
            int long2=0, long3;

            for (int i=0; i<posiciones.length; ++i){
                long3 = 100000000;
                for (int j=0; j<puertas.length; ++j){
                    if (long3>(Math.abs(puertas[j]-i)*posiciones[i])){
                       long3= Math.abs(puertas[j]-i)*posiciones[i] ;
                    }
                }
                long2 += long3 ;
            }

            if (long1>long2){
                long1 = long2;
            }
        }

        return long1 ;
    }


    public static void main(String[] args) {
        
        int puertas=2, posicionesnum= 4, longitud = 10000000 ;
        int posiciones[]= {1, 1, 1, 1}, puertasPosiciones[]= {-1, -1};
        Scanner input = new Scanner(System.in);

        /*
        puertas = input.nextInt() ;
        posicionesnum = input.nextInt();


        posiciones = new int[posicionesnum];
        puertasPosiciones = new int[puertas];


        //Darle valores a la variable posiciones
        for (int i=0; i<posicionesnum; ++i){
            posiciones[i]= input.nextInt();
        }

        for (int i=0; i<puertas; ++i){
            puertasPosiciones[i]= -1;
        }
        */

        input.close();

        if (puertas>=posicionesnum){
            longitud = 0 ;
        }else{
            System.out.println(callong(puertas, posiciones, puertasPosiciones, longitud));
        }
    }
}
