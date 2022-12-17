package Q2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Playlist {

    public List<Song> songs = new ArrayList<>();

    public void addSong(Song song){
        if(songs.contains(song)) {
            System.out.println("Song is already added in the playlist");
        } else {
            songs.add(song);
            System.out.println("Song added to the playlist successfully");
        }
    }

    public static void main(String[] args) {

        Song s1 = new Song("Bramhastra", "Kesariya");
        Song s2 = new Song("M1", "S1");
        Song s3 = new Song("M2", "S2");
        Song s4 = new Song("M1", "S1");

        Playlist playlist = new Playlist();
        playlist.addSong(s1);
        playlist.addSong(s2);
        playlist.addSong(s3);
        playlist.addSong(s4);

        for(Song song : playlist.songs) {
            song.play();
        }
    }
}