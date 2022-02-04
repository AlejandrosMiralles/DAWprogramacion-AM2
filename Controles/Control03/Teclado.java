package Control03;

/** Una clase que describe a un teclado
 * @author Alejandro Miralles
 * @version 2022.02.XX
 */
public class Teclado {
    //Color del color
    private String color;
    //Cantidad de teclas del teclado
    private final int NTeclas;
    //Si funciona con cable o es inálambrico. Es true si es inálambrico
    private final boolean conectividadInalambrica;
    //Idioma del teclado. Dependiendo de este, las teclas son distintas y con diferente posicionamiento
    private final String idioma;
    //Formato del ordenador: sólo puede ser o compacto o extenddido
    private final String formato;
    //Contador que cuenta la cantidad de teclados creados
    private static int contador = 0;

    public String getColor() { return color; }
   
    public int getNTeclas() { return NTeclas;}
   
    public boolean isConectividad() { return conectividadInalambrica;}

    public String getIdioma() {return idioma;}
 
    public String getFormato() {return formato;}

    /** Constructor del teclado
     * @param formato Sólo puede ser o "compacto" o "extendido". Si se escribe otro, dará error
     * @param Color No da errores. Se admite cualquier fadeena 
     * @param nTeclas Define la cantidad de teclas que tiene un teclado dado
     *  
     * @exception ArithmeticalExcepction Si el formato o el teclado son inválidos, dará una excepción mátematica. 30 / 0
     */
    public Teclado(String color, int nTeclas, boolean conectividad, String idioma, String formato) {
        this.color = color;
        NTeclas = checkTeclas(nTeclas);
        this.conectividadInalambrica = conectividad;
        this.idioma = checkIdioma(idioma);
        this.formato = checkFormato(formato);

        ++contador;
    }

    public Teclado() {
        this.color = "Negro";
        NTeclas = 100;
        this.conectividadInalambrica = false;
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
