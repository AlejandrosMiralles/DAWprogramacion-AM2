import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;

public class ClienteDB {
    private Connection connection;

    public ClienteDB(String urlDataBase, String user, String password) throws Exception {
        Context context = new InitialContext();
        DataSource datasource = (DataSource)context.lookup(urlDataBase);
        connection = datasource.getConnection(user, password);

        /*
        connection = DriverManager.getConnection(urlDataBase, user, password);
        */
    }

    public static void main(String[] args) {
        try {
            String urlDataBase = "jdbc:mysql://192.168.204.179/phpmyadmin";
            ClienteDB tester = new ClienteDB(urlDataBase, "phpmyadmin", "phpmyadmin");
        
            System.out.println("Se ha conectado!!");

        } catch (Exception e) {
            System.err.println("Hubo un problema :(((\n\n"+e);
        }    
    }
}