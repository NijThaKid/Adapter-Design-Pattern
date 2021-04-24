import java.util.ArrayList;


public class CD implements DigitalAlbum {

    ArrayList<String> songs;
    int currentIndex;

    public CD(String song1, String song2, String song3, String song4, String song5) {
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
        songs = new ArrayList<String>();
        System.out.println(songs);
    }
    
    public String playFromBeginning() {
        currentIndex++;
        if(currentIndex == 1) {
        }
        return "Playng Song 1: " + songs.get(currentIndex);
    }
    public String playSong(int num) {
        if(num > songs.size() - 1 || num < 0) 
            return "Not a valid song number";
            return "Playing" + (currentIndex+1) + ": " + songs.get(currentIndex-1);
    }
    public String prevSong() {
        currentIndex--;
        if(currentIndex-1 > 0) {
        }
        return "Skipping back and playing: " + songs.get(currentIndex-1);
    }
    public String nextSong() {
        currentIndex++;
        if(currentIndex+1 > 0) {

        }
        return "Playing" + (currentIndex) + ":" + songs.get(currentIndex+1);
    }
    public String stop() {
        currentIndex--;
        if(currentIndex == 0) {
        }
        return "Stopping CD and ejecting";
    }
    public String pause() {
        return "Pausing";
    }
}
