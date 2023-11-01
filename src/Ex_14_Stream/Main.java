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

        sortByVolume().forEach(System.out::println);
        sortByAuthor().forEach(System.out::println);
        sortByBookName().forEach(System.out::println);
        reverseSortByBookName().forEach(System.out::println);

        filterByAuthor("Herbert");
        groupingByAuthor();

        findTheThinnestBook();
        findTheThickestBook();

        hasBook("Dune");

        List<Book> fictionBooks = filterByFiction(books);
        isAllBookFiction(fictionBooks);
        List<Book> nonfictionBooks = filterByNonfiction(books);
        isAllBookNonfiction(nonfictionBooks);
    }

    private static List<Book> setBooks() {
        return Arrays.asList(new Book("Dune", "Herbert Frank", 600, true),
                new Book("Spring in action", "Walls Craig", 752, false),
                new Book("Taynaya Opora", "Petranovskaya Lyudmila", 287, false),
                new Book("Nell and circus of dreams", "Gifford Nell", 32, true),
                new Book("Dune Messiah", "Herbert Frank", 350, true),
                new Book("Children of Dune", "Herbert Frank", 360, true)
        );
    }

    private static void groupingByAuthor() {
        Map<String, List<Book>> groupingByAuthorBooks = books.stream().collect(Collectors.groupingBy(Book::getAuthor));

        groupingByAuthorBooks.forEach((author, books) -> {
            System.out.println("Author: " + author);
            books.forEach(book -> System.out.println("name: " + book.getName()
                    + ", volume: " + book.getVolume()
                    + (book.isFiction() ? ", fiction" : ", nonfiction")));
            System.out.println();
        });
    }

    private static List<Book> sortByVolume() {
        return books.stream()
                .sorted(Comparator.comparingInt(Book::getVolume))
                .collect(Collectors.toList());
    }

    private static List<Book> sortByBookName() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getName))
                .collect(Collectors.toList());
    }

    private static List<Book> reverseSortByBookName() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getName).reversed())
                .collect(Collectors.toList());
    }

    private static List<Book> sortByAuthor() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getAuthor))
                .collect(Collectors.toList());
    }

    private static List<Book> filterByFiction(List<Book> books) {
        return books.stream()
                .filter(Book::isFiction)
                .collect(Collectors.toList());
    }

    private static List<Book> filterByNonfiction(List<Book> books) {
        return books.stream()
                .filter(book -> (!book.isFiction()))
                .collect(Collectors.toList());
    }

    private static void filterByAuthor(String author) {
        books.stream()
                .filter(book -> book.getAuthor().contains(author))
                .forEach(System.out::println);
    }

    private static void findTheThinnestBook() {
        System.out.println("The thinnest book is: ");
        books.stream()
                .min(Comparator.comparing(Book::getVolume))
                .ifPresent(System.out::println);
    }

    private static void findTheThickestBook() {
        System.out.println("The thickest book is: ");
        books.stream()
                .max(Comparator.comparing(Book::getVolume))
                .ifPresent(System.out::println);
    }

    private static void hasBook(String bookName) {
        if (books.stream().anyMatch(book -> bookName.equals(book.getName()))) {
            System.out.println("Book is here");
        } else {
            System.out.println("Book is not here");
        }
    }

    private static void isAllBookFiction(List<Book> books) {
        if (books.stream().allMatch(Book::isFiction)) {
            System.out.println("All books are fiction");
        } else {
            System.out.println("Has some nonfiction book or books");
        }
    }

    private static void isAllBookNonfiction(List<Book> books) {
        if (books.stream().noneMatch(Book::isFiction)) {
            System.out.println("All books are nonfiction");
        } else {
            System.out.println("Has some fiction book or books");
        }
    }
}
