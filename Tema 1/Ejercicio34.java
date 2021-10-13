import java.util.Scanner ;

public class Ejercicio34 {
    public static void main(String[] args) {

        int dni , digitoControl ;
        Scanner lector = new Scanner(System.in) ;
        char letraControl ;
        String[] array = new String[23] ;

        System.out.println("Dame el número de un NIE y te daré la versión española del mismo:") ;
        dni = lector.nextInt() ;

        System.out.println("Dame la letra de identificación del NIE (el X, Y o Z de delante):") ;
        letraControl = lector.next().charAt(0) ;
        letraControl = Character.toUpperCase(letraControl);

        lector.close() ;

        //Defino el array, que dará la letra según el resto del DNI

        array[0] = "T" ;
        array[1] = "R" ;
        array[2] = "W" ;
        array[3] = "A" ;
        array[4] = "G" ;
        array[5] = "M" ;
        array[6] = "Y" ;
        array[7] = "F" ;
        array[8] = "P" ;
        array[9] = "D" ;
        array[10] = "X" ;
        array[11] = "B" ;
        array[12] = "N" ;
        array[13] = "J" ;
        array[14] = "Z" ;
        array[15] = "S" ;
        array[16] = "Q" ;
        array[17] = "V" ;
        array[18] = "H" ;
        array[19] = "L" ;
        array[20] = "C" ;
        array[21] = "K" ;
        array[22] = "E" ;
        
        if (letraControl == 'X'){
            digitoControl = 0 ;
        }else if (letraControl =='Y'){
            digitoControl = 1 ;
        }else if (letraControl =='Z'){
            digitoControl = 2 ;
        }else{
            digitoControl = 20 ;
        }

        if (digitoControl == 20){
            System.out.println("La letra de control ha de ser X, Y o Z. De otra forma no es un NIE español.") ;
        }else{
            System.out.println("El NIE es: "+digitoControl+dni+array[dni%23]) ;
        }     
    }
}

