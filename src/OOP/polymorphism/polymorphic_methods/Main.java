package OOP.polymorphism.polymorphic_methods;

public class Main {
    public static void makeAnimalSound(Animals animals){
        animals.makeSound();
    }

    public static void main(String[] args) {
           Animals MyDog = new Dog();
           Animals MyCat = new Cat();

           makeAnimalSound(MyDog);
           makeAnimalSound(MyCat);

    }
}
