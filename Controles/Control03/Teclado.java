package Control03;

public class Teclado {
    private String color;
    private final int NTeclas;
    private final boolean conectividad;
    private final String idioma;
    private final String formato;
    private static int contador = 0;

    public String getColor() { return color; }
   
    public int getNTeclas() { return NTeclas;}
   
    public boolean isConectividad() { return conectividad;}

    public String getIdioma() {return idioma;}
 
    public String getFormato() {return formato;}

    public Teclado(String color, int nTeclas, boolean conectividad, String idioma, String formato) {
        this.color = color;
        NTeclas = checkTeclas(nTeclas);
        this.conectividad = conectividad;
        this.idioma = checkIdioma(idioma);
        this.formato = checkFormato(formato);

        ++contador;
    }

    public Teclado() {
        this.color = "Negro";
        NTeclas = 100;
        this.conectividad = false;
        this.idioma = "es";
        this.formato = "Extendido";

        ++contador;
    }

    int checkTeclas(int nTeclas){ 
        if (nTeclas > 0){
            return nTeclas;
        }
        return 30/0;
    }

    String checkIdioma(String idioma){
        if (idioma.length() == 2){ return idioma;}
        return "" + 30/0;
    }
 
    String checkFormato(String formato){
        formato = formato.toLowerCase();

        if (formato.equals("compacto") || formato.equals("extendido")){ return formato;}
        return "" + 30/0;
    }
    //MEJORAR

    public static int getNTeclados(){ return contador;}
}
