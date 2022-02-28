package cutrecloud.cutre_cloud_inferior;

import cutrecloud.cutre_cloud_superior.Connector;

public class Usuario implements ParserXML {
    private int id = 0;
    private String email;
    private String password;
    private static int idGenerator = 1;
    
    public int getID(){ return id;}
    public String getEmail(){ return email;}
    public String getPassword() { return password;}
    
    public void setEmail(String email) {
        if (Connector.emailUsuarioValido(email)){ return;}
        this.email = email;
    }
    public void setPassword(String password) { this.password = password;}

    public Usuario(String email, String password) {

        Connector.addUser(this);
        
        if (! Connector.eseUsuarioEsValido(email)){ return;}

        id = ++idGenerator;
        this.email = email;
        this.password = password;

    }

    public String generateXML(){
        String result = "";

        result+= "<Usuario>";
        result+= "\n\t<id valor='"+ id + "' />";
        result+= "\n\t<email> "+ email + " </email>";
        result+= "\n\t<password> "+ password + "</password>";
        result+= "\n</Usuario>";

        return result;
    }
}