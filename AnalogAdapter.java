public class AnalogAdapter implements AnalogAlbum {
    DigitalAlbum album;

    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }

    public String play() {
        return album.nextSong();

    }
    public String rewind() {
        return album.stop();

    }
    public String ffwd() {
        return album.nextSong();

    }
    public String pause() {
        return album.pause();

    }
    public String stopEject() {
        return album.stop();
    }
}
