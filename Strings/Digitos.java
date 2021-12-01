public class Digitos {
    public static void main(String[] args) { // 3 + 5+ 10 = 18
        String cadena = "Primero multiplicamos 5 x 1, el resultado de esta multiplicación es 5. Lo ponemos justo debajo de las Unidades."+
        "Después multiplicamos 5 x 8, el resultado de esta multiplicación es 40, ponemos el cero debajo de las decenas y recordamos que nos llevamos 4 para la siguiente multiplicación."+
        "Por último multiplicamos 5 x 7, el resultado de esta multiplicación es 35, pero recuerda que te llevabas 4 de la anterior multiplicación, por lo que el resultado final es 35 + 4 = 39, lo colocamos debajo de las centenas.";
        int digitosCant=0;

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))){
                Character.isDigit(cadena.charAt(i)); 
                ++digitosCant;
            }
        }

        System.out.println(digitosCant);

    }
}
