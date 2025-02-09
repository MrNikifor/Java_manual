package Stream_api.oop.average_level.qwen.flatmap_order;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(Arrays.asList(new Item("Laptop", 1200), new Item("Mouse", 50))),
                new Order(Arrays.asList(new Item("Phone", 800), new Item("Charger", 20))),
                new Order(Arrays.asList(new Item("Tablet", 600), new Item("Keyboard", 150)))
        );
        //найти все товары, цена которых больше 100, и вывести их названия
        List<String> itemList = orders.stream()
                .flatMap(order -> order.getItems().stream())
                .filter(item -> item.getPrice() > 100)
                .map(Item::getName)
                .collect(Collectors.toList());

        itemList.forEach(System.out::println);
    }
}
