package Q2;

import java.util.Objects;

public class Song {

    String movieName;
    String songName;

    public Song(String movieName, String songName) {
        this.movieName = movieName;
        this.songName = songName;
    }

    public void play(){
        System.out.println(this.songName + " of " + this.movieName + " is playing...!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return movieName.equals(song.movieName) && songName.equals(song.songName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName, songName);
    }
}
