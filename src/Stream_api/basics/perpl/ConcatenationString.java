package Stream_api.basics.perpl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ConcatenationString {
    public static void main(String[] args) {
        List<String> movies = Arrays.asList("Титаник", "Интерстеллар", "Матрица", "Начало");

        //создаем - Титаник; Интерстеллар; Матрица; Начало
        Optional<String> reduced = movies.stream().reduce((a, b) -> a + "; " + b);
        System.out.println(reduced.get());
    }
}
