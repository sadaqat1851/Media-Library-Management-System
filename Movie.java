public class Movie extends MediaItem implements Rateable{
    
    private String director;

    public Movie(int id, String title, double duration, String director){
        super(id, title, duration);
        this.director = director;
    }

    public void Play(){
        System.out.println("Playing movie: " + title + " directed by " + director);
    }

    public void rate(int stars){
        System.out.println("Rating movie: " + title + " → " + stars + " stars");
    }
}
