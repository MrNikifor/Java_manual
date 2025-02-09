package patterns.structural.decorator.pizza;

public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizzaDecor.getDescription() + " whit pepperoni";
    }

    @Override
    public Double getPrice(){
        return pizzaDecor.getPrice() + 3.0;
    }
}
