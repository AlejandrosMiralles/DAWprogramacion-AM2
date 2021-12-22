public class SumSquaredDivisors{
    public static String listSquared(long m, long n) {
        String result = "[";
        long sum;

        for (long i = m; i < n; i++) {
            sum = 0;
            for (long j = 1; j < Math.sqrt(i)-0.01 ; j++) {
                if (i%j == 0){
                    sum+= j*j+ Math.pow(i/j, 2);
                }
            }
            if (Math.sqrt(i)%(int)Math.sqrt(i) == 0){
                sum+= i;
            }

            if (Math.sqrt(sum)%(int)Math.sqrt(sum) == 0){
                if (result.equals("[")){
                    result = result.concat("["+i+", "+sum+"]");
                }else{
                    result = result.concat(", ["+i+", "+sum+"]");
                }
            }
        }
        
        result = result.concat("]");

        return result;
   }

    public static void main(String[] args) {
        System.out.println(listSquared(1, 500));
    }
}