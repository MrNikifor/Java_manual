package patterns.generating.abstract_factory.animals;
//абстрактная фабрика
public interface AnimalFactory {
    Predator createPredator();
    Herbivore createHerbivore();
}
