import java.math.BigInteger;

public class TrailingZerosN {
    public static int zeros(int number){
        int result = 0;

        for (int i = 1; i <= (int) Math.sqrt(5); i++) {
            result += number/(int) Math.pow(5, i);
        }

        return result;       
    }

    public static int comprobar(int numbero) {
        BigInteger factorial = new BigInteger("1");
        BigInteger multiplo;
        String resultado;
        int ceros = 0;


        for (int i = 1; i <= numbero; ++i) {
            multiplo = new BigInteger(Integer.toString(i));
            factorial = factorial.multiply(multiplo);
        }

        resultado = factorial.toString();
        
        for (int i = resultado.length()-1; resultado.charAt(i) == '0'; i--) {
            ceros++;
        }

        return ceros;
    }

    public static void main(String[] args) {
        System.out.println(zeros(25) + "    "+comprobar(25));
        System.out.println(zeros(625) + "    "+comprobar(625));
        System.out.println(zeros(125) + "    "+comprobar(125));
    }
}