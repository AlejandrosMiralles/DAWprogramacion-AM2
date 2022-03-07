package cutrecloud.cutre_cloud_inferior;
import java.util.Scanner;

public class UsuarioInput{

    static void crearNuevoUsuario(Scanner lector){
        String email, password;

        System.out.println("Email: ");
        email = lector.next();
        System.out.println("Contraseña: ");
        password = lector.next();

        new Usuario(email, password).writeXML();
    }

    static boolean menu(Scanner lector){
        int option;
        boolean result;

        System.out.println("___________________Menu__________________");
        System.out.println("1 para crear el XML de un nuevo Usuario\n0 para salir\nEscoja una opción");
        option = lector.nextInt();
    
        switch(option){
            case 0: result = true;
                System.out.println("Gracias por colaborar con nosotros");
                break;

            case 1: crearNuevoUsuario(lector);
            default:
                result = false;
        }

        return result;
    }
    public static void main(String[] args) {
        boolean stop;
        Scanner lector = new Scanner(System.in);
        
        do {
            stop = menu(lector);
        } while (! stop);
    }
}