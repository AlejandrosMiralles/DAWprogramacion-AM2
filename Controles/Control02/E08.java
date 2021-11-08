package Control02;

import java.util.Scanner; 



public class E08 {

    public static double getdouble(){
        String number, fnumber = "";
        Scanner input = new Scanner(System.in) ;
        boolean impconv, decimal, negative ;
        
        do{
            impconv = false ;
            decimal = false ;
            negative = false ;

            System.out.println("Give me a number:");
            number = input.nextLine() ;

            for (int i=0; i<number.length(); ++i){
                switch(number.charAt(i)){
                    case ' ':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':  break ;

                    case '.':
                        if (!decimal){
                            decimal = true ;
                        }else{
                            impconv = true ;
                        }
                        break ;
                    case '-':
                        if (!negative){
                            negative = true ;
                        }else{
                            impconv = true ;
                        }
                        break ;


                    default: 
                        impconv = true ;
                        break ;

                }
            }
            if (impconv){
                System.out.println("Please, give me a number. Just it. \n\n");
            }
        }while(impconv) ;


        if (decimal){
            decimal = false ;

            for (int i=0; i<number.length(); ++i){
            if (number.charAt(i)!= ' ' && decimal){
                fnumber += number.charAt(i) ;
            }else if (number.charAt(i)=='.'){
                decimal = true ;
            }
        }

        input.close(); 

        return Double.parseDouble(fnumber);  
    }

    public static void main(String[] args) {
        float numero;
        int numeroint;
        Scanner input =new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        numero = input.nextFloat();
        input.close();

        if (numero<0){
            numero*=-1;
        }
 
        numeroint = (int)numero ;

        System.out.println(numero-numeroint);
        System.out.println(13-13.19);
    }
}
