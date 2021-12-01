//Programa que cuenta cuanto n´umeros hay en un array
//Se supone que "a1" no es un número!! pero "a 1" sí. O "5.", que es incorrecto a diferencia de "5 .".

public class Digitos2 { 

    public static String[] dividirEnPalabras(String cadena){
        // Quitar espacios en blanco al principio y al final
        cadena=cadena.trim();

        // Reemplazar uno o más espacios en blanco por un solo espacio

        /*cadena=cadena.replaceAll("(", " ");
        cadena=cadena.replaceAll(")", " ");*/
        cadena=cadena.replaceAll(",", " ");
        //cadena=cadena.replaceAll(".", " ");
        cadena=cadena.replaceAll(" +", " ");
        
        
        // Dividir la cadena en partes por el carácter espacio (devuelve un array con cada una de las partes)
        return cadena.split(" ");
    }

    public static void main(String[] args) { // 3 + 4 + 7 = 14
        String cadena = "Primero multiplicamos 5 x 1, el resultado de esta multiplicación es 5 . Lo ponemos justo debajo de las Unidades."+
        "Después multiplicamos 5 x 8, el resultado de esta multiplicación es 40, ponemos el cero debajo de las decenas y recordamos que nos llevamos 4 para la siguiente multiplicación."+
        "Por último multiplicamos 5 x 7, el resultado de esta multiplicación es 35, pero recuerda que te llevabas 4 de la anterior multiplicación, por lo que el resultado final es 35 + 4 = 39, lo colocamos debajo de las centenas.";
        String[] numeros = dividirEnPalabras(cadena) ;
        int numerosCant=0;
        boolean esNumero = false;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length(); j++) {
                if (Character.isDigit(numeros[i].charAt(j))){
                    esNumero= true;
                }else{
                    esNumero = false;
                    break;
                }
            }

            if (esNumero){
                ++numerosCant;
            }
        }

        System.out.println(numerosCant);
    }
}
