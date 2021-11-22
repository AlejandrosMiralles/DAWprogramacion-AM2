class Iguales{
    public static void main(String[] args) {
        int[] v = {0, 3, 4}, fg = {0, -3, 4};
       /* int[] f = {0, 3, 4},*/
        boolean iguales = true;
    
        for (int i = 0; i < 3; i++) {
            if (v[i]!=fg[i]){
                iguales= false;
            }
        }
    
        if (iguales){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
    
    }
}