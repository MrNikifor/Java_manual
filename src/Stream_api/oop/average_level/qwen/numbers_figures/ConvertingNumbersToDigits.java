package Stream_api.oop.average_level.qwen.numbers_figures;

import java.util.Arrays;
import java.util.List;

public class ConvertingNumbersToDigits {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(123, 456, 789);
        //нужно найти сумму всех цифр этих чисел
        int sum = integers.stream()
                .flatMapToInt(x -> String.valueOf(x).chars())
                .map(Character::getNumericValue)
                .sum();

        System.out.println(sum);
    }
}
