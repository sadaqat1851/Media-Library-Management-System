public class Song extends MediaItem implements Downloadable, Rateable {

    private String artist;

    public Song(int id, String title, double duration, String artist){
        super(id, title, duration);
        this.artist = artist;
    }
    @Override
    public void Play(){
        System.out.println("Playing song: " + title + " by " + artist);
    }
    @Override
    public void download(){
         System.out.println("Downloading song: " + title);
    }
    @Override
    public void rate(int stars){
        System.out.println("Rating song: " + title + " → " + stars + " stars");
    }
}
