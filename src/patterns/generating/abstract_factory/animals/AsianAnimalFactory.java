package patterns.generating.abstract_factory.animals;

import patterns.generating.abstract_factory.animals.animal.Elephant;
import patterns.generating.abstract_factory.animals.animal.Tiger;

public class AsianAnimalFactory implements AnimalFactory {
    @Override
    public Predator createPredator() {
        return new Tiger();
    }

    @Override
    public Herbivore createHerbivore() {
        return new Elephant();
    }
}
