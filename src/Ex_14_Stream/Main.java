package Ex_14_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    private static List<Book> books;

    public static void main(String[] args) {
        books = setBooks();
        getMap().forEach((s, i) -> System.out.println(s + " - " + i));
        sortByVolume().forEach(System.out::println);
        sortByBookName().forEach(System.out::println);
        sortByAuthor().forEach(System.out::println);

    }

    private static List<Book> setBooks() {
        return Arrays.asList(new Book("Dune", "Herbert Frank", 733, true),
            new Book("Spring in action", "Walls Craig", 752, false),
            new Book("Taynaya Opora", "Petranovskaya Lyudmila", 287, false),
            new Book("Nell and circus of dreams", "Gifford Nell", 32, true)
            );
    }

    private static Map<String, List<Book>> getMap() {
        return books.stream().collect(Collectors.groupingBy(Book::getAuthor));
    }

    private static List<Book> sortByVolume() {
        return books.stream().sorted(Comparator.comparingInt(Book::getVolume)).collect(Collectors.toList());
    }

    private static List<Book> sortByBookName() {
        return books.stream().sorted(Comparator.comparing(Book::getName)).collect(Collectors.toList());
    }

    private static List<Book> sortByAuthor() {
        return books.stream().sorted(Comparator.comparing(Book::getAuthor)).collect(Collectors.toList());
    }

}
