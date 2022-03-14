package rpg.character.race;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import rpg.character.stat.*;

public class RaceTest {

    static Demon tester = new Demon();

    @Test
    public void testEquals() {
        Demon demonTester = new Demon();
        Angel angelTester = new Angel();

        Boolean[] expected = {true, false};
        Boolean[] actual = {tester.equals(demonTester), 
                            tester.equals(angelTester)};

        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testToString() {
        System.out.println(tester);
    }
}
