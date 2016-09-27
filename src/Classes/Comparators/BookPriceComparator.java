package Classes.Comparators;

import Classes.Book.Book;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        return a.getPrice() - b.getPrice();
    }
}
