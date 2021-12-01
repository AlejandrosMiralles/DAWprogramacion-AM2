public class Siglas {
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

    public static String siglas(String[] palabras) {
        String sigla = "";

        for (int i = 0; i < palabras.length; i++) {
            if (Character.isUpperCase(palabras[i].charAt(0))){
                sigla += palabras[i].charAt(0);
            }
        }

        return sigla;
    }

    public static void main(String[] args) {
        String cadena = "Escuela Oficial de Idiomas";
        String[] palabras = palabras(cadena);

        System.out.println(siglas(palabras));
    }
}
