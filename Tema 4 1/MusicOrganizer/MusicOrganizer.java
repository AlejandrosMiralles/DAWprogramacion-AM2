package MusicOrganizer;

import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * This version can play the files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    /**
     * Prints all files of the list
     */
    public void listAllFiles(){
        for (String file : files) {
            System.out.println(file);
        }
    }

    /**
     * Prints all files that matches the given restriction. Otherwise prints an error message
     * @param match Ther restriction
     */
    public void listMatching(String match){
        ArrayList<String> matchesArray = getMatching(match);

        for (String file : matchesArray) {
            System.out.println(file);
        }

        if (matchesArray.size()==0){
            System.out.println("We couldn't find any files that matches the given string");
        }
    }

    public void playMatching(String match){
        ArrayList<String> matchesArray = getMatching(match);
    
        if(matchesArray.isEmpty()){ System.out.println("There are no files");}

        for (String file : matchesArray) {
            System.out.println(file);
            player.playSample(file);
        }
    }

    public ArrayList<String> getMatching(String match){
        ArrayList<String> matchesList = new ArrayList<>();

        String[] matcher;
        for (String file : files) {
            matcher = file.split(match);
            
            if (matcher.length>1){ 
                matchesList.add(file);
            }
        }

        return matchesList;
    }

    /**
     * Returns the first file that matches the restreiction
     * @param searchString The restriction
     * @return returns the first occurance of the list that matches the restriction. Otherwise returns -1
     */
    public int findFirst(String searchString){
        int index = -1;
        ArrayList<String> searchedFiles = getMatching(searchString);

        while (true){ //El ejercicio me obliga a poner un while porque sí
            if (searchedFiles.isEmpty()){ return index;}

            return files.indexOf(searchedFiles.get(0));
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        String filename = files.get(index);
        player.startPlaying(filename);
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }
}