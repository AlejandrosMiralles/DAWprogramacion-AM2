public class Ejercicio41 {
    public static void main(String[] args) {
        double n1= 1, n2=1, t ;
        byte i;

        System.out.print(n1+", "+n2);

        i=3 ;

        while (i<=40){
            t = n1+n2 ;
            System.out.print(", "+t/n2);

            n1 = n2 ;
            n2 = t ;

            ++i ;
        }
        System.out.println("");
    }
}