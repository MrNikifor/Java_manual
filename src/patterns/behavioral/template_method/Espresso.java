package patterns.behavioral.template_method;

public class Espresso extends CoffeeTemplate {
    @Override
    protected void gatherIngredients() {
        System.out.println("Gathering espresso beans and water.");
    }

    @Override
    protected void brew() {
        System.out.println("Brewing espresso with high pressure.");
    }
}
