public class Parentesis {
    public static void main(String[] args) {
        String cadena = "una cadena (mal (parentizada)";
        boolean malAbierto = false;
        int openParentesis = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)=='('){
                ++openParentesis;
            }else if(cadena.charAt(i)==')'){
                if (openParentesis==0){
                    malAbierto= true;
                }
                --openParentesis;
            }
        }
    
        if (openParentesis==0 && !malAbierto){
            System.out.println("Los paréntesis están bien");
        }else if(malAbierto){
            System.out.println("Hay paréntesis para cerrar cuando no se han abierto otros paréntesis");
        }else{
            System.out.println("Faltan paréntesis por cerrar.");
        }
    }
}
