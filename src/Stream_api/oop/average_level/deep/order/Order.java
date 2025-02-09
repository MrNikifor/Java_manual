package Stream_api.oop.average_level.deep.order;

public class Order {
    private String product;
    private double price;
    private int quantity;

    public Order(String product, double price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return product + " (Price: " + price + ", Quantity: " + quantity + ")";
    }
}
