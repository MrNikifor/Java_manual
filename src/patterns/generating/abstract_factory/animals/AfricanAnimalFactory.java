package patterns.generating.abstract_factory.animals;

import patterns.generating.abstract_factory.animals.animal.Gazelle;
import patterns.generating.abstract_factory.animals.animal.Lion;

public class AfricanAnimalFactory implements AnimalFactory {
    @Override
    public Predator createPredator() {
        return new Lion();
    }

    @Override
    public Herbivore createHerbivore() {
        return new Gazelle();
    }
}
