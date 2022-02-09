package MusicTester;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MusicOrganizer.MusicOrganizer;

public class java {
    static MusicOrganizer tester = new MusicOrganizer();
    
    static private void newTester(){
        tester.addFile("");
        tester.addFile("JulioRockStar");
        tester.addFile("AleRockEstrella");
        tester.addFile("Escandinavia");
        tester.addFile("Pere Botella");
        tester.addFile("Get it down");
        tester.addFile("Pressure");
    }



    @Test
    public void testFindFirst() {
        newTester();

        assertEquals(-1, tester.findFirst("sdvnoivn"));
        assertEquals(1, tester.findFirst("Rock"));
    }

    @Test
    public void testListAllFiles() {
        newTester();

        System.out.println("__________Test AllFiles Method____________");
        tester.listAllFiles();
        System.out.println("\n");
    }

    @Test
    public void testListMatching() {
        newTester();

        System.out.println("__________Test List Matching Method____________");
        tester.listMatching("re");
        System.out.print("\nError:\t");
        tester.listMatching("divbsvcsocvijs");
    }

    @Test
    public void testPlayMatching() {
        System.out.println("_________Test Play Matching Method_________");
        
        tester.playMatching("re");
    }
}
