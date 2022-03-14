package rpg.character.stat;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StatTest {

    static Constitution testerCon = new Constitution(40);
    static Dexterity testerDex = new Dexterity(0);
    static Intelligence testerIntel = new Intelligence(100000);
    static Strength testerStrengh = new Strength(10);

    @Test
    public void testGetValue() {
        for (int i = 0; i < 10; i++) {
            testerStrengh.increase();
        }

        testerStrengh.decrease();

        assertEquals(19, testerStrengh.getValue());
    }

    @Test
    public void testToString() {
        System.out.println("Constitution: "+testerCon.toString());
        System.out.println("Dexterity: "+ testerDex.toString());
        System.out.println("Intelligence: "+ testerIntel.toString());
        System.out.println("Strength: "+ testerStrengh.toString());
    }
}
