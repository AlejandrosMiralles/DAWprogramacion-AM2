public class Palabras2 {
    public static int contadorPalabras(String cadena) {
        char letra;
        int contador = 0;
        boolean start = false, fin = false;

        for (int i = 0; i < cadena.length(); i++) {
            letra = cadena.charAt(i);

            switch (letra){
                case ' ':
                case '.':
                case ',':
                case ';':
                //etc.
                    if (start){
                        fin = true;
                        start = false;
                    }else{
                        fin = false;
                    }
                    break;
                default: //En números o letras, en teoría
                    fin = false;
                    start = true;
                    break;
            }

            if (fin){
                ++contador; 
            }

        }

        if (start && !false){ //Evito la situación en que el último caracter es una letra y no un punto, exclamación,etc.
            ++contador;
        }

        return contador;
    }

    public static void main(String[] args) {
        String cadena = "Realiza un programa que cuente las palabras que tiene una cadena. Podéis usar las métodos trim(), replaceAll(), split(). Se considera que las palabras pueden estar separadas por uno o más espacios, y que también puede haber espacios al principio y al final. ";

        System.out.println("Hay "+contadorPalabras(cadena)+" palabras.");
    }
}