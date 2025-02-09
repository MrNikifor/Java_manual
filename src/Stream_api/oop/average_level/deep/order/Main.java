package Stream_api.oop.average_level.deep.order;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Laptop", 1200.0, 2),
                new Order("Smartphone", 800.0, 3),
                new Order("Tablet", 500.0, 1),
                new Order("Monitor", 300.0, 4),
                new Order("Keyboard", 50.0, 10)
        );
        //найти среднюю стоимость заказа для каждого продукта
        Map<String, Double> averTotalProd = orders.stream().collect(Collectors.groupingBy(Order::getProduct, Collectors.averagingDouble(Order::getTotalCost)));

        averTotalProd.forEach((k, v) -> System.out.println("Продукт - " + k + ": Средняя цена - " + v));

        System.out.println("-----------------------");
        //найти продукт с наименьшей общей стоимостью заказов и вывести его на экран
        Map<String, Double> totalCost = orders.stream().collect(Collectors.groupingBy(Order::getProduct, Collectors.summingDouble(Order::getTotalCost)));

        totalCost.entrySet().stream().min(Map.Entry.comparingByValue())
                .ifPresent(x -> System.out.println("Название продукта: " + x.getKey() + ", Общая стоимость - " + x.getValue()));

        System.out.println("-----------------------");
        //найти все продукты, общая стоимость заказов для которых больше 2000, и вывести их на экран.
        Map<String, Double> totalProdAndCost2 = orders.stream().collect(Collectors.groupingBy(Order::getProduct, Collectors.summingDouble(Order::getTotalCost)));

        totalProdAndCost2.entrySet().stream().filter(x -> x.getValue() > 2000).forEach(System.out::println);

        System.out.println("-----------------------");
        //самый дорогой по общей стоимости
        Map<String, Double> totalProdAndCost = orders.stream()
                .collect(Collectors.groupingBy(Order::getProduct, Collectors.summingDouble(Order::getTotalCost)));

        totalProdAndCost.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(entry -> System.out.println("Название продукта: " + entry.getKey() + ", Общая стоимость: " + entry.getValue()));

        System.out.println("-----------------------");
        //вывести товар и общую стоимость всех его заказов
        Map<String, Double> totalCostByProduct = orders.stream().collect(Collectors.groupingBy(Order::getProduct, Collectors.summingDouble(Order::getTotalCost)));

        totalCostByProduct.forEach((product, totalCost1) -> System.out.println(product + ": " + totalCost1));

        System.out.println("-----------------------");
        //частый заказ
        orders.stream().max(Comparator.comparingInt(Order::getQuantity)).ifPresent(System.out::println);

        System.out.println("-----------------------");
        //общая стоимость заказа выше 1000
        orders.stream().filter(o -> o.getTotalCost() > 1000).forEach(System.out::println);

        System.out.println("-----------------------");
        //средняя стоимость заказа
        orders.stream().mapToDouble(Order::getPrice).average().ifPresent(System.out::println);

        System.out.println("-----------------------");
        //общее количество товаров
        long count = orders.stream().mapToInt(Order::getQuantity).sum();
        System.out.println(count);

        System.out.println("-----------------------");
        //группируем в map по имени продукта
        Map<String, List<Order>> collect = orders.stream().collect(Collectors.groupingBy(Order::getProduct));
        System.out.println(collect);

        System.out.println("-----------------------");
        //самый дорогой заказ
        Optional<Order> max = orders.stream().max((o1, o2) -> Double.compare(o1.getTotalCost(), o2.getTotalCost()));
        System.out.println(max.get());

        System.out.println("-----------------------");
        //общая сумма всех товаров
        double sum = orders.stream().mapToDouble(Order::getTotalCost).sum();
        System.out.println(sum);
    }
}
