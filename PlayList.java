import java.util.ArrayList;

class Playlist<T extends MediaItem> {

    private ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void playAll() {
        for (T item : items) {
            item.Play();
        }
    }
}
