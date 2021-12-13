public class FindOdd {
    public static int findIt(int[] a) {
        int[] chequeados = new int[a.length];
        boolean repetido;
        int repeticiones, odd = 0;

        for (int i = 0; i < a.length; i++) {
            repetido = false;
            repeticiones = 0;

            for (int j = 0; j < chequeados.length; j++) {
                if (a[i]==chequeados[j]){
                    repetido = true;
                    break;
                }
            }    
            if (repetido){
                continue;
            }

            for (int j = i; j < a.length; j++) {
                if (a[j]==a[i]){}
                ++repeticiones;    
            }

            if (repeticiones%2==0){
                for (int j = 0; j < chequeados.length; j++) {
                    if (chequeados[j]==0){
                        chequeados[j] = a[i];
                    }
                }
            }else{
                odd = a[i];
                break;
            }
        }
        return odd;
    }

    public static void main(String[] args) {
    //https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java
        
   	System.out.println(5 == FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5})); 
    System.out.println(-1 == FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5})); 
    System.out.println(5 == FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
    System.out.println(10 == FindOdd.findIt(new int[]{10}));
    System.out.println(10 == FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
    System.out.println(1 == FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }
}
