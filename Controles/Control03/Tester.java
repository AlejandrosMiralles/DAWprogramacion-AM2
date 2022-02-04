package Control03;

public class Tester {

    static String toString(Teclado teclado){
        return "Color: "+teclado.getColor()+ "\nFormato: "+ teclado.getFormato()+ 
        "\nIdioma: " + teclado.getIdioma()+ "\nNúmero de teclas: "+teclado.getNTeclas()+
        "\nConectividad: "+teclado.isConectividad();
    }

    static String toString(Ordenador ordenador){
        return "Color: "+ordenador.getColor()+"\nFormato: "+ordenador.getFormato()+
        "\nTeclado:\t "+toString(ordenador.getTeclado());
    }


    public static void main(String[] args) {
        Ordenador ordenadorDefault = new Ordenador();
        
        Ordenador ordenadorArgumentado = new Ordenador("Pórtatil", "Rojo", new Teclado("Verde", 103, false, "es", "extendido"));

        /*
        System.out.println("_________________________Ordenador default_______________________");
        System.out.println(toString(ordenadorDefault));
        System.out.println("\n\n\n_______________________Ordenador Argumentado______________________");
        System.out.println(toString(ordenadorArgumentado));
        
        ordenadorArgumentado.setTeclado(new Teclado());
        System.out.println("\n\n\n_______________________Ordenador Argumentado______________________");
        System.out.println(toString(ordenadorArgumentado));

        System.out.println(Teclado.getNTeclados());
        */

        ordenadorArgumentado.conectarOrdenador(ordenadorDefault);

        System.out.println(ordenadorDefault.getConectados());
    }
}
