package Control03;

import java.util.ArrayList;
import java.util.List;

public class Ordenador {
    private String formato;
    private String color;
    private Teclado teclado;
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
  
    
    public Ordenador(String formato, String color, Teclado teclado) {
        this.formato = checkFormato(formato);
        this.color = color;
        this.teclado = teclado;
        ordenadoresConectados = new ArrayList<>();
    }
    public Ordenador() {
        this.formato = "Sobremesa";
        this.color = "Negro";
        this.teclado = new Teclado();
        ordenadoresConectados = new ArrayList<>();
    }

    String checkFormato(String formato){
        formato = formato.toLowerCase();
        if (formato.equals("sobremesa") || formato.equals("portatil") ||
            formato.equals("pórtatil")){ return formato;}
        return "" + 30/0;
    }

    public void conectarOrdenador(Ordenador aConectar){ 
        ordenadoresConectados.add(aConectar);
        aConectar.seConecta(this);
    }
    private void seConecta(Ordenador haciaOrdenador){
        ordenadoresConectados.add(haciaOrdenador);
    }
    
}
