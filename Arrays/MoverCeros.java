public class MoverCeros {
    public static void main(String[] args) {
        int[] lista= {234, 0, 2354, 0, 20, 0, 10, 234, 46, 46, 51, 0, 561,1561,0,01,000,063510,651050,0651,0,};
        int ceros=0, i= 0; //contador. I= for i
        
        while(i<lista.length-ceros){
            if (lista[i]==0){
                ++ceros;
                lista= BibliotecaArrays.alFinal(lista, i);
            }else{
                ++i;
            }
        }

        BibliotecaArrays.escribeArray(lista);
    }
}