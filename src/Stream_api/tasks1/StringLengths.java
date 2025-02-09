package Stream_api.tasks1;

import java.util.Arrays;
import java.util.List;

public class StringLengths {
    public static void main(String[] args) {
        List<String> frutList = Arrays.asList("Banana", "Orange", "Pineapple", "Watermelon", "Lemon");

        frutList.stream().map(String::length).forEach(x -> System.out.print(x + " "));
    }
}
