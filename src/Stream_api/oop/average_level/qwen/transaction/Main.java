package Stream_api.oop.average_level.qwen.transaction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(100, "EUR", "Germany"),
                new Transaction(200, "USD", "USA"),
                new Transaction(150, "EUR", "Germany"),
                new Transaction(300, "EUR", "France")
        );
        //найти общую сумму транзакций для каждой страны
        transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getCountry, Collectors.summingDouble(Transaction::getAmount)))
                .forEach((k, v) -> System.out.println("Country - " + k + ": Sum - " + v));

        //найти общую сумму транзакций в евро (EUR) для конкретной страны.
        double sum = transactions.stream()
                .filter(o -> o.getCurrency().equals("EUR") && o.getCountry().equals("Germany"))
                .mapToDouble(Transaction::getAmount)
                .sum();

        System.out.println(sum);
    }
}
