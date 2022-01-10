import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.nio.Buffer;

public class Palabras4 {
    public static String leerfichero(String ruta){

        BufferedReader br = null;

        String everything = "";

        try {

            br = new BufferedReader(new FileReader(ruta));

            StringBuilder sb = new StringBuilder();

            String line = br.readLine();

            while (line != null) {

                sb.append(line);

                sb.append(System.lineSeparator());

                line = br.readLine();

            }

            everything = sb.toString();

        }catch(Exception e){

            e.printStackTrace();

        } finally {

            try {

                if (br != null)

                    br.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

        return everything;
    }

    public static void main(String[] args) {

        String cadena = leerfichero("./Carpeta_Directorios/fichero.txt");

        System.out.println("Hay "+Palabras2.contadorPalabras(cadena)+" palabras.");
       

    }
}
