public abstract  class MediaItem{

    protected int id;
    protected String title;
    protected double duration;

    public MediaItem(int id, String title, double duration){
        this.id = id;
        this.title = title;
        this.duration = duration;

    }

    public abstract void Play();
}

