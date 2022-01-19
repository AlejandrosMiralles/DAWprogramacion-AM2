package Silla;

import java.awt.Point; 

public class Silla {
    /* -Crear una clase silla sin main. 
    -Atributos: Color, Número de patas, Si tiene respaldo o no, nivel de cómodidad(1-10), material
    -Tiene un punto que la localiza en una habitación, con unas coordenadas X e Y.
    -Todos los atributos han de ser privados, pero desde test podemos modificarla y acceder a su valor.
    -En la clase de prueba crear aleatoriamente 100 sillas con distintos atributos.
    - 
    */

    private String color, material;
    private byte patas, comodidad;
    private boolean respaldo;
    private Point coordenadas = new Point();

    String getColor(){ return color;}
    void setColor(String color){this.color= color;}

    String getMaterial(){ return material;}
    void setMaterial(String material){this.material= material;}

    byte getPatas(){ return patas;}
    void setPatas(byte foots){this.patas= foots;}
    
    byte getComodidad(){ return comodidad;}
    void setComodidad(byte comodidad){this.comodidad= comodidad;}

    boolean getRespaldo(){ return respaldo;}
    void setRespaldo(boolean back){this.respaldo= back;}

    Point getCoordenadas(){ return coordenadas;}
    void setCoordenadas(int x, int y){ coordenadas.move(x, y);}
}