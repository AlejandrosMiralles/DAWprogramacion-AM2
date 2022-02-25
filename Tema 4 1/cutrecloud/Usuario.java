package cutrecloud;

public class Usuario {
    private int id;
    private String email;
    private String password;
    
    public int getID(){ return id;}
    public String getEmail(){ return email;}
    public String getPassword() { return password;}
    
    public void setId(int id) {
        if (BaseDatos.idUsuarioValido(id)){ return;}
        this.id = id;
    }
    public void setEmail(String email) {
        if (BaseDatos.emailUsuarioValido(email)){ return;}
        this.email = email;
    }
    public void setPassword(String password) { this.password = password;}

    public Usuario(int id, String email, String password) {

        BaseDatos.addUser(this);
        
        if (! BaseDatos.eseUsuarioEsValido(id, email)){ return;}

        this.id = id;
        this.email = email;
        this.password = password;

    }

    
}