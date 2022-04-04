package Gestion_Del_Contenido_De_Ficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TransformaImagen {
    File f = null;

    public TransformaImagen(File fEnt) {
        if (! fEnt.exists()){ System.out.println("El archivo no existe. Por favor, revise que "+
                "el camino dado sea el correcto o que exista ese archivo");}
        else if (! fEnt.getName().endsWith(".bmp")){ System.out.println("El archivo ha de terminar con la"+
                " extension 'bmp'. Revise el archivo dado, por favor");}
        else{
            f = fEnt;
        }
    }

    
    private String getNombreSinExtension() {
        return f.getName().split("\\.")[0];
    }

    private void copiaInfoImagenHastaLosColores(FileInputStream input, FileOutputStream output) throws IOException {
        int infobyte;
        for (int i = 0; i < 54; i++) {
            infobyte = input.read();
            output.write(infobyte);
        }
    }

    public void transformaNegativo() throws IOException {
        File newFile = new File(f.getParent(), getNombreSinExtension()+ "_n.bmp");
        FileInputStream input = new FileInputStream(f);
        FileOutputStream output = new FileOutputStream(newFile);

        int infobyte;

        newFile.createNewFile();

        copiaInfoImagenHastaLosColores(input, output);

        do {
            infobyte = 255 - input.read();
            output.write(infobyte);
        } while (infobyte!=256);

        output.close();
        input.close();
    }

    public void transformaOscuro() throws IOException {
        // Transformar a una imagen más oscura y guardar como *_o.bmp
        
        File newFile = new File(f.getParent(), getNombreSinExtension()+ "_o.bmp");
        FileInputStream input = new FileInputStream(f);
        FileOutputStream output = new FileOutputStream(newFile);

        int infobyte;

        newFile.createNewFile();

        copiaInfoImagenHastaLosColores(input, output);

        infobyte = (input.read()-1)/2;
        while(infobyte!= -1){
            output.write(infobyte);

            infobyte = (input.read()-1)/2;
        }

        input.close();
        output.close();
    }
    
    public void transformaBlancoNegro() throws IOException {
        // Transformar a una imagen en blanco y negro y guardar como *_bn.bmp

        File newFile = new File(f.getParent(), getNombreSinExtension()+ "_bn.bmp");
        FileInputStream input = new FileInputStream(f);
        FileOutputStream output = new FileOutputStream(newFile);

        newFile.createNewFile();

        copiaInfoImagenHastaLosColores(input, output);
        


        int infobyte, infobyte2, infobyte3;

        infobyte = input.read();
        infobyte2 = input.read();
        infobyte3 = input.read();

    
        while(infobyte3!= -1){
            int result = infobyte + infobyte2 + infobyte3;
            result/=3;

            for (int i = 0; i < 3; i++) {
                output.write(result);
            }

            infobyte = input.read();
            infobyte2 = input.read();
            infobyte3 = input.read();
        }
        
    
    /*
        int[] bytes = new int[3];

        bytes[0] = input.read();
        bytes[1] = input.read();
        bytes[2] = input.read();

        while(bytes[2]!=-1){
            int result = bytes[0] + bytes[1] + bytes[2];
            result/=3;

            for (int nadaAHacer : bytes) {
                output.write(result);
            }

            bytes[0] = input.read();
            bytes[1] = input.read();
            bytes[2] = input.read();
        }
    */
    
    
    input.close();
    output.close();
    }





    public static void main(String[] args) throws IOException {
        
        File f = new File("Tema 5/Gestion_Del_Contenido_De_Ficheros/imagenes/penyagolosa.bmp");
        
        TransformaImagen ti = new TransformaImagen(f);

        long tiempoInicio=System.currentTimeMillis();
        ti.transformaBlancoNegro();
        System.out.println("\nTiempo de ejecucion de la transformacion a blanco y negro "+(
        System.currentTimeMillis()-tiempoInicio)+" milisegundos");
    }
}