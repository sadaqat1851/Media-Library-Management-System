public class Podcast extends MediaItem implements Downloadable {
    private String host;

    public Podcast(int id, String title, double duration, String host){
        super(id, title, duration );
        this.host = host;
    }
    @Override
    public void Play(){
        System.out.println("Streaming podcast: " + title + " hosted by " + host);
    }
   @Override
   public void download(){
     System.out.println("Downloading podcast: " + title);
   }

}


