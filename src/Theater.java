import java.util.ArrayList;

public class Theater {
    public static void main(String[] args) {
        // Создаем актеров
        Actor actor1 = new Actor("Иван", "Иванов", Person.Gender.MALE, 180);
        Actor actor2 = new Actor("Мария", "Петрова", Person.Gender.FEMALE, 165);
        Actor actor3 = new Actor("Алексей", "Сидоров", Person.Gender.MALE, 175);

        // Создаем режиссеров
        Director director1 = new Director("Павел", "Смирнов", Person.Gender.MALE, 15);
        Director director2 = new Director("Елена", "Козова", Person.Gender.FEMALE, 12);

        // Создаем автора музыки и хореографа
        Person musicAuthor = new Person("Дмитрий", "Михайлов", Person.Gender.MALE);
        Person choreographer = new Person("Анна", "Волкова", Person.Gender.FEMALE);

        // Создаем спектакли
        ArrayList<Actor> actorsForShow1 = new ArrayList<>();
        Show show1 = new Show("Красная шапочка", 90, director1, actorsForShow1);

        ArrayList<Actor> actorsForShow2 = new ArrayList<>();
        Opera opera = new Opera("Евгений Онегин", 120, director2, actorsForShow2, "Петр Чайковский", "Текст либретто оперы", 30);

        ArrayList<Actor> actorsForShow3 = new ArrayList<>();
        MusicalShow ballet = new MusicalShow("Лебединое озеро", 100, director1, actorsForShow3, "Петр Чайковский", "Текст либретто балета");

        // Распределяем актеров по спектаклям
        show1.addActorToShow(show1, actor1);
        show1.addActorToShow(show1, actor2);

        opera.addActorToShow(opera, actor2);
        opera.addActorToShow(opera, actor3);

        ballet.addActorToShow(ballet, actor1);
        ballet.addActorToShow(ballet, actor3);

        // Выводим список актёров для каждого спектакля
        System.out.println("Список актёров для 'Красная шапочка':");
        show1.printAllActors(show1);

        System.out.println("\nСписок актёров для 'Евгений Онегин':");
        opera.printAllActors(opera);

        System.out.println("\nСписок актёров для 'Лебединое озеро':");
        ballet.printAllActors(ballet);

        // Заменяем актера в одном из спектаклей
        System.out.println("\nЗаменяем актера в 'Красная шапочка':");
        Actor newActor = new Actor("Сергей", "Морозов", Person.Gender.MALE, 182);
        show1.changeActors(newActor, "Иванов");
        System.out.println("Список актёров после замены:");
        show1.printAllActors(show1);

        // Пытаемся заменить несуществующего актера
        System.out.println("\nПытаемся заменить несуществующего актера:");
        show1.changeActors(newActor, "Петров");

        // Выводим текст либретто для оперного и балетного спектакля
        System.out.println("\nТекст либретто оперы 'Евгений Онегин':");
        opera.printLibretto(opera);

        System.out.println("\nТекст либретто балета 'Лебединое озеро':");
        ballet.printLibretto(ballet);
    }
}
