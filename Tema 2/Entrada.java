import java.util.Scanner;

public class Entrada {

    public static int getinteger(){
        String number, fnumber = "";
        Scanner input = new Scanner(System.in) ;
        boolean impconv, negative ;
        
        do{
            impconv = false ;
            negative = false ;

            System.out.println("Give me an integer number:");
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
                System.out.println("Please, give me an integer number. Just it. \n\n");
            }
        }while(impconv) ;

        input.close();


        for (int i=0; i<number.length(); ++i){
            if (number.charAt(i)!= ' '){
                fnumber += number.charAt(i) ;
            }
        }
        return Integer.parseInt(fnumber) ;
    }




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

        input.close();
        
        for (int i=0; i<number.length(); ++i){
            if (number.charAt(i)!= ' '){
                fnumber += number.charAt(i) ;
            }
        }
        return Double.parseDouble(fnumber) ;
    }
}