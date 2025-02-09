package patterns.generating.abstract_factory.animals;

public class Main {
    public static void main(String[] args) {
        AnimalFactory africanFactory = new AfricanAnimalFactory();
        Predator africanPredator = africanFactory.createPredator();
        Herbivore africanHerbivore = africanFactory.createHerbivore();

        africanPredator.hunt();
        africanHerbivore.graze();

        AnimalFactory asianFactory = new AsianAnimalFactory();
        Predator asianPredator = asianFactory.createPredator();
        Herbivore asianHerbivore = asianFactory.createHerbivore();

        asianPredator.hunt();
        asianHerbivore.graze();
    }
}
