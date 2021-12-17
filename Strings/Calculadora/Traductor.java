package Calculadora;

import java.util.ArrayList;

public class Traductor {

    public String ans;

    public void setAns(double resultado) {
        ans = (String) resultado;
    }

    public static boolean validador(String cadena) {
        char letra;

        for (int i = 0; i < cadena.length(); i++) {
            letra = cadena.charAt(i);
            if (Character.)
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
