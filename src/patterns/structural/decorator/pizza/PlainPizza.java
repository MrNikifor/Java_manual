package patterns.structural.decorator.pizza;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public Double getPrice() {
        return 8.0;
    }
}
