package Calculadora;

public class OperacionesBasicas {
    public static double suma(double num1, double num2) {
        return num1+num2;
    }
    public static double resta(double num1, double restador) {
        return num1 - restador;
    }
    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }
    public static double division(double num1, double divisor) {
        return num1/ divisor;
    }

    public double menu(String cadena) {
        String[] operadores = cadena.split(" ");
        double num1 = Double.valueOf(operadores[0]), num2 = Double.valueOf(operadores[2]), resultado = 0;
        char operacion = operadores[1].charAt(0);

        if (operacion == '+'){ resultado = suma(num1, num2);}
        else if (operacion == '-'){ resultado = resta(num1, num2);}
        else if (operacion == 'x'){ resultado = multiplicacion(num1, num2);}
        else if (operacion == '/'){ resultado = division(num1, num2);}

        Traductor.setAns(resultado);
        return resultado;
    }
}
