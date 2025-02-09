package Stream_api.oop.average_level.qwen.product2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200, "Electronics"),
                new Product("Phone", 800, "Electronics"),
                new Product("Tablet", 600, "Electronics"),
                new Product("Chair", 100, "Furniture"),
                new Product("Sofa", 550, "Furniture"),
                new Product("Desk", 700, "Furniture")
        );
        //найти среднюю цену продуктов для каждой категории, но только для тех категорий, где минимальная цена продукта больше 500.
        Map<String, Double> collect = products.stream().collect(Collectors.groupingBy(Product::getCategory))
                .entrySet()
                .stream()
                .filter(o -> o.getValue()
                        .stream()
                        .mapToDouble(Product::getPrice)
                        .min()
                        .orElse(0) > 500)
                .collect(Collectors.toMap(Map.Entry::getKey,
                        v -> v.getValue()
                                .stream()
                                .mapToDouble(Product::getPrice)
                                .average()
                                .orElse(0.0)));

        collect.forEach((k, v) -> System.out.println("Категория - " + k + ": средняя цена - " + v));
    }
}
