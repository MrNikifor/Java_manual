package Stream_api.oop.average_level.qwen.score;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Score> scores = Arrays.asList(
                new Score(1, 85),
                new Score(2, 90),
                new Score(1, 75),
                new Score(2, 80),
                new Score(3, 95)
        );
        //найти среднюю оценку для каждого студента
        Map<Integer, Double> collect = scores.stream()
                .collect(Collectors.groupingBy(Score::getStudentId, Collectors.averagingDouble(Score::getScore)));

        collect.forEach((k, v) -> System.out.println("Студент: " + k + ", Средняя оценка: " + v));
    }
}
