public class Primo {
    public static boolean prime(int number){
        boolean primo= true ;



        if (number<0){
            primo = false ;
            return primo ;
        }else if (number == 1 || number == 0){
            primo = false ;
            return primo ;
        }else if (number%2 == 0 && number !=2){
            primo = false ;
            return primo ;
        }else{
            for(int i=3; i<number; i += 2){
                if (number%i == 0){
                    primo = false ;
                    return primo ;
                }
            }  
        }

        return primo ;
    }

    public static void main(String[] args) {
        System.out.println(prime(2));
    }
}
