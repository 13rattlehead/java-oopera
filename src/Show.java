import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    public Director director;
    public ArrayList<Actor> listOfActors;


    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }

    public void printAllActors(Show show) {
        for (Actor actor : show.listOfActors) {
            System.out.println(actor.getName() + " " + actor.getSurname() + "(" + actor.getHeight() + ")");
        }
    }

    public boolean isActorInShow(Show show, Actor actor) {
        for (Actor a : show.listOfActors) {
            if (a.equals(actor)) {
                return true;
            }
        }
        return false;
    }


    public void addActorToShow(Show show, Actor actor) {
        if (!isActorInShow(show, actor)) {
            show.listOfActors.add(actor);
        } else {
            System.out.println("Этот актер уже играет в данном произведении.");
        }
    }

    public void changeActors(Actor newActor, String oldActorsSurname) {
        int index = 0;
        for (Actor actor : listOfActors) {
            if (oldActorsSurname.equals(actor.getSurname())) {
                listOfActors.set(listOfActors.indexOf(actor), newActor);
                break;
            } else {
                index++;
            }
            if (index == listOfActors.size()) {
                System.out.println("Актера с фамилией " + oldActorsSurname + " нет в данном произведении.");
            }
        }
    }

    public void printDirectorInfo(Show show) {
        System.out.println(show.director.toString());
    }

    @Override
    public String toString() {
        return "Show{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }

}
