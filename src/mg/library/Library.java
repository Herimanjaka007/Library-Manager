package mg.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public Optional<Book> findBookByTitle(String title) {
        return this.books.stream()
                .filter(book -> book.getTitle().equals(title))
                .reduce((firstBook, secondBook) -> firstBook);
    }

    public List<Book> getBooksByAuthor(String author) {
        return this.books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public List<Book> getBooksByGenre(String genre) {
        return this.books.stream()
                .filter(book -> book.getGenre().equals(genre))
                .collect(Collectors.toList());
    }

    public List<Book> getBooksPublishedAfter(int year) {
        return this.books.stream()
                .filter(book -> book.getPublicationYear() > year)
                .collect(Collectors.toList());
    }

    public double getAveragePriceOfBooks() {
        return this.books.stream()
                .mapToDouble(book -> book.getPrice())
                .average()
                .orElse(0d);
    }

    public Map<String, List<Book>> getBooksGroupedByGenre() {
        return this.books.stream()
                .collect(Collectors.groupingBy(Book::getGenre));
    }

    public Map<String, Long> countBooksByAuthor() {
        return this.books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));
    }
}
