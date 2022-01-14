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
    private Point coordenadas;

    String getColor(){ return color;}

    String getMaterial(){ return material;}

    byte getPatas(){ return patas;}
    
    byte getComodidad(){ return comodidad;}

    boolean getRespaldo(){ return respaldo;}



}
