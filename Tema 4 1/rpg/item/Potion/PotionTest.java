package rpg.item.Potion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rpg.character.Character;
import rpg.character.job.*;
import rpg.character.race.*;
import rpg.character.stat.*;

public class PotionTest {

    static Character prota = new Character("Pepe", new King(), new Elf(), new Strength(23), new Intelligence(10), new Dexterity(100));
    static Potion tester = new HealingPotion();

    @Test
    public void testConsumedBy() {
        double initialHealth = prota.health();

        tester.consumedBy(prota);

        System.out.println("Expected: "+initialHealth+
                    "\tActual:"+ prota.health());
    }

    @Test
    public void testGetHealingPower() {
        System.out.println("Healing Power: "+tester.getHealingPower());
    }
}
