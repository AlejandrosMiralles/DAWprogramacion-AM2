public class Desencriptar {
    public static char desencripDigito(char digito, int clave) {
        int utfOcho = Character.getNumericValue(digito);
        int multiploSol = utfOcho-clave;

        for (int i = 10; multiploSol<0; multiploSol+= i) {}
        int solucion= multiploSol;

        return Character.forDigit(solucion, 10);
    }

    public static char desencripLetra(char letra, int clave) {
        boolean mayus = false;
        int utfOcho = Character.getNumericValue(letra);
        int multiploSol = utfOcho-clave;
        multiploSol-= 10;

        if (Character.isUpperCase(letra)){
            mayus = true;
        }

        for (int i = 26; multiploSol<10; multiploSol+= i) {}
        int solucion = multiploSol;

        char desencriptado = Character.forDigit(solucion, 36);
        if (mayus){
            desencriptado = Character.toUpperCase(desencriptado);
        }

        return desencriptado;
    }

    public static void main(String[] args) {
        String cadena;
       // Scanner input = new Scanner(System.in);
        int clave = 33, utfOcho;
        char encriptado;

        cadena = "Ler uv crj kvteztrj uv tizgkfxirwzr drj iluzdvekrizrj tfejzjkv ve jljkzklzi trur lef uv cfj trirtkvivj gfi fkif jzklruf e gfjztzfevj drj r cr uvivtyr uvc rsvtvurizf. Jz e = 5, jljkzklzivdfj cr 'r' gfi cr 't', cr 's' gfi cr 'u', p rjz jltvjzmrdvekv. Vc gifscvdr hlv rgrivtv tfe crj lckzdrj e cvkirj uvc rcwrsvkf kzvev wrtzc jfcltzfe: ve vc vavdgcf, cr cvkir 'p' jv jljkzklpv gfi cr 'r' p cr 'q' gfi cr 's'. Cr jljkzkltzfe uvsv rgcztrijv r crj cvkirj dzeljtlcrj p drpljtlcrj p r cfj uzxzkfj. Crj cvkirj ef uvsve zetclzi trirtkvivj ef zexcvjvj (vj uvtzi jze ez rtvekfj)";
        /*
        System.out.println("Dame una frase: ");
        cadena = input.nextLine();
        input.close();
*/
        for (int i = 0; i < cadena.length(); i++) {
            utfOcho = Character.getNumericValue(cadena.charAt(i));

            if (utfOcho<=9 && utfOcho>=0){
                encriptado = desencripDigito(cadena.charAt(i), clave);
            }else if (utfOcho<36 && utfOcho>0){
                encriptado= desencripLetra(cadena.charAt(i), clave);
            }else{
                encriptado = cadena.charAt(i);
            }

            System.out.print(encriptado);
        }
        System.out.println("");
    }
}
