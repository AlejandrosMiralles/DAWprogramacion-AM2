public class Persistence{
    public static int persistencia(int numero) {
        int contador = 0;
        char[] digitos ; 

        while (numero>=10){
            digitos = new char[String.valueOf(numero).length()];
            
            for (int i = 0; i < digitos.length; i++) {
                digitos[i] = String.valueOf(numero).charAt(i);
            }

            numero = 1;
            for (char digito : digitos){
                numero *= Character.getNumericValue(digito);
            }
            
            ++contador;
        }

        return contador;
    }

    public static void main(String[] args) {
        System.out.println(persistencia(40));
        System.out.println(persistencia(641466463));
        System.out.println(persistencia(4641));
        System.out.println(persistencia(456));
        System.out.println(persistencia(8546));
        System.out.println(persistencia(4));
    }

}