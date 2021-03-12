package week05d05;

public class Song {


   private  String name;
    private long lengthInSeconds;
   private String artist;

    public Song(String name, long lengthInSeconds, String artist) {
        if (name.isEmpty() || artist.isEmpty()) {
            throw new IllegalArgumentException(" Invalid date.");
        }
        if (lengthInSeconds < 0) {
            throw new IllegalArgumentException(" Length is 0.");
        }
        this.name = name;
        this.lengthInSeconds = lengthInSeconds;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return name + " "+ artist + " " + lengthInSeconds;
    }

    public String getName() {
        return name;
    }

    public long getLengthInSeconds() {
        return lengthInSeconds;
    }

    public String getArtist() {
        return artist;
    }
}
