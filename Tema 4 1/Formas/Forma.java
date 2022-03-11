package Formas;

import java.awt.Point;

public class Forma {
    private char color;
    private Point punto;
    private String nombre;

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    void imprimir(){ 
        System.out.println("Color: "+color+"\nNombre: "+nombre+"\nCentro: "
                    +punto.getX()+" "+punto.getY());
    }

    void moverForma(int x, int y){ punto.move(x, y);}


}
