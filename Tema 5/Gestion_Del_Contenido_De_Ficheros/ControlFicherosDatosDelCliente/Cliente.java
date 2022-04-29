package Gestion_Del_Contenido_De_Ficheros.ControlFicherosDatosDelCliente;

import java.util.Set;
import java.util.HashSet;

public class Cliente extends Persona {
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
        //TODO me falta encontrar la expresión regular que me permita validar emails
        int emailValido = email.split("@*.").length;
        if (emailValido == 1 && ! nifCollection.add(nif)){
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
