package cutrecloud;

public class Media {

    private int id;
    private String nombre;
    private String contenido;
    private String tipo;
    private int usuario_id;

    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public String getContenido() { return contenido;}
    public String getTipo(){ return tipo;}
    public int getUsuario_id() {return usuario_id;}

    public void setId(int id) {
        if (! BaseDatos.idMediaValido(id)){ return;}
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public void setTipo(String tipo) {
        if (! BaseDatos.validoTipoMedia(tipo)){ return ;}
        this.tipo = tipo;
    }
    public void setUsuario_id(int usuario_id) {
        if (BaseDatos.esaRelacionUsuarioMediaYaExiste(id) || !BaseDatos.idUsuarioValido(id)){
            return ;
        }
        this.usuario_id = usuario_id;
    }

    
    public Media(int id, String nombre, String cotenido, String tipo, int usuario_id) {

        BaseDatos.addMedia(this);
        
        if (! BaseDatos.esaMediaEsValida(id, usuario_id, tipo)){ return;}
        
        this.id = id;
        this.nombre = nombre;
        this.contenido = cotenido;
        this.tipo = tipo;
        this.usuario_id = usuario_id;

    }
    
}
