package Stream_api.oop.average_level.qwen.product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200.0),
                new Product("Phone", 800.0),
                new Product("Tablet", 600.0),
                new Product("Monitor", 300.0)
        );
        //найти первый продукт, цена которого больше 500
        Optional<Product> first = products.stream().filter(o -> o.getPrice() > 500)
                .findFirst();
        System.out.println(first.get());

        //нужно найти самый дорогой продукт
        products.stream().max(Comparator.comparingDouble(Product::getPrice)).ifPresent(product -> System.out.println("Самый дорогой продукт: " + product.getName()));
        // System.out.println("Самый дорогой продукт: " + max.get().getName());
    }
}
