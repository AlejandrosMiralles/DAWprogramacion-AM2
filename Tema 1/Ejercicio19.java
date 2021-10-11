//Programa para calcular un salario (neto y sucio) y los impuestos pagados de ese salario.

import java.util.Scanner ;

public class Ejercicio19 {
    public static void main(String[] args) {
        double euroshora, horas, salariosucio, salariolimpio, impuestos ;
        Scanner lector = new Scanner(System.in) ;

        System.out.println("Cuántos euros cobras por horas?:") ;
        euroshora = lector.nextDouble() ;

        System.out.println("Cuánto has trabajado? En horas:") ;
        horas = lector.nextDouble() ;

        lector.close() ;

        if (horas > 35){
            //Separo las primeras 35 horas del resto, calculo el salario de las dos horas por separado y luego las suma
            salariosucio = 35 * euroshora + (horas - 35) * euroshora * 1.5 ;
        }else{
            salariosucio = horas * euroshora ;
        }
 
        if (salariosucio <= 500){
            impuestos = 0 ;
            salariolimpio = salariosucio ;

        }else if(salariosucio <= 900){
            impuestos = (salariosucio - 500) * 0.25 ;
            salariolimpio = salariosucio - impuestos ;
        
        }else{
            impuestos = (salariosucio - 500 ) * 0.25 + (salariosucio - 900) * 0.45 ;
            salariolimpio =  salariosucio - impuestos ;
        } 
        
        System.out.println("Con un salario de "+euroshora+" euros y trabajando durante "+horas+" horas, el salario será:") ;
        System.out.println("Salario limpio: "+salariolimpio+" euros.\nSalario sucio: "+salariosucio+" euros.\nDel salario, los impuestos se llevan: "+impuestos+" euros.") ;        
    
    }
}
