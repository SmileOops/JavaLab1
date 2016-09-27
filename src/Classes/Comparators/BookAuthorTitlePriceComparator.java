package Classes.Comparators;

import Classes.Book.Book;

import java.util.Comparator;

public class BookAuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        int authorComparison = new BookAuthorComparator().compare(a, b);
        if (authorComparison != 0) {
            return authorComparison;
        }
        else {
            int titleComparison = new BookTitleComparator().compare(a, b);
            if (titleComparison != 0) {
                return titleComparison;
            }
            else {
                return new BookPriceComparator().compare(a, b);
            }

        }
    }
}
