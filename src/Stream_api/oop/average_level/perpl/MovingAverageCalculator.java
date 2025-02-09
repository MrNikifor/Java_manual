package Stream_api.oop.average_level.perpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//Напишите программу на Java, которая создает список чисел с плавающей точкой.
// Используя Stream API, вычислите скользящее среднее для этого списка с заданным размером окна
// .map(sublist -> sublist.stream().mapToDouble(Double::doubleValue).average().orElse(0.0)) // Вычисляем среднее

public class MovingAverageCalculator {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);

        int windowsSize = 3;
        System.out.println(calculateMovingAverage(list, windowsSize));
    }

    public static List<Double> calculateMovingAverage(List<Double> input, int windowsSize) {
        return IntStream.range(0, input.size() - windowsSize + 1)
                .mapToObj(i -> input.subList(i, i + windowsSize))
                .map(sub -> sub.stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .orElse(0.0))
                .collect(Collectors.toList());
    }
}
