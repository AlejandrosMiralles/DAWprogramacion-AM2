public class Primos {
    public static void main(String[] args) {
        for (int i = 3; i<100; i+= 2){
            if (Primo.prime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
    }
}