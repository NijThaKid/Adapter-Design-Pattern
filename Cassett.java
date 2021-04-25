import java.util.ArrayList;
/**
 * @author Nijel Felder
 */
public class Cassett implements AnalogAlbum {

    ArrayList<String> songs;
    int currentIndex;

    /**
     * 
     * @param This adds the songs to the ArrayList from the driver class
     */
    public Cassett(String song1, String song2, String song3, String song4, String song5) {
      songs = new ArrayList<String>();
      songs.add(song1); 
      songs.add(song2);
      songs.add(song3);
      songs.add(song4);
      songs.add(song5);
    }

    @Override
    /**
     * this playing the current songs and checks to see if the cassett at the end before starting
     */
    public String play() {
        if(currentIndex == (songs.size()))
            return "At the end of the cassett you need to rewind";
            currentIndex++;
            return "Playing song " + (currentIndex) + ": " + songs.get(currentIndex-1);
        }
    @Override
    /**
     * This rewinds the cassett by 1 song and checks before to see if the cassett is at the beginning
     */
    public String rewind() {
        if(currentIndex == 0)
            return "Fully Re-Wounded";
            currentIndex--;
            return "Rewinding to song " + (currentIndex+1);
    }
    @Override
    /**
     * This fast fowards the casset by 1 song and checks to see if forwarded it to the end of the cassett
     */
    public String ffwd() {
        if(currentIndex == 1)
        return "Forwarded to the end of the cassett";
        currentIndex++;
        return "Forwarding to song " + (currentIndex+1);
        
    }
    @Override
    /**
     * Pauses the cassett
     */
    public String pause() {
        return "Pausing...";
    }

    @Override
    /**
     * This stops the cassett and ejects the tape 
     */
    public String stopEject() {
        return "Stopping cassett and ejecting";

    }
}
