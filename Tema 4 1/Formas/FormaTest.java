package Formas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FormaTest {
    @Test
    public void testGetColor() {
        Forma circulo = new Forma();
        circulo.setColor('N');

        assertEquals('N', circulo.getColor());
    }

    @Test
    public void testImprimir() {
        new Forma().imprimir();
    }

    @Test
    public void testImprimirRectangulo(){

    }

    @Test
    public void testImprimirAreaYPerimetro(){

    }

    @Test
    public void testAumentarEnClase(){
        
    }
}
