package patterns.generating.abstract_factory.animals.animal;

import patterns.generating.abstract_factory.animals.Predator;

public class Tiger implements Predator {
    @Override
    public void hunt() {
        System.out.println("Tiger is hunting.");
    }
}
