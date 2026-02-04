import java.util.ArrayList;

public class MusicalShow extends Show {

    private final String musicAuthor;
    private final String liberttoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                       String musicAuthor, String liberttoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.liberttoText = liberttoText;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public String getLiberttoText() {
        return liberttoText;
    }

    public void printLibretto(MusicalShow musicalShow) {
        System.out.println(musicalShow.getLiberttoText());
    }

}
