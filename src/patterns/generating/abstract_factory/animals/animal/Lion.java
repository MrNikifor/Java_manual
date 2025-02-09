package patterns.generating.abstract_factory.animals.animal;

import patterns.generating.abstract_factory.animals.Predator;

public class Lion implements Predator {
    @Override
    public void hunt() {
        System.out.println("Lion is hunting.");
    }
}
