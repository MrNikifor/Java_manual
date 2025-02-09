package Stream_api.oop.average_level.qwen.order;

class Order {
    int productId;
    int quantity;

    public Order(int productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productId=" + productId +
                ", quantity=" + quantity +
                '}';
    }
}
