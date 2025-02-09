package patterns.generating.factory_method;

public class Main {
    public static void main(String[] args) {
        CoffeeShop italianoCoffeeShop = new ItalianCoffeeShop();
        italianoCoffeeShop.orderCoffee(CoffeeType.AMERICANO);
    }
}
