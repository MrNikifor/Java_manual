package Stream_api.tasks1;

import java.util.Arrays;
import java.util.List;

public class limitedOutput {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C++", "JavaScript", "Kotlin");

        //проверка на наличие строки
        boolean b = list.stream().anyMatch(x -> x.equals("C#"));
        System.out.println(b);

        // вывод менее 4 символов
        list.stream().filter(x -> x.length() < 4).forEach(System.out::println);

        // вывод более 5 символов
        long count = list.stream().filter(x -> x.length() > 5).count();
        System.out.println(count);
    }
}
