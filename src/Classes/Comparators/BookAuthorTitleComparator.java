package Classes.Comparators;

import Classes.Book.Book;

import java.util.Comparator;

public class BookAuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        int authorComparison = new BookAuthorComparator().compare(a, b);
        if (authorComparison != 0) {
            return authorComparison;
        }
        else {
            return new BookTitleComparator().compare(a, b);
        }
    }
}
