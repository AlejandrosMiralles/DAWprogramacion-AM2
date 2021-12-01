public class Alfabetica {
    public static boolean esAlfabetica(String palabra){
        boolean alfabetica = true;
        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            for (int j = i+1; j < palabra.length(); j++) {
                if (palabra.charAt(i)>palabra.charAt(j)){
                    alfabetica = false;
                    return alfabetica;
                }
            }
        }

        return alfabetica;
    }

    public static void main(String[] args) {
        String palabra = "hola", palabra2= "iuuuuuu", palabra3="amor", palabra4= "china";
        
        System.out.println(esAlfabetica(palabra));
        System.out.println(esAlfabetica(palabra2));
        System.out.println(esAlfabetica(palabra3));
        System.out.println(esAlfabetica(palabra4));
    }
}
