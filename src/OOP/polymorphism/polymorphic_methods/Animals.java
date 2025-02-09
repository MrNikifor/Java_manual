package OOP.polymorphism.polymorphic_methods;

public class Animals {
    public void makeSound(){
        System.out.println("MakeSound");
    }
}

class Dog extends Animals {
    @Override
    public void makeSound(){
        System.out.println("WAW!!!");
    }
}
class Cat extends Animals {
    @Override
    public void makeSound(){
        System.out.println("May...");
    }
}
