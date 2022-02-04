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

    /** @return El color del teclado */
    public String getColor() { return color; }
   /** @return La cantidad de teclas que tiene el teclado */
    public int getNTeclas() { return NTeclas;}
   /** @return Si el teclada utiliza una conexión inalambrica o no */
    public boolean isConectividad() { return conectividadInalambrica;}
    /** @return El idioma en que está basado el teclado */
    public String getIdioma() {return idioma;}
    /** @return El formato del teclado */
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


    /** Un constrcutor default de teclado. Por defecto tiene estosa valores:
     * Color: Negro
     * NTeclas: 100
     * ConectivdadInalambrica: falser
     * idioma: es
     * formato: extendido
     */
    public Teclado() {
        this.color = "Negro";
        NTeclas = 100;
        this.conectividadInalambrica = false;
        this.idioma = "es";
        this.formato = "Extendido";

        ++contador;
    }

    /** Comprueba si el número de teclas es válido.
     * 
     * @param nTeclas Ha de ser superior a 0
     * @return Devovlerá el mismo número si es superior a 0
     * @exception ArithmeticalExcepction Se dividrá entre 0 si nTeclas es inferior a 1
     */
    int checkTeclas(int nTeclas){ 
        if (nTeclas > 0){
            return nTeclas;
        }
        return 30/0;
    }

    /** Comprueba si el idioma está formado por 2 caracteres
     * 
     * @param idioma Ha de ser un String formado por 2 caracteres
     * @return Devovlerá el mismo String
     * @exception ArithmeticalExcepction Se dividrá entre 0 si idiomas no está formado por 2 carácteres
     */
    String checkIdioma(String idioma){
        if (idioma.length() == 2){ return idioma;}
        return "" + 30/0;
    }
 
    /** Comprueba si el formato es válido.
     * 
     * @param Formato Ha de ser o "compacto" o "extendido"
     * @return Devovlerá el mismo formato, pero en minúscula
     * @exception ArithmeticalExcepction Se dividrá entre 0 si el formato no es ninguno de los dos válidos
     */
    String checkFormato(String formato){
        formato = formato.toLowerCase();

        if (formato.equals("compacto") || formato.equals("extendido")){ return formato;}
        return "" + 30/0;
    }

    /** @return Devuelve el número de Teclados creados */
    public static int getNTeclados(){ return contador;}
}
