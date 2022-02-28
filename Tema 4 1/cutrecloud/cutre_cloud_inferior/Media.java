package cutrecloud.cutre_cloud_inferior;

import cutrecloud.cutre_cloud_superior.Connector;

public class Media implements ParserXML {

    private int id = 0;
    private String nombre;
    private String contenido;
    private TiposMedia tipo;
    private int usuario_id;
    private static int idGenerator = 0;

    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public String getContenido() { return contenido;}
    public TiposMedia getTipo(){ return tipo;}
    public int getUsuario_id() {return usuario_id;}

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }
    public void setContenido(final String contenido) {
        this.contenido = contenido;
    }
    public void setTipo(final TiposMedia tipo) {
        this.tipo = tipo;
    }
    public void setUsuario_id(final Usuario user) {
        user.getID();
    }

    
    public Media(String nombre,String contenido,TiposMedia tipo, Usuario user) {

        Connector.addMedia(this);
        
        if (! Connector.esaMediaEsValida(user.getID())){ return ;}
        
        this.id = ++idGenerator;
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