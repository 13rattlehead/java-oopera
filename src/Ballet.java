import java.util.ArrayList;

public class Ballet extends MusicalShow {

    private final String choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                  String musicAuthor, String liberttoText, String choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, liberttoText);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }

}
