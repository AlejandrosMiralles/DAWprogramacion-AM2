package Control04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
* By default, ObjectOutputStream always writes a header whenever it's open.
* As a result, it's impossible to add an object to an ObjectFile without corrupting it.
* This class doesn't write a header, so it can be used to add objects to an already object storer file 
*/
public class MyOwnObjectOutputStream extends ObjectOutputStream {
    MyOwnObjectOutputStream(FileOutputStream steam) throws IOException{
        super(steam);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        //Nothing
    }
}