package Stream_api.basics.perpl.oop.student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Иван", 85, 20),
                new Student("Анна", 90, 22),
                new Student("Петр", 85, 21),
                new Student("Мария", 95, 19)
        );
        //группировка студентов по их оценкам
        Map<Integer, Long> collect2 = students.stream().
                collect(Collectors.groupingBy(Student::getGrade, Collectors.counting()));

        collect2.forEach((k, v) -> System.out.println("Оценка: " + k + ", : Количество: " + v));

        //сортировки студентов по оценке и возрасту
        List<Student> collect1 = students.stream()
                .sorted((a, b) -> {
                    int compare = Integer.compare(a.getGrade(), b.getGrade());
                    if (compare == 0) {
                        compare = Integer.compare(b.getAge(), a.getAge());
                    }
                    return compare;
                }).collect(Collectors.toList());

        System.out.println(collect1);


        //сортировки студентов по оценке и имени
        List<String> collect = students.stream()
                .sorted(Comparator.comparingInt(Student::getGrade)
                        .thenComparing(Student::getName))
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
