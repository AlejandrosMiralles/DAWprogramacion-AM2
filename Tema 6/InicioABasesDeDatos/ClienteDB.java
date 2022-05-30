package InicioABasesDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;

import Gestion_Del_Contenido_De_Ficheros.ControlFicherosDatosDelCliente.Cliente;

//Solución? https://linuxhint.com/ssh-permission-denied-publickey-error/

public class ClienteDB {
    private Connection connection;

    public ClienteDB(String urlDataBase, String user, String password) throws SQLException, SQLTimeoutException {
        connection = DriverManager.getConnection(urlDataBase, user, password);
    }

    public int countClientes() throws SQLException{
        final String sentencia = "select count(*) from Cliente";

        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sentencia);
    
        int numberOfClients = -1;
        while(result.next()){
            numberOfClients = result.getInt(1);
        }

        return numberOfClients;
    }

    public void printTable() throws SQLException{
        final String sentencia = "select * from Cliente";
    
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sentencia);
        
        StringBuilder row;
        while(result.next()){
            row = new StringBuilder();

            row.append("Cliente número " + result.getLong(1));
            row.append("\n\tNombre: " + result.getString(2));
            row.append("\n\tApellidos: " + result.getString(3));
            row.append("\n\tEmail: " + result.getString(4));
            row.append("\n\tNIF: " + result.getString(5));

            System.out.println(row + "\n");
        }
    
    }

    public boolean insertCliente(Cliente clienteToAdd){
        boolean hasBeenAdded;

        final String sentencia = "insert into Cliente (nombre, apellidos, email, nif) values ('" +
                        clienteToAdd.getNombre() + "', '" + clienteToAdd.getApellidos() + "', '" +
                        clienteToAdd.getEmail() + "', '" + clienteToAdd.getNif() + "');";

        try {
            Statement statement = connection.createStatement();

            statement.executeUpdate(sentencia);
            
            hasBeenAdded = true;
        } catch (SQLException e) {
            hasBeenAdded = false;

            System.out.println("\n" + e);;
        }

        return hasBeenAdded;
    }

    public boolean deleteClienteByHisName(Cliente clienteToRemove){
        boolean hasBeenRemoved;

        final String sentencia = "delete from Cliente where " +
                                "nombre = '"+ clienteToRemove.getNombre() + "' and " +
                                "apellidos = '" + clienteToRemove.getApellidos() + "';";

        try {
            Statement statement = connection.createStatement();
    
            statement.executeUpdate(sentencia);
            
            hasBeenRemoved = true;
        } catch (SQLException e) {
            hasBeenRemoved = false;

            System.out.println("\n" + e);;
        }

        return hasBeenRemoved;
    }
   
    public static void main(String[] args) {
        try {
            String urlDataBase = "jdbc:mysql://10.0.2.4/clientes";
            ClienteDB tester = new ClienteDB(urlDataBase, "phpmyadmin", "phpmyadmin");
            
            Cliente clienteToAdd = new Cliente("235434A", "Juliont", "MiercolesALasOcho", "hacerla@renta.com");

            if (tester.deleteClienteByHisName(clienteToAdd)){
                tester.printTable();
            }

        } catch (Exception e) {
            System.err.println("Hubo un problema :(((\n\n"+e);
        }    
    }
}