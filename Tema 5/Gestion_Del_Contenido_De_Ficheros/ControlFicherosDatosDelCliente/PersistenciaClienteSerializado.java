package Gestion_Del_Contenido_De_Ficheros.ControlFicherosDatosDelCliente;

import java.util.ArrayList;
import java.io.EOFException;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class PersistenciaClienteSerializado {
    public static void write(ArrayList<Cliente> listaDeClientes) throws IOException{
        final String RUTA = "Tema 5/Gestion_Del_Contenido_De_Ficheros/ControlFicherosDatosDelCliente/";
        final String NOMBRE = "clientes.dat";
        File archivoDestino = new File(RUTA + NOMBRE);
        ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(archivoDestino));

        for (Cliente cliente : listaDeClientes) {
            escritor.writeObject(cliente);
        }

        escritor.close();
    }

    public static ArrayList<Cliente> read(String fichero) throws IOException {
        ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
        File archivoOrigen = new File(fichero);
        ObjectInputStream lector = new ObjectInputStream(new FileInputStream(archivoOrigen));

        try {
            Cliente clienteAAnadir = (Cliente) lector.readObject() ;        
            while( true ){

                listaDeClientes.add(clienteAAnadir);

                clienteAAnadir = (Cliente) lector.readObject();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error, se ha encontrado una clase que no debería estar en el fichero");
        } catch (EOFException e){

            lector.close();
            return listaDeClientes;
        
        }
        //Estas dos lineas de código son inútiles. Están para que el copilador no se queje
        lector.close();
        return listaDeClientes;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Test del write()
        
        // /*

        ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();

        listaDeClientes.add(new Cliente("235d", "Julio", "Puff puff", "kk@du.com"));
        listaDeClientes.add(new Cliente("254354735d", "Julia", "Puff pufff", "kak@sdf.com"));
        listaDeClientes.add(new Cliente("23452354F", "Julie", "Puff puffff", "kk@d.com"));
        listaDeClientes.add(new Cliente("23452345354F", "Juliu", "Puff pufffff", "kk@sdcv.com"));

        write(listaDeClientes);
        // */
    
        System.out.println("Write completado con éxito");


        //Test del read()    
        // /**
        String ruta = "Tema 5/Gestion_Del_Contenido_De_Ficheros/ControlFicherosDatosDelCliente/";
        String nombreFichero = "clientes.dat";
        
        ArrayList<Cliente> listaDeClientes2;

        listaDeClientes2 = read(ruta + nombreFichero);

        for (Cliente cliente : listaDeClientes2) {
            System.out.println(cliente + "\n");
        }
        // */
    
    }
}
