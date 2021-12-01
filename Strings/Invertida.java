public class Invertida {
    public static String[] palabras(String frase) {
        // Quitar espacios en blanco al principio y al final
        frase=frase.trim();

        // Reemplazar uno o más espacios en blanco por un solo espacio
    
        /*cadena=cadena.replaceAll("(", " ");
        cadena=cadena.replaceAll(")", " ");*/
        frase=frase.replaceAll(",", " ");
        //cadena=cadena.replaceAll(".", " ");
        frase=frase.replaceAll(" +", " ");
                    
        // Dividir la cadena en partes por el carácter espacio (devuelve un array con cada una de las partes)
        return frase.split(" ");    
    }

    public static String invertir(String[] palabras) {
        String cadena="";

        for (int i = palabras.length-1; i >= 0; i--) {
            cadena = cadena.concat(palabras[i]);
            cadena = cadena.concat(" ");
        }

        return cadena;
    }

    public static void main(String[] args) {
        String cadena = "Esto es una frase";
        String[] palabras = palabras(cadena);

        System.out.println(invertir(palabras));
    }
}
