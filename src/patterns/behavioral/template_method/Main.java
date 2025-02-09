package patterns.behavioral.template_method;

public class Main {
    public static void main(String[] args) {
        CoffeeTemplate espresso = new Espresso();
        espresso.prepareCoffee();

        System.out.println();

        CoffeeTemplate cappuccino = new Cappuccino();
        cappuccino.prepareCoffee();
    }
}
