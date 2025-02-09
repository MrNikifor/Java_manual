package Stream_api.oop.average_level.qwen.book;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Book1", "Author1"),
                new Book("Book2", "Author2"),
                new Book("Book3", "Author1"),
                new Book("Book4", "Author2")
        );
        //создать мапу, где ключом будет автор, а значением — список книг этого автора
        Map<String, List<String>> collect = books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.mapping(Book::getTitle, Collectors.toList())));

        collect.forEach((author, bookList) -> {
            System.out.println("Автор: " + author);
            bookList.forEach(v -> System.out.println(" - " + v));
        });
    }
}