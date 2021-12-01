public class Longitud3 {
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
        String cadena = "Escribid un programa Java para eliminar de un array un elemento específico (índice) introducido por el usuario (moviéndolo al final del mismo). Si el índice es mayor que el tamaño del array, debe decírselo al usuario y volver a pedírselo.";
        String[] palabras = dividirEnPalabras(cadena);
        int letras = 10;
        boolean existe_mayor=false;

        for (int i = 0; i < palabras.length; i++) {
            if(palabras[i].length()>=letras){
                existe_mayor=true;
                break;
            }
        }

        if (!existe_mayor){
            System.out.println("Todas las cadenas son cortas.");
        }else{
            System.out.println("Hay alguna palabra larga.");
        }
    }
}
