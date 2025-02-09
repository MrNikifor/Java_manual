package patterns.behavioral.template_method;

public abstract class  CoffeeTemplate {
    //шаблонный метод
    public final void prepareCoffee() {
        gatherIngredients();
        brew();
        serve();
    }

    protected abstract void gatherIngredients();
    protected abstract void brew();

    protected void serve(){
        System.out.println("Coffee is served");
    };
}
