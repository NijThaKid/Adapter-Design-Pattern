import java.util.ArrayList;

public class Cassett implements AnalogAlbum {

    ArrayList<String> songs;
    int currentIndex;

    public Cassett(String song1, String song2, String song3, String song4, String song5) {
       songs.add("A hard Day's Night");
        songs.add("I should Have Known Better");
        songs.add("If I Fell");
        songs.add("I'm Happy Just To Dance With You");
        songs.add("And I Love Her");
        this.currentIndex = 0;
        songs = new ArrayList<String>();
    }

    @Override
    public String play() {
        return null;

    }
    @Override
    public String rewind() {
        return null;

    }
    @Override
    public String ffwd() {
        return null;

    }
    @Override
    public String pause() {
        return "Pausing...";
    }

    @Override
    public String stopEject() {
        return "Stopping cassett and ejecting";

    }



    
}
