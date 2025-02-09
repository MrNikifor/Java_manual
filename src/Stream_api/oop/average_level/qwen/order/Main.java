package Stream_api.oop.average_level.qwen.order;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(1, 5),
                new Order(2, 10),
                new Order(3, 15),
                new Order(4, 20)
        );
        //нужно найти общее количество заказанных товаров и среднее количество товаров на один заказ
        int sum = orders.stream().mapToInt(Order::getQuantity).sum();

        OptionalDouble average = orders.stream().mapToDouble(Order::getQuantity).average();

        if (average.isPresent()) {
            System.out.println("Общее количество товаров - " + sum +
                    " : Среднее количество товаров - " + average.getAsDouble());
        } else {
            System.out.println("Список заказов пуст.");
        }
    }
}
