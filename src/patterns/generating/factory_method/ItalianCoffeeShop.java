package patterns.generating.factory_method;

public class ItalianCoffeeShop extends CoffeeShop {

    @Override
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO:
                coffee = new ItalianStyleAmericano();
                System.out.println("Americano coffee");
                break;
            case ESPRESSO:
                coffee = new ItalianStyleEspresso();
                System.out.println("Espresso coffee");
                break;
            case CAPPUCCINO:
                coffee = new ItalianStyleCappuccino();
                System.out.println("Cappuccino coffee");
                break;
            case CAFFE_LATTE:
                coffee = new ItalianStyleCaffeLatte();
                System.out.println("Caffe Latte coffee");
                break;
        }
        return coffee;
    }
}
