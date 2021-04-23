import java.util.ArrayList;


public class CD implements DigitalAlbum {

    ArrayList<String> songs;
    int currentIndex;

    public CD(String song1, String song2, String song3, String song4, String song5) {
        songs.add("Hello");
        songs.add("Hey Now!");
        songs.add("She's Electric");
        songs.add("Wonderwall");
        songs.add("Champagne Supernova");
        this.currentIndex = 0;
        songs = new ArrayList<String>();
    }
    
    public String playFromBeginning() {
        return null;

    }
    public String playSong(int num) {
        return null;

    }
    public String prevSong() {
        return null;

    }
    public String nextSong() {
        return null;

    }
    public String stop() {
        return null;

    }
    public String pause() {
        return "Pausing";
        
    }
    
}
