//import java.util.Scanner;

public class Criptografia {
    public static String encriptador(String cadena, int clave) {
        int utfOcho;
        char letraEncrip;
        String cadEncrip = "";

        for (int i = 0; i < cadena.length(); i++) {
            utfOcho = Character.getNumericValue(cadena.charAt(i));

            if (utfOcho<=9 && utfOcho>=0){
                letraEncrip = Encriptar.encripDigitos(cadena.charAt(i), clave);
            }else if (utfOcho<36 && utfOcho>0){
                letraEncrip= Encriptar.encripLetra(cadena.charAt(i), clave);
            }else{
                letraEncrip = cadena.charAt(i);
            }
            cadEncrip += letraEncrip;
        }
        return cadEncrip;
    }

    public static String desencriptador(String cadena, int clave) {
        int utfOcho;
        char letraDesencrip;
        String cadDesencrip = "";

        for (int i = 0; i < cadena.length(); i++) {
            utfOcho = Character.getNumericValue(cadena.charAt(i));

            if (utfOcho<=9 && utfOcho>=0){
                letraDesencrip = Desencriptar.desencripDigito(cadena.charAt(i), clave);
            }else if (utfOcho<36 && utfOcho>0){
                letraDesencrip= Desencriptar.desencripLetra(cadena.charAt(i), clave);
            }else{
                letraDesencrip = cadena.charAt(i);
            }
            cadDesencrip += letraDesencrip;
        }
        return cadDesencrip;
    }

    public static void main(String[] args) {
        String cadena = "Ler uv crj kvteztrj uv tizgkfxirwzr drj iluzdvekrizrj tfejzjkv ve jljkzklzi trur lef uv cfj trirtkvivj gfi fkif jzklruf e gfjztzfevj drj r cr uvivtyr uvc rsvtvurizf. Jz e = 5, jljkzklzivdfj cr 'r' gfi cr 't', cr 's' gfi cr 'u', p rjz jltvjzmrdvekv. Vc gifscvdr hlv rgrivtv tfe crj lckzdrj e cvkirj uvc rcwrsvkf kzvev wrtzc jfcltzfe: ve vc vavdgcf, cr cvkir 'p' jv jljkzklpv gfi cr 'r' p cr 'q' gfi cr 's'. Cr jljkzkltzfe uvsv rgcztrijv r crj cvkirj dzeljtlcrj p drpljtlcrj p r cfj uzxzkfj. Crj cvkirj ef uvsve zetclzi trirtkvivj ef zexcvjvj (vj uvtzi jze ez rtvekfj)";
        int clave = 33;
        
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Dame una clave:");
        clave = input.nextInt();
        System.out.println("Dame una frase: ");
        cadena = input.nextLine();
        input.close();
        */

        System.out.println("Encriptado: "+encriptador(cadena, clave));
        System.out.println("\n\nDesencriptado: "+desencriptador(cadena, clave));
    }
}
