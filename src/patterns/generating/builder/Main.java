package patterns.generating.builder;

public class Main {
    public static void main(String[] args) {
        Person.PersonBuilder builder = new Person.PersonBuilder();

        PersonDirector director = new PersonDirector(builder);

        Person youngPerson = director.createYoungPerson("Niki", "Best");
        System.out.println(youngPerson);

        Person seniorPerson = director.createSeniorPerson("Vetik", "Best2");
        System.out.println(seniorPerson);
    }
}
