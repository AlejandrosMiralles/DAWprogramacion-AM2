package Gestion_Del_Contenido_De_Ficheros.ControlFicherosDatosDelCliente;

import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class PersistenciaCliente {
    public static void write(ArrayList<Cliente> listaDeClientes) throws IOException{
        final String RUTA = "Tema 5/Gestion_Del_Contenido_De_Ficheros/ControlFicherosDatosDelCliente/";
        final String NOMBRE = "clientes.dat";
        File archivoDestino = new File(RUTA + NOMBRE);
        BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoDestino));

        for (Cliente cliente : listaDeClientes) {
            escribirInfoDeUnCliente(escritor, cliente);
        }

        escritor.close();
    }

    private static void escribirInfoDeUnCliente(BufferedWriter escritor, Cliente cliente) throws IOException {
        escritor.write("" + cliente.getId());
        escritor.write(", " + cliente.getNif());
        escritor.write(", " + cliente.getNombre());
        escritor.write(", " + cliente.getApellidos());
        escritor.write(", " + cliente.getEmail()+"\n");
    }

    
    public static ArrayList<Cliente> read(String fichero) throws IOException{
        ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
        File archivoOrigen = new File(fichero);
        BufferedReader lector = new BufferedReader(new FileReader(archivoOrigen));

        String[] clienteInfo;
        Cliente clienteAAnadir;
        String cliente = lector.readLine();
        while( cliente != null || cliente == ""){
            clienteInfo = cliente.split(", ");

            if (clienteInfo.length == 5){
                clienteAAnadir = new Cliente(clienteInfo[1], clienteInfo[2],
                                             clienteInfo[3], clienteInfo[4]);

                clienteAAnadir.setId(Integer.parseInt(clienteInfo[0]));
            
                listaDeClientes.add(clienteAAnadir);
            }

            cliente = lector.readLine();
        }
        lector.close();

        return listaDeClientes;
    }

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
        /**
         * String ruta = "Tema 5/Gestion_Del_Contenido_De_Ficheros/ControlFicherosDatosDelCliente/";
        String nombreFichero = "clientes.dat";
        
        ArrayList<Cliente> listaDeClientes;

        listaDeClientes = read(ruta + nombreFichero);

        for (Cliente cliente : listaDeClientes) {
            System.out.println(cliente + "\n");
        }
         */
    
    }

}
