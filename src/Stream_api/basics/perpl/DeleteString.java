package Stream_api.basics.perpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeleteString {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(" Привет, мир! ", " Как дела? ", " Java - это здорово! ");

        // удаления пробелов в начале и конце каждой строки
        sentences.stream().map(String::trim).collect(Collectors.toList()).forEach(x -> System.out.print(x + ", "));
    }
}
