package Stream_api.oop.average_level.qwen.transaction2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(100, "EUR", LocalDate.of(2023, 10, 1)),
                new Transaction(200, "USD", LocalDate.of(2023, 10, 2)),
                new Transaction(150, "EUR", LocalDate.of(2023, 10, 3)),
                new Transaction(300, "USD", LocalDate.of(2023, 10, 4)),
                new Transaction(250, "EUR", LocalDate.of(2023, 10, 5))
        );
        //нужно найти самую большую транзакцию для каждой валюты
        Map<String, Optional<Transaction>> collect = transactions.stream().collect(Collectors.groupingBy(Transaction::getCurrency,
                Collectors.maxBy(Comparator.comparingDouble(Transaction::getAmount))));

        collect.forEach((k, v) -> System.out.println("Валюта - " + k + ": Максимальная транзакция - " + v.get().getAmount()));
    }
}
