package Gestion_Del_Contenido_De_Ficheros.ControlFicherosDatosDelCliente;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.Gson;

public class PersistenciaClienteAJson {
    public static void write(ArrayList<Cliente> listaDeClientes) throws IOException{
        final String RUTA = "Tema 5/Gestion_Del_Contenido_De_Ficheros/ControlFicherosDatosDelCliente/";
        final String NOMBRE = "clientes.json";
        File archivoDestino = new File(RUTA + NOMBRE);
        BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoDestino));

        escritor.write("[\n");

        for (Cliente cliente : listaDeClientes) {
            if (cliente != listaDeClientes.get(0)){
                escritor.write(",\n");
            }

            escribirInfoDeUnClienteEnFormatoJson(escritor, cliente);
        }

        escritor.write("\n]");

        escritor.close();
    }

    private static void escribirInfoDeUnClienteEnFormatoJson(BufferedWriter escritor, Cliente cliente) throws IOException {
        String representacionJson;
        Gson gson = new Gson();

        representacionJson = gson.toJson(cliente);
        escritor.write(representacionJson);

    }

    //    /*
    public static ArrayList<Cliente> read(String fichero) throws IOException{
        ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
        File archivoOrigen = new File(fichero);
        BufferedReader lector = new BufferedReader(new FileReader(archivoOrigen));
        Gson gson = new Gson();

        Matcher matcher;
        Pattern patron = Pattern.compile("\\{.*\\}");
        Cliente clienteAAnadir;
        String cliente = lector.readLine();
        while( cliente != null || cliente == ""){
            matcher = patron.matcher(cliente);

            while(matcher.find()){
                clienteAAnadir = gson.fromJson(matcher.group(), Cliente.class);
                listaDeClientes.add(clienteAAnadir);
            }

            cliente = lector.readLine();
        }
        lector.close();

        return listaDeClientes;
    }
    //    */

    public static void main(String[] args) throws IOException {
        //Test del write()
        
    // /*

        ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();

        listaDeClientes.add(new Cliente("235d", "Julio", "Puff puff", "kk@du.com"));
        listaDeClientes.add(new Cliente("254354735d", "Julia", "Puff pufff", "kak@com3"));
        listaDeClientes.add(new Cliente("23452354F", "Julie", "Puff puffff", "kk.com"));
        listaDeClientes.add(new Cliente("23452345354F", "Juliu", "Puff pufffff", "kkcom"));

        write(listaDeClientes);
    // */
    


        //Test del read()    
    //  /*
        String ruta = "Tema 5/Gestion_Del_Contenido_De_Ficheros/ControlFicherosDatosDelCliente/";
        String nombreFichero = "clientes.json";
        
        ArrayList<Cliente> listaDeClientes2;

        listaDeClientes2 = read(ruta + nombreFichero);

        for (Cliente cliente : listaDeClientes2) {
            System.out.println(cliente + "\n");
        }
    //  */
    
    }
}
