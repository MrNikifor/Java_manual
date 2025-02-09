package patterns.structural.decorator.pizza;

public class PizzaDecorator implements Pizza {
    protected Pizza pizzaDecor;

    public PizzaDecorator(Pizza pizza) {
        this.pizzaDecor = pizza;
    }

    @Override
    public String getDescription() {
        return pizzaDecor.getDescription();
    }

    @Override
    public Double getPrice() {
        return pizzaDecor.getPrice();
    }
}
