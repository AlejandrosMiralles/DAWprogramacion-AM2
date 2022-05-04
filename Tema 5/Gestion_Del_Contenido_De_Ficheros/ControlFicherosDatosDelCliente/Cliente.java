package Gestion_Del_Contenido_De_Ficheros.ControlFicherosDatosDelCliente;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.Serializable;
import java.util.HashSet;

public class Cliente extends Persona implements Serializable {
    private int id;
    private String email;

    private static int idGenerator = 0;
    private static Set<String> nifCollection = new HashSet<String>(); 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > idGenerator){
            this.id = id ;
            idGenerator = id;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cliente(String nif, String nombre, String apellidos, String email) {
        
        String patronDeEmails = "@[a-z]+\\.[a-z]+$";
        Matcher validadorDeEmail = Pattern.compile(patronDeEmails).matcher(email);
        if (! validadorDeEmail.find() || ! nifCollection.add(nif)){
            id = -1;
            setNif("" + -1);
        }else{
            id = ++idGenerator;
            setNif(nif);
            setNombre(nombre);
            setApellidos(apellidos);
            this.email = email;
        }  
    }
    
    @Override
    public String toString() {
        StringBuilder cadenaADevolver = new StringBuilder();

        cadenaADevolver.append("Cliente:");
        cadenaADevolver.append("\nID:\t"+ getId());
        cadenaADevolver.append("\nNIF:\t"+ getNif());
        cadenaADevolver.append("\nNombre:\t"+ getNombre());
        cadenaADevolver.append("\nApellidos:\t"+ getApellidos());
        cadenaADevolver.append("\nEmail:\t" + getEmail());

        return cadenaADevolver.toString();
    }
}
