import java.util.List;
import java.util.Map;
import java.util.Optional;

import mg.library.Book;
import mg.library.Library;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Java le Soir", "Paumard", 2020, "Programming", 45.99));
        library.addBook(new Book("Java Beast", "Herimanjaka", 2018, "Programming", 55.99));
        library.addBook(new Book("Papi Java", "Herimanjaka", 2019, "History", 35.50));

        Optional<Book> book = library.findBookByTitle("Java Fundamentals");
        book.ifPresent(System.out::println);

        List<Book> booksByAuthor = library.getBooksByAuthor("Herimanjaka");
        booksByAuthor.forEach(System.out::println);

        double averagePrice = library.getAveragePriceOfBooks();
        System.out.println("Average price: " + averagePrice);

        Map<String, List<Book>> booksByGenre = library.getBooksGroupedByGenre();
        booksByGenre.forEach((genre, books) -> {
            System.out.println("Genre: " + genre);
            books.forEach(System.out::println);
        });

        Map<String, Long> booksCountByAuthor = library.countBooksByAuthor();
        booksCountByAuthor.forEach((author, count) -> {
            System.out.println("Author: " + author + ", Books: " + count);
        });
    }
}
