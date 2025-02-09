package Stream_api.oop.average_level.qwen.product2;

class Product {
    String name;
    double price;
    String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}