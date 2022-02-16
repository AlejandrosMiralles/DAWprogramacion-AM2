package MusicOrganizer;

public class MusicTester {
    static MusicOrganizer tester = new MusicOrganizer();

    public static void main(String[] args) {

        tester.addFile("Queen-BohemianRhapsody(FreddieMercury)");
        tester.addFile("GunsN'Roses-SweetChildO'Mine.mp3");
        

        tester.playFirst();
    }
}
