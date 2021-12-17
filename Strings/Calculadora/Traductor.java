package Calculadora;

import java.util.ArrayList;

public class Traductor {

    public String ans;

    public void setAns(double resultado) {
        ans = (String) resultado;
    }

    public static boolean validador(String cadena) {

        for (int i = 0; i < cadena.length(); i++) {
            if (!(1<Character.codePointAt(cadena, i) && Character.codePointAt(cadena, i))
                || !lista.contains(cadena.charAt(i))){
                    return false;
            }
        }
        return true;
    }

    public String descodificar(String cadena) {
        cadena = cadena.toLowerCase(); 
    
        if (ans != null){
            cadena = cadena.replaceAll("ans", ans);
        }

        if (validador(cadena)){
            return "Operación incorrecta";
        }
        
        
    }
}
