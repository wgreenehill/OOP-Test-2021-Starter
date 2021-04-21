package ie.tudublin;

public class Note
{
    private char note;
    private int duration;

    public Note(char note, int duration)
    {
        this.note = note;
        this.setDuration(duration);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String toString()
    {
        return note + " " + getDuration();
    }
}
