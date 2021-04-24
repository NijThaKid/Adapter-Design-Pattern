import java.util.ArrayList;

public class Cassett implements AnalogAlbum {

    ArrayList<String> songs;
    int currentIndex;

    public Cassett(String song1, String song2, String song3, String song4, String song5) {
      songs.add(song1); 
      songs.add(song2);
      songs.add(song3);
      songs.add(song4);
      songs.add(song5);
      songs = new ArrayList<String>();
      System.out.println(songs);
      
    }

    @Override
    public String play() {
        if(currentIndex == (songs.size()))
            return "At the end of the cassett you need to rewind";
            currentIndex++;
            return "Playing song " + (currentIndex) + ":" + songs.get(currentIndex-1);
        }
    @Override
    public String rewind() {
        if(currentIndex == 0)
            return "Fully Re-Wounded";
            currentIndex--;
            return "Rewinding to song" + (currentIndex+1);
    }
    @Override
    public String ffwd() {
        if(currentIndex == 1)
        return "Forwarding to song";
        currentIndex++;
        return "At the end of cassett you need to rewind" + (currentIndex);


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
