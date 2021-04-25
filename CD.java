import java.util.ArrayList;

/**
 * @author Nijel Felder
 */
public class CD implements DigitalAlbum {

    ArrayList<String> songs;
    int currentIndex;

    /**
     * 
     * This adds the songs to the arraylist and connects the songs to the driver class
     */
    public CD(String song1, String song2, String song3, String song4, String song5) {
       songs = new ArrayList<String>(); 
       songs.add(song1);
       songs.add(song2);
       songs.add(song3);
       songs.add(song4);
       songs.add(song5);
    }
    @Override
    /**
     * This starts the songs at the beginning of the CD
     */
    public String playFromBeginning() {
        currentIndex = 0;
         return "Playing: " + (currentIndex);
    }
    @Override
    /**
     * It checks first to see if you input a valid song number && Starts playing songs in order listing
     */
    public String playSong(int num) {
        if(num < songs.size() && num <= 0) {
        currentIndex = num;
            return "Not a valid song number";
       
    } return "Playing: " + songs.get(currentIndex);
}

    @Override
    /**
     * It allows you to rewind or go back
     * @return Displays the message and rewinds back to the correct track 
     */
    public String prevSong() {
             if(currentIndex > 0)
             currentIndex--;
        return "Skipping back and playing: " + songs.get(currentIndex);
    }

    @Override
    /**
     * Allows you to fast foward or skip to the next track
     * @return song title and number
     */
    public String nextSong() {
        if(currentIndex < songs.size() - 1)
        currentIndex++;
        return "Playing: " + (currentIndex + 1) + ": " + songs.get(currentIndex);
    }
    @Override
    /**
     * This stops the cd, goes back to the beginning of the cd, and ejects the disc
     * @return Displays the message Stop and Eject
     */
    public String stop() {
       currentIndex = 0;
        return "Stopping CD and ejecting";
    }
    @Override
    /**
     * Pauses the cd 
     * @return Displays the message Pause
     */
    public String pause() {
        return "Pausing";
    }
}
