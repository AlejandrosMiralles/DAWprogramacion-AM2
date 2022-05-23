package Control04;

//http://www.chuidiang.org/java/ficheros/ObjetosFichero.php

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
        String lastname;
        String email;
        String phoneNumber;
        User userToWrite;

        Scanner input = new Scanner(System.in);

        givenName = input.next();
        lastname = input.next();
        email = input.next();
        phoneNumber = input.next();

        input.close();

        userToWrite = new User(givenName, lastname, email, phoneNumber);

        writeUsersAsText(givenName, lastname, email, phoneNumber);

        writeUsersAsObjects(userToWrite);
    }

    public static void userWriter(String givenName, String lastname, String email, String phoneNumber)
                throws IOException {
        User userToWrite = new User(givenName, lastname, email, phoneNumber);

        writeUsersAsText(givenName, lastname, email, phoneNumber);
        writeUsersAsObjects(userToWrite);
    }

    private static void writeUsersAsText(String givenName, String lastname, String email, String phoneNumber) 
                                        throws IOException{
        File fileToWrite = new File(path + usersAsTextFileName);
        boolean dontOverwrite = true;

        fileToWrite.createNewFile();

        FileWriter writer = new FileWriter(fileToWrite, dontOverwrite);
        
        writer.append(givenName + "\t");
        writer.append(lastname + "\t");
        writer.append(email + "\t");
        writer.append(phoneNumber + "\n");


        writer.close();
    }

    private static void writeUsersAsObjects(User userToWrite) throws IOException {
        File fileToWrite = new File(path + usersAsObjectsFileName);
        boolean dontOverwrite = true;

        ObjectOutputStream writer;
        boolean validFile = ! fileToWrite.createNewFile() && isStoringObjects(fileToWrite);
        if (validFile){
            writer = new MyObjectOutputSteam(new FileOutputStream(fileToWrite, dontOverwrite));
        }else{  
            writer = new ObjectOutputStream(new FileOutputStream(fileToWrite));
        }
        
        writer.writeObject(userToWrite);

        writer.close();
    }

    private static boolean isStoringObjects(File file) throws IOException{
        boolean isStoringObject;

        ObjectInputStream checker = new ObjectInputStream(new FileInputStream(file));

        try {
            Object objectRead = checker.readObject();

            isStoringObject = (objectRead != null) ? true : false;

            checker.close();
            return isStoringObject;
        } catch (Exception e) {
            isStoringObject = false;
            return isStoringObject;
        }
    }
    
    private static class MyObjectOutputSteam extends ObjectOutputStream {
        MyObjectOutputSteam(FileOutputStream steam) throws IOException{
            super(steam);
        }

        @Override
        protected void writeStreamHeader() throws IOException {
            //Nothing
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
                Object userToPrint = reader.readObject(); 
                while(userToPrint != null){
                    if (userToPrint instanceof User){
                        System.out.println(userToPrint.toString() + "\n");
                    }

                    userToPrint =  reader.readObject();
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
            for (int usersWritten = 0, newUserPosition; usersWritten < args.length / 4; usersWritten++) {
                newUserPosition = usersWritten * 4;
                userWriter(args[newUserPosition + 0], args[newUserPosition + 1],
                        args[newUserPosition + 2], args[newUserPosition + 3]);
            }
        }
    }
}

class User implements Serializable {
    private String givenName;
    private String lastname;
    private String email;
    private String phoneNumber;

    public User(String givenName, String lastname, String email, String phoneNumber) {
        this.givenName = givenName;
        this.lastname = lastname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("Given Name: " + givenName);
        result.append("\nLastname: " + lastname);
        result.append("\nEmail: " + email);
        result.append("\nPhone number: " + phoneNumber);

        return result.toString();
    }

}