package MusicOrganizer;

import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
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
     * Prints if an index is valid or not 
     * @param index The index to be checked
     */
    public void checkIndex(int index){
        if (isValidIndex(index)){
            return ;
        }
        System.out.println("Error. A valid index would have a value higher or equal than 0 and less than "+getNumberOfFiles());
    }

    /**
     * Checks wheter an index is valid or not for the list
     * @param index The index to be checked
     * @return Whether the index is valid (true) or not (false)
     */
    public boolean isValidIndex(int index){
        if (index>=0 && getNumberOfFiles()<index){
            return true ;
        }
        return false;
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index){
        if(isValidIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index){
        if(isValidIndex(index)) {
            files.remove(index);
        }
    }
}