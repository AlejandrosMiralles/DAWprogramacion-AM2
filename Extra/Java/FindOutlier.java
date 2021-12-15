public class FindOutlier {
    static int find(int[] integers){
        char[] tipo = {'O', 'O', 'O'};
        boolean pares = false;
        int ajeno = 0;

        for (int i = 0; i < tipo.length; i++) {
            if (integers[i]%2==0){
                tipo[i]= 'E';
            }
        }

        if (tipo[0] == 'E'){
            if (tipo[1] == 'E' || tipo[2] == 'E'){
                pares = true;
            }
        }else if (tipo[1] == 'E' && tipo[2] == 'E'){
            pares = true;
        }

        if (pares){
            
            for (int i = 0; i < integers.length; i++) {
                if (integers[i]%2 != 0){
                    ajeno = integers[i];
                    break;
                }
            }    
        }else{
            for (int j = 0; j < integers.length; j++) {
                if (integers[j]%2 == 0){
                    ajeno = integers[j] ;
                    break;
                }
            }
        }
    return ajeno;
  }
    

    public static void main(String[] args) {
    // https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java
    }
}