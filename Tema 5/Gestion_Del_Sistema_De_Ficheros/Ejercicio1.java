package Gestion_Del_Sistema_De_Ficheros;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {
    private static File userPosition = new File(File.listRoots()[0], ".");
    private static Scanner input = new Scanner(System.in);

    private static void changeFile(File newFile){
        userPosition = new File(newFile.getAbsolutePath());

        fileMenu();
    } 

    private static void showMenu(){
        File[] filesToShow = userPosition.listFiles();
        String displayment = "";
        int actionNumber = 1;

        for (File file : filesToShow) {
            if (file.isHidden()){}
            else if (file.isDirectory()){
                displayment += actionNumber++ + "\t" + file.getName() +
                     " <Directory>\n";
            }else if (file.isFile()){
                displayment += actionNumber++ + "\t" + file.getName() +
                     " " + file.length() + " bytes\n" ;
            }

        }

        System.out.println("\n");
        System.out.println("Lista de ficheros y directorios del fichero: " +
            userPosition.getAbsolutePath());
        System.out.println("____________________________________________________________");
        System.out.println("0\tFather");
        System.out.println(displayment);   
        System.out.println("Enter an option (-1 or less to exit):"); 
        
    }

    private static void menusAnswer(){
        File[] listFiles = userPosition.listFiles();
        int usersAnswer = input.nextInt();

        if (usersAnswer == 0){
            File newFile = userPosition.getParentFile();
            if (! (newFile == null) &&
             newFile.canRead()){
                changeFile(newFile);
            }else{
                invalidAnswer();
            }
        }else if(usersAnswer < 0){ input.close(); /*The program ends*/}
        else{
            int filesSeen = 0;
            for (File file : listFiles) {
                if (file.isHidden()){}
                else if (filesSeen++ + 1 == usersAnswer){
                    if (file.isDirectory() && file.canRead()){
                        changeFile(file);
                        return; //to end faster the program
                    }
                }
            }

            invalidAnswer();
        }
    }

    private static void invalidAnswer(){ menusAnswer();}

    public static void fileMenu(){
        showMenu();
        menusAnswer();
    }

    public static void main(String[] args) {
        fileMenu();
    }
}