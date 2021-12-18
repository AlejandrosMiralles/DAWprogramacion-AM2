package Calculadora;

import java.util.ArrayList;
import java.util.List;

public class Traductor {

    public static String ans;

    public static void setAns(double resultado) {
        ans = Double.toString(resultado);
    }

    public static String especiales = " ,.+-x/";


    public static void setEspeciales(String especial) {
        especiales += especial;
    }



    public static boolean validadorLetras(String cadena) {

        List<Character> lista = new ArrayList<>();
    
       for (int i = 0; i < especiales.length(); i++) {
           lista.add(especiales.charAt(i));
       }

        for (int i = 0; i < cadena.length(); i++) {
            if (!('0'<=Character.codePointAt(cadena, i) && Character.codePointAt(cadena, i)<='9')
                && !lista.contains(cadena.charAt(i))){
                    return false;
            }
        }
        return true;
    }

    public static boolean validadorComas(String cadena) {
        boolean numero = false, coma = false;
        
        for (char caracter : cadena.toCharArray()) {
            if ((caracter == ',' || caracter == '.') && ((!numero) || (coma))){
                return false;
            }
            
            if ('0'<= caracter && caracter <= '9'){
                numero = true;
            }else if((caracter == ',' || caracter == '.') && coma){
                return false; //detrás de la coma debe haber algún número
            }else if (caracter == ' ' || caracter == '+' || caracter == '-' || caracter == 'x' || caracter == '/'){
                numero = false;
                coma = false;
            }else if(caracter == ',' || caracter == '.'){
                coma = true;
            }
        }

        return true;

    }

    public static boolean validadorOrden(String cadena) {
        String[] palabras = cadena.split(" ");

        if (palabras.length != 3){ return false;} //Aquí aprovecho y me aseguro que hayan 3 digítos 
        
        String num1 = palabras[0], num2 = palabras[2];
        char operador = palabras[1].charAt(0);

        if (!(num1.charAt(0)>='0' && num1.charAt(0)<='9')){ return false;}
        if (!(num2.charAt(0)>='0' && num2.charAt(0)<='9')){ return false;}
        if (!(operador == '+' || operador == '-' || operador == '/' || operador == 'x')){ return false;}

        return true;
    }

    public static boolean validadorExcepciones(String cadena) {
        String[] operandos = cadena.split(" ");

        if (operandos[1].charAt(0) == '/' && operandos[2].equalsIgnoreCase("0.0")){ return false;}

        return true;
    }


    public static String separador(String cadena){
        String[] operandos;
            cadena=cadena.trim();

            cadena = cadena.replace("+", " + ");  
            
            cadena = cadena.replace("+", " + "); 
            cadena = cadena.replace("-", " - "); 
            cadena = cadena.replace("x", " x "); 
            cadena = cadena.replace("/", " / ");                              
    
            cadena=cadena.replaceAll(",", ".");
            cadena=cadena.replaceAll(" +", " ");
            
            
            // Dividir la cadena en partes por el carácter espacio (devuelve un array con cada una de las partes)
            operandos = cadena.split(" ");
        
            cadena = "";
            for (int i = 0; i < operandos.length-1; i++) {
                cadena+= operandos[i] + " ";
            }
            cadena += operandos[operandos.length-1];

            return cadena;
    }

    public static String eliminarCeros(String cadena) {
        String[] operadores = cadena.split(" ");
        double num1 = Double.valueOf(operadores[0]), num2 = Double.valueOf(operadores[2]);

        operadores[0] = String.valueOf(num1);
        operadores[2] = String.valueOf(num2);

        cadena = "";
        
        for (int i = 0; i < operadores.length-1; i++) {
            cadena+= operadores[i] + " ";
        }
        cadena += operadores[operadores.length-1];

        return cadena;       
    }
    

    public String descodificar(String cadena) {
        cadena = cadena.toLowerCase(); 

        if (cadena =="" || cadena == null){ return "Operación incorrecta";}
    
        // ! = no lo supera
        if (ans != null){
            cadena = cadena.replaceAll("ans", ans);
        }

        if (!validadorLetras(cadena)){
            return "Operación incorrecta";
        }
        if (!validadorComas(cadena)){ return "Operación incorrecta"; }

        cadena = separador(cadena);
        cadena = eliminarCeros(cadena);

        if(!validadorOrden(cadena)){ return "Operación incorrecta";}

        if(!validadorExcepciones(cadena)){ return "Operación incorrecta";}

        return cadena;
        
        
    }


    /*
    public static void main(String[] args) {
        Traductor prueba = new Traductor();

        System.out.println(prueba.descodificar("svns"));
        System.out.println(prueba.descodificar("ans"));
        System.out.println(prueba.descodificar("45.1    + 60"));
        System.out.println(prueba.descodificar("3X2,900000"));
        System.out.println(prueba.descodificar("30.1 - 9 sdv"));
        System.out.println(prueba.descodificar("sc9 / 8"));
        System.out.println(prueba.descodificar(""));
        System.out.println(prueba.descodificar("50 + 00000"));
        System.out.println(prueba.descodificar("4\n- 3"));
    }
    */
}
