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
    int[] exampleTest1 = {2,6,8,-10,3}; 
     int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}; 
     int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
     assertEquals(3, FindOutlier.find(exampleTest1));
     assertEquals(206847684, FindOutlier.find(exampleTest2));
     assertEquals(0, FindOutlier.find(exampleTest3));
    }
}
