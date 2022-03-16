package rpg.item.Food;

import org.junit.Test;

import rpg.character.Character;
import rpg.character.job.*;
import rpg.character.race.*;
import rpg.character.stat.*;


public class FoodTest {

    static Food paella = new Paella();
    static Character prota = new Character("Pepe", new King(), new Elf(), new Strength(23), new Intelligence(10), new Dexterity(100));

    @Test
    public void testGetPowerFood() {
        System.out.println(paella.getPowerFood());
    }


    @Test
    public void testPoisounus() {
        PoisounousFood paellaNoValenciana = new PoisounousFood(paella);

        System.out.println("___________TestPoison___________");
        System.out.println("Before" + prota.health());
        paellaNoValenciana.consumedBy(prota);
        System.out.println("After: "+ prota.health());
    }

    @Test
    public void testEnhanced() {
        EnhancedFoodDecorator manzanaMejorada = new EnhancedFoodDecorator(new Apple(), 3); 
        
        System.out.println("_______TestEnhance___________");
        System.out.println("Before "+ prota.health());
        manzanaMejorada.consumedBy(prota);
        System.out.println("After: "+ prota.health());
    
    
    }
}
