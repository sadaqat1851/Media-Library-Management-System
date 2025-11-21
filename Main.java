import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<MediaItem> library = new ArrayList<>();

        Song s1 = new Song(1, "Bolna Mahi Bolna", 3.5, "Arjit Singh");
        Movie m1 = new Movie(2, "Inception", 148, "Christopher Nolan");
        Podcast p1 = new Podcast(3, "Mai Samay Hoon", 45, "Samay Raina");

        library.add(s1);
        library.add(m1);
        library.add(p1);

        System.out.println("=== PLAYBACK ===");
        for (MediaItem m : library) {
            m.Play();  
        }

        System.out.println("\n=== DOWNLOADABLE ITEMS ===");
        for (MediaItem m : library) {
            if (m instanceof Downloadable) {
                ((Downloadable) m).download();
            }
        }

        System.out.println("\n=== RATEABLE ITEMS ===");
        for (MediaItem m : library) {
            if (m instanceof Rateable) {
                ((Rateable) m).rate(5);
            }
        }

        System.out.println("\n=== SONG PLAYLIST ===");
        Playlist<Song> songPlaylist = new Playlist<>();
        songPlaylist.addItem(s1);
        songPlaylist.playAll();

    }
    
}
