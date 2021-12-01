public class Pasatiempos {
    public static boolean vocal(char letra) {
        letra = Character.toLowerCase(letra);

        if (letra == 'a' | letra== 'e' | letra == 'i' | letra== 'o' | letra == 'u'){
            return true;
        }
        return false;
    }

    public static String codificar(String cadena) {
        String codificado = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (vocal(cadena.charAt(i))){
                codificado += '.';
            }else{
                codificado += cadena.charAt(i);
            }
        }

        return codificado;
    }

    public static void main(String[] args) {
        String cadena = "Un ejemplo de pasatiempo";

        System.out.println(codificar(cadena));
    }
}