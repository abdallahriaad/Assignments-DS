// Part C - Java LinkedList Task 2
import java.util.LinkedList;

public class PlaylistManager {
    public static void main(String[] args) {
    
        LinkedList<String> playlist = new LinkedList<>();
        playlist.addLast("Song A");
        playlist.addLast("Song B");
        playlist.addLast("Song C");
        playlist.addLast("Song D");
        System.out.println("The Playlist " + playlist);

        playlist.addFirst("Intro Song");
        playlist.addLast("Outro Song");
        System.out.println("The Playlist after add in the beginning and the end " + playlist);

        playlist.remove("Song B");
        System.out.println("Afert remove Song B " + playlist);

        System.out.println("The First Song: " + playlist.getFirst());
        System.out.println("The Last Soong: " + playlist.getLast());
        System.out.println("Number of Song: " + playlist.size());

        System.out.println("The Playlist in order . . . ");
        int numberSong = 1;
        for (String song : playlist) {
            System.out.println(numberSong + ". " + song);
            numberSong++;
        }
    }
}
