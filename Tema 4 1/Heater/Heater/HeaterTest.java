package Heater;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HeaterTest{
    @Test
    public void testAll() {
        Heater airConditioning = new Heater(40, -20);

        System.out.println("Temperature: "+airConditioning.getTemperature());
        assertEquals((Double) (double)15,(Double) airConditioning.getTemperature());
        
        airConditioning.warmer();

        airConditioning.setIncrement(1);
        airConditioning.cooler();
        airConditioning.setIncrement(20);
        airConditioning.cooler();

        assertEquals((Double) (double) 18, (Double) airConditioning.getTemperature());
        System.out.println("Temperature: "+airConditioning.getTemperature());
    }
}