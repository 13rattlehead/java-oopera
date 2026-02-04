import java.util.ArrayList;

public class Opera extends MusicalShow {

    private final int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors, String musicAuthor,
                 String liberttoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, liberttoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

}
