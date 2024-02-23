
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared) {
        // see if they're varaibles are in the same location
        if (this == compared) {
            return true;
        }

        //if object is not of same type
        if (!(compared instanceof Song)) {
            return false;
        }

        //convert object into person
        Song comparedSong = (Song) compared;

        //compare variables
        if (this.artist.equals(comparedSong.artist) && this.name.equals(comparedSong.name) && this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
