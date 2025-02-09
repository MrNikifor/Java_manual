package patterns.structural.decorator.pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();

        pizza = new CheeseDecorator(pizza);
        pizza = new PepperoniDecorator(pizza);

        System.out.println(pizza.getDescription() + " price -  " + pizza.getPrice());

    }
}
