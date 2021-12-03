public class Palabras1 {
    public static String[] dividirEnPalabras(String cadena){
        // Quitar espacios en blanco al principio y al final
        cadena=cadena.trim();

        // Reemplazar uno o más espacios en blanco por un solo espacio

        /*cadena=cadena.replaceAll("(", " ");
        cadena=cadena.replaceAll(")", " ");*/
        cadena=cadena.replaceAll(",", " ");
        cadena=cadena.replaceAll(" +", " ");
        
        
        // Dividir la cadena en partes por el carácter espacio (devuelve un array con cada una de las partes)
        return cadena.split(" ");
    }

    public static void main(String[] args) {
        String cadena = "Realiza un programa que cuente las palabras que tiene una cadena. Podéis usar las métodos trim(), replaceAll(), split(). Se considera que las palabras pueden estar separadas por uno o más espacios, y que también puede haber espacios al principio y al final.";
        String[] palabras = dividirEnPalabras(cadena);

        System.out.println("Hay "+palabras.length+" palabras.");
    }
}