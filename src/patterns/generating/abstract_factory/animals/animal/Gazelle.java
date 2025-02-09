package patterns.generating.abstract_factory.animals.animal;

import patterns.generating.abstract_factory.animals.Herbivore;

public class Gazelle implements Herbivore {
    @Override
    public void graze() {
        System.out.println("Gazelle is grazing.");
    }
}
