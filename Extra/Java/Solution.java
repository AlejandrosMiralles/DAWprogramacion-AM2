import java.util.Set;
import java.util.HashSet;

public class Solution {
    public static int solution(int number) {
        if (number<=0){ return 0;}


        int resultado, multiplicador;
        Set<Integer> multiplos = new HashSet<Integer>();

        multiplicador = 0;

        while((++multiplicador*3)<number){
            multiplos.add(multiplicador*3); 
        }

        multiplicador = 0;

        while((++multiplicador*5)<number){
            multiplos.add(multiplicador*5); 
        }

        resultado = 0;
        for(int digito : multiplos){ resultado+= digito ;}

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(solution(-2));
        System.out.println(solution(4));
        System.out.println(solution(16));
        System.out.println(solution(40));
        System.out.println(solution(10));
    }
}