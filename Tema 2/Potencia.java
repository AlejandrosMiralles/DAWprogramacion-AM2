public class Potencia {
    public static double powerof(double x, int y){
        if (y>0){
            return x*= powerof(x, y-1) ;
        }else if(y<0){
            if (y!=-1){
                return x= powerof(x, y+1) / x ;
            }else{
                return x= 1/x ;
            }
        }else{
            return  1 ;
        }

    }

    public static void main(String[] args) {
        System.out.println("10^2= "+powerof(10, 2));
        System.out.println("5^33= "+powerof(5.0, 33));
        System.out.println("-2345^3= "+powerof(-2345, 3));
        System.out.println("2^-4= "+powerof(2, -4));
    }
}
