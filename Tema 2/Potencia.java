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
}