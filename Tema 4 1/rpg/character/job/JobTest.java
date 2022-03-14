package rpg.character.job;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class JobTest {
    static Unemployed tester = new Unemployed();

    @Test
    public void testEquals() {
        Unemployed unemployedTester = new Unemployed();
        King kingOfTesters = new King();

        Boolean[] expected = {true, false};
        Boolean[] actual = {tester.equals(unemployedTester), 
                            tester.equals(kingOfTesters)
                            };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testToString() {
        System.out.println(tester);
    }
}
