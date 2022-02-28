package cutrecloud.cutre_cloud_inferior;

import cutrecloud.cutre_cloud_superior.Connector;

public class Media implements ParserXML {

    private int id;
    private String nombre;
    private String contenido;
    private TiposMedia tipo;
    private int usuario_id;

    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public String getContenido() { return contenido;}
    public TiposMedia getTipo(){ return tipo;}
    public int getUsuario_id() {return usuario_id;}

    public void setId(int id) {
        if (! Connector.idMediaValido(id)){ return;}
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public void setTipo(TiposMedia tipo) {
        this.tipo = tipo;
    }
    public void setUsuario_id(Usuario user) {
        user.getID();
    }

    
    public Media(int id, String nombre, String contenido, TiposMedia tipo, Usuario user) {

        Connector.addMedia(this);
        
        if (! Connector.esaMediaEsValida(user.getID())){ return;}
        
        this.id = id;
        this.nombre = nombre;
        this.contenido = contenido;
        this.tipo = tipo;
        this.usuario_id = user.getID();

    }
   
    public String generateXML(){
        String result = "";

        result+= "<Media>";
        result+= "\n\t<id valor'"+ id + "' />";
        result+= "\n\t<nombre> "+ nombre + " </nombre>";
        result+= "\n\t<contenido> "+ contenido + " </contenido>";
        result+= "\n\t<tipo tipo='"+ tipo + "' />";
        result+= "\n\t<Usuario_id valor='"+ usuario_id + "'/>";
        result+= "\n</Media>";

        return result;
    }
}