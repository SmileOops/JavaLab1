package Classes.Comparators;

import Classes.Book.Book;

import java.util.Comparator;

public class BookTitleAuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book a, Book b) {
        int titleComparison = new BookTitleComparator().compare(a, b);
        if (titleComparison != 0) {
            return titleComparison;
        }
        else {
            return new BookAuthorComparator().compare(a, b);
        }
    }
}
