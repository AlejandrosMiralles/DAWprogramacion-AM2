package Calculadora;

import java.util.ArrayList;
import java.util.List;

public class Traductor {

    public static String ans;

    public static void setAns(double resultado) {
        ans = Double.toString(resultado);
    }

    public static String especiales = " ,.+-x/1234567890";

    public static String numeros = "1234567890";
    


    public static void setEspeciales(String especial) {
        especiales += especial;
    }



    public static boolean validadorLetras(String cadena) {
        //Comprueba que en la cadena no haya ningún elemento no deseado, como un a o un svddf

        List<Character> lista = new ArrayList<>();
    
       for (int i = 0; i < especiales.length(); i++) {
           lista.add(especiales.charAt(i));
       }

        for (int i = 0; i < cadena.length(); i++) {
            if (!lista.contains(cadena.charAt(i))){
                    return false;
            }
        }
        return true;
    }

    public static boolean validadorComas(String cadena) {
        //Comprueba que las comas solo se usen para números decimales 

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
        //Comprueba que se cumpla la estructura de "numero operador numero"

        String[] palabras = cadena.split(" ");

        if (palabras.length != 3){ return false;} //Aquí aprovecho y me aseguro que hayan 3 digítos 
        
        String num1 = palabras[0], num2 = palabras[2];
        char operador = palabras[1].charAt(0);


        if (!(num1.charAt(0)>='0' && num1.charAt(0)<='9')){ 
            if (!(num1.charAt(0) == '-' && num1.length()>1)){
                return false;
            } 
        }

        if (!(num2.charAt(0)>='0' && num2.charAt(0)<='9')){ 
            if (!(num2.charAt(0) == '-' && num2.length()>1)){
                return false;
            } 
        }

        if (!(operador == '+' || operador == '-' || operador == '/' || operador == 'x')){ return false;}


        return true;
    }

    public static boolean validadorExcepciones(String cadena) {
        //Comprueba que no haya operaciones que den errores matemáticos.    
                //En este programa se reduce a dividir entre 0, por ahora
        
        String[] operandos = cadena.split(" ");

        if (operandos[1].charAt(0) == '/' && operandos[2].equalsIgnoreCase("0.0")){ return false;}

        return true;
    }


    public static String separador(String cadena){
        //Cambia los '.' por ",", elimina los espacios innecesarios y facilita la comprensión de la cadena
                //añadiendo un espacio entre cada operador.

        String[] operandos;
        cadena=cadena.trim();

        cadena = cadena.replace("+", " + "); 
        cadena = cadena.replace("-", " - "); 
        cadena = cadena.replace("x", " x "); 
        cadena = cadena.replace("/", " / ");                              
    
        cadena=cadena.replaceAll(",", ".");
        cadena=cadena.replaceAll(" +", " ");
            
        cadena = cadena.trim();

        operandos = cadena.split(" ");
        
        cadena = "";
            
        for (int i = 0; i < operandos.length-1; i++) {
            cadena+= operandos[i] + " ";
        }
        cadena += operandos[operandos.length-1];

        return cadena;
    }

    public static String eliminarCeros(String cadena) {
        //Elimina cualquier 0 innecesario. Por ejemplo num1= 0000.000 o num2 =35345.000000.
                //El resultado sería num1 = 0.0 y num2= 35345.0

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

    public static String detectarNegativos(String cadena) {
        //Detecta la presencia de números negativos para tratarlos como tal

        String[] operadores = cadena.split(" ");
        if (operadores.length<=3){ return cadena; }

        boolean numero = false;

        for (int i = 0; i < operadores.length; i++) {
            if (operadores[i] == null || operadores[i] == ""){ 
                //Si es null, me da una excepción. Pongo este if para evitarla
            }else if (operadores[i].charAt(0) >= '0' && operadores[i].charAt(0) <= '9'){
                numero = true;
            }else if (operadores[i].charAt(0) == '-' && !numero){
                if (i != operadores.length-1){
                    if (operadores[i+1].charAt(0) >= '0' && operadores[i+1].charAt(0) <= '9'){
                        operadores[i] += operadores[i+1];
                        operadores[i+1] = null;

                        numero = true;
                    }
                }
            }else if(operadores[i] != null){ 
                numero = false;
            }
        }

        cadena = "";
        for (int i = 0; i < operadores.length; i++) {
            
            if ( i != 0 && operadores[i-1] == null){
                cadena += " ";
            }

            if (operadores[i] != null && i != operadores.length-1){
                if (operadores[i+1] != null){
                    cadena += operadores[i] + " ";
                }else{
                    cadena += operadores[i];
                }
            }else if(operadores[i] != null){
                cadena += operadores[i];
            }
        }

        return cadena;
    }
    

    public String descodificar(String cadena) {
        //Comprueba que una operación (cadena) está bien formada y devuelve la misma cadena, pero más comprensible
                //para el aritmético.

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
        cadena = detectarNegativos(cadena);


        if(!validadorOrden(cadena)){ return "Operación incorrecta";}

        cadena = eliminarCeros(cadena); //Este código admite solo cadenas de operaciones BIEN FORMADAS

        if(!validadorExcepciones(cadena)){ return "Operación incorrecta";}

        return cadena;   
    }


    
    public static void main(String[] args) {
        Traductor prueba = new Traductor();

        System.out.println(prueba.descodificar("45.1    + -60"));
        System.out.println(prueba.descodificar("3X2,900000"));
        System.out.println(prueba.descodificar("30.1 -- 9 "));
        System.out.println(prueba.descodificar("98 -- 3"));
        System.out.println(prueba.descodificar("-50 + 00000"));
        System.out.println(prueba.descodificar("4 - -3"));
    }
   
}
