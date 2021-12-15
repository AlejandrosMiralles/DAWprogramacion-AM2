import java.util.HashSet;
import java.util.Set;

public class FindOdd {
    public static int findIt(int[] a) {
        Set<Integer> chequeados = new HashSet<Integer>();
        int repeticiones, odd = 0;

        for (int i = 0; i < a.length; i++) {
            repeticiones = 0;

            if (chequeados.contains(a[i])){
                continue;
            }

            for (int j = i; j < a.length; j++) {
                if (a[j]==a[i]){
                    ++repeticiones;
                }    
            }

            if (repeticiones%2==0){
                chequeados.add(a[i]);
            }else{
                odd = a[i];
                break;
            }
        }
        return odd;
    }

    public static void main(String[] args) {
    //https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java
    
    //5  -1  5  10  10   1
   	System.out.println(FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5})); 
    System.out.println(FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5})); 
    System.out.println(FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
    System.out.println(FindOdd.findIt(new int[]{10}));
    System.out.println(FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
    System.out.println(FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }
}
