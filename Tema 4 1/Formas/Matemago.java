package Formas;

import java.util.ArrayList;
import java.util.Random;

public class Matemago {
    public static void main(String[] args) {
        ArrayList<Forma> vector = new ArrayList<Forma>();
        Random randomizer = new Random(47);

        vector.add(new Forma());
        vector.add(new Circulo());
        vector.add(new Cuadrado());
        vector.add(new Eclipse());
        vector.add(new Rectangulo());

        for (Forma ungaunga : vector) {
            ungaunga.setColor('R');
            ungaunga.moverForma(randomizer.nextInt(), randomizer.nextInt());
        }
    }
}
