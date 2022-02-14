package MusicOrganizer;

public class MusicTester {
    static MusicOrganizer tester = new MusicOrganizer();

    public static void main(String[] args) {
        System.out.println("El fallo no está en los paquetes");

        tester.addFile("Guns N' Roses - Sweet Child O' Mine.mp3");
        tester.addFile("Queen - Bohemian Rhapsody (Freddie Mercury).mp3");

        tester.playFirst();
    }
}
