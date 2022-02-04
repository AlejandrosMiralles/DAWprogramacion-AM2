package Control03;

import java.util.ArrayList;
import java.util.List;

/** Una clase que describe a un ordenador
 * @author Alejandro Miralles
 * @version 2022.02.XX
 */
public class Ordenador {
    //Formato del ordenador. Puede ser o de sobremesa o pórtatil
    private final String formato;
    //Color del ordenador. No hay limitaciones en el color.
    private final String color;
    //Una objeto de la clase teclado. Todo ordenador sólo tiene un teclado
    private Teclado teclado;
    //Los ordenadores se pueden conectar a otros ordenadores. Con este campo se guardan los ordenadores conectados
    private List<Ordenador> ordenadoresConectados;

    
    public String getFormato() {return formato;}
    public String getColor() {return color;}
    public Teclado getTeclado() {return teclado;}
    public String getConectados(){
        String result = "";
        for (Ordenador ordenador : ordenadoresConectados) {
            result +=""+ ordenador.hashCode();
        }
        return result;
    }
    
    public void setTeclado(Teclado teclado) { this.teclado = teclado;}
  
    /** Constructor del ordenador
     * @param formato Sólo puede ser o "sobremesa" o "portatil". Si se escribe otro, dará error
     * @param Color No da errores. Se admite cualquier fadeena 
     * @param Teclado Mira la clase teclado si quieres saber más. Avsio: puede dar errores 
     * @exception ArithmeticalExcepction Si el formato o el teclado son inválidos, dará una excepción mátematica. 30 / 0
     */
    public Ordenador(String formato, String color, Teclado teclado) {
        this.formato = checkFormato(formato);
        this.color = color;
        this.teclado = teclado;
        ordenadoresConectados = new ArrayList<>();
    }
    /** Constructor default del ordenador
     * @return un ordenador negro de sobremesa con un teclado construido con un constructor default, 
     */
    public Ordenador() {
        this.formato = "Sobremesa";
        this.color = "Negro";
        this.teclado = new Teclado();
        ordenadoresConectados = new ArrayList<>();
    }
    /**Se asegura que el formato del ordenador sea válido.
     * @param formato Sólo puede ser o de: "sobremesa", "portatil" o "pórtatil". 
     * @exception ArithmeticalExcepction Si el formato es erróneo, se hará un 30 / 0 y se causará un error
     */
    private String checkFormato(String formato){
        formato = formato.toLowerCase();
        if (formato.equals("sobremesa") || formato.equals("portatil") ||
            formato.equals("pórtatil")){ return formato;}
        return "" + 30/0;
    }


    /** Conecta dos ordenadores entre sí. Se puede ver que ordenadores están conectados entre sí con getConectados */
    public void conectarOrdenador(Ordenador aConectar){ 
        ordenadoresConectados.add(aConectar);
        aConectar.seConecta(this);
    }
    /** Método que se utiliza para conectar un ordenador a otro. Sólo lo utiliza el método conectarOrdernador */
    private void seConecta(Ordenador haciaOrdenador){
        ordenadoresConectados.add(haciaOrdenador);
    }   
}