package Control04;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.util.Scanner;

class Agenda {
    private static final String path = "Controles/Control04/";
    private static final String usersAsTextFileName = "agenda.dat";
    private static final String usersAsObjectsFileName = "agendaObjects.dat";

    public static void userWriter() throws IOException {
        String givenName;
        String username;
        String email;
        String phoneNumber;
        User userToWrite;

        Scanner input = new Scanner(System.in);

        givenName = input.next();
        username = input.next();
        email = input.next();
        phoneNumber = input.next();

        input.close();

        userToWrite = new User(givenName, username, email, phoneNumber);

        writeUsersAsText(givenName, username, email, phoneNumber);

        writeUsersAsObjects(userToWrite);
    }

    public static void userWriter(String givenName, String username, String email, String phoneNumber)
                throws IOException {
        User userToWrite = new User(givenName, username, email, phoneNumber);

        writeUsersAsText(givenName, username, email, phoneNumber);
        writeUsersAsObjects(userToWrite);
    }

    private static void writeUsersAsText(String givenName, String username, String email, String phoneNumber) 
                                        throws IOException{
        File fileToWrite = new File(path + usersAsTextFileName);
        boolean dontOverwrite = true;

        fileToWrite.createNewFile();

        FileWriter writer = new FileWriter(fileToWrite, dontOverwrite);
        
        writer.append(givenName + "\t");
        writer.append(username + "\t");
        writer.append(email + "\t");
        writer.append(phoneNumber + "\n");


        writer.close();
    }

    private static void writeUsersAsObjects(User userToWrite) throws IOException {
        File fileToWrite = new File(path + usersAsObjectsFileName);
        boolean dontOverwrite = true;

        fileToWrite.createNewFile();

        ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(
                                                            fileToWrite, dontOverwrite));

        writer.writeObject(userToWrite);

        writer.close();
    }

    private static void mainUsedInTheShell(String[] args) throws Exception {
        //TODO: "destruir" este método cuando haya terminado de depurar
        for (int usersWritten = 0; usersWritten < args.length / 4; usersWritten++) {
            int newUserPosition = usersWritten * 4;
            userWriter(args[newUserPosition + 0], args[newUserPosition + 1],
                    args[newUserPosition + 2], args[newUserPosition + 3]);
        }
    }


    public static void printTextUsers() throws IOException{
        File fileToRead = new File(path + usersAsTextFileName);
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileToRead));

            String[] userInfo;
            User userToPrint;
            String userRead = reader.readLine();
            while(userRead != null){
                userInfo = userRead.split(" +|\t");
                userToPrint = new User(userInfo[0], userInfo[1], userInfo[2], 
                                                userInfo[3]);

                System.out.println(userToPrint + "\n");


                userRead = reader.readLine();
            }
            //Nunca llega aquí
            reader.close();
        } catch (FileNotFoundException e) {
            //No se ha encontrado el fichero, ergo o aún no se ha creado  o se ha borrado
            return ;
        } 
    }

    public static void printObjectUsers() throws IOException, ClassNotFoundException{
        File fileToRead = new File(path + usersAsObjectsFileName);

        try {
            ObjectInputStream reader = new ObjectInputStream(new FileInputStream(fileToRead));

            try {
                User userToPrint = (User) reader.readObject(); 
                while(userToPrint != null){
                    System.out.println(userToPrint.toString() + "\n");

                    userToPrint = (User) reader.readObject();
                }
            } catch (EOFException e) {
                reader.close();
            }

            reader.close();
        } catch (FileNotFoundException e) {
            //No se ha encontrado el fichero, ergo o aún no se ha creado  o se ha borrado
            return ;
        }
    }
   
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            mainUsedInTheShell(args);
        }

        //TODO: hacer código para depurar
        
        try {
            writeUsersAsObjects(new User("pepe", "Garcia", "elchulo@sf.es", "34656446"));
            writeUsersAsObjects(new User("Manolo", "Perez", "elguaperas@internet.com", "3453456"));

            System.out.println("Leyendo el fichero de objetos: ");
            printObjectUsers();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

class User implements Serializable {
    private String givenName;
    private String username;
    private String email;
    private String phoneNumber;

    public User(String givenName, String username, String email, String phoneNumber) {
        this.givenName = givenName;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("Given Name: " + givenName);
        result.append("\nUsername: " + username);
        result.append("\nEmail: " + email);
        result.append("\nPhone number: " + phoneNumber);

        return result.toString();
    }

}