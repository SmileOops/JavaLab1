package Classes.Comparators;

import Classes.Book.Book;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        return a.getTitle().compareTo(b.getTitle());
    }
}
