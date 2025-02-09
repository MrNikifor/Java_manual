package patterns.behavioral.template_method;

public class Cappuccino extends CoffeeTemplate {
    @Override
    protected void gatherIngredients() {
        System.out.println("Gathering espresso beans, water, and milk.");
    }

    @Override
    protected void brew() {
        System.out.println("Brewing espresso and frothing milk.");
    }

    @Override
    protected void serve() {
        System.out.println("Cappuccino is served with a sprinkle of cocoa.");
    }
}
