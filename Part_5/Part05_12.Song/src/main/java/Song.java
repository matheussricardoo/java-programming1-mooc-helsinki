
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        } if (!(compared instanceof Song)) {
            return false;
        }
        Song comparedSong = (Song) compared;

        if (this.name.equals(((Song) compared).name) &&
                this.artist == ((Song) compared).artist &&
                this.durationInSeconds == ((Song) compared).durationInSeconds) {
            return true;
        }
        return false;
    }


        public String toString () {
            return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
        }


    }
