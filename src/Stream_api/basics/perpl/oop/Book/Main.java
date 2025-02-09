package Stream_api.basics.perpl.oop.Book;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Война и мир", "Лев Толстой"),
                new Book("1984", "Джордж Оруэлл"),
                new Book("Мастер и Маргарита", "Михаил Булгаков")
        );
        //преобразования списка книг в список строк формата "Название - Автор"
        List<String> collect = books.stream()
                .map(book -> book.getTitle() + " - " + book.getAuthor())
                .collect(Collectors.toList());

        System.out.println(collect);
        //извлечения названий книг из списка
        books.stream().map(Book::getTitle).forEach(x -> System.out.print(x + ", "));

    }
}
