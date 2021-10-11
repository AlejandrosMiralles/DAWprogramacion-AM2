import java.util.Scanner ;

public class Ejercicio17 {
    public static void main(String[] args) { 
        byte mes ;
        Scanner inputValue = new Scanner(System.in) ;
        
        System.out.println("Dime el número de un mes y te digo los días que tiene. Por ejemplo, '1' = 31 días. Era Enero.\nDime:") ;
        mes = inputValue.nextByte() ;

        inputValue.close() ;

        if (1<=mes && mes<=12){
            switch (mes){
                case 1: 
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: 
                    System.out.println("El mes seleccionado tiene 31 días.") ;
                    break ;
                case 2:
                    System.out.println("El mes seleccionado tiene 28 días.") ;
                    break ;
                default:
                    System.out.println("El mes seleccionado tiene 30 días.") ;
            }
        }else{
                System.out.println("No existe el mes número "+mes) ;
            
        }
    }
}
