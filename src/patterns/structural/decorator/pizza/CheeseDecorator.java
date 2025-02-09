package patterns.structural.decorator.pizza;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizzaDecor.getDescription() + " whit cheese";
    }

    @Override
    public Double getPrice(){
        return pizzaDecor.getPrice() + 2.0;
    }
}
