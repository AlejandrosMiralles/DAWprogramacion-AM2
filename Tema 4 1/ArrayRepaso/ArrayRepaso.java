package ArrayRepaso;

/**
 * En un array de 1000 enteros debo convertir todas las posiciones pares en múltiplos de 3 (en forma de 3, X, 6, Y, 9,...)
 * Y las posiciones impares en múltiplos de 7 (en forma de X, 7, Y, 14,....)
 * Luego imprimir las posiciones múltiples de 13
 */
class ArrayRepaso{

    static int multiplo3 = 3, multiplos7= 7;

    static int devolverMultiplo3(){ 
        multiplo3+= 3;
        return multiplo3 -3;
    }

    static int devolverMultiplo7(){
        multiplos7 += 7;
        return multiplos7 - 7;
    }
    public static void main(String[] args) {

        int[] numeros = new int[1000]; 

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (i%2==0) ? devolverMultiplo3() : devolverMultiplo7();
            if (i%13==0){ System.out.println(numeros[i]);}
        }

    }
}