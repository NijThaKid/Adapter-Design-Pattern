import java.util.ArrayList;

public class Cassett implements AnalogAlbum {

    ArrayList<String> songs;
    int currentIndex;

    public Cassett(String song1, String song2, String song3, String song4, String song5) {
        song1 = "";
        song2 = "";
        song3 = "";
        song4 = "";
        song5 = "";
        this.currentIndex = currentIndex;
        ArrayList<String> songs = new ArrayList<String>();
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
