package Tests;

import Classes.Book.Book;
import Classes.Comparators.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ComparatorsTest {

    private ArrayList<Book> books = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            books.add(new Book("test" + random.nextInt(10), "test" + +random.nextInt(5), random.nextInt(500), 2, "123-23223-" + random.nextInt(1000) + "-6"));
        }
    }

    private boolean isSortedByAuthor(ArrayList<Book> books) {
        for (int i = 0; i < books.size() - 1; i++) {
            if (books.get(i).getAuthor().compareTo(books.get(i + 1).getAuthor()) > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isSortedByTitle(ArrayList<Book> books) {
        for (int i = 0; i < books.size() - 1; i++) {
            if (books.get(i).getTitle().compareTo(books.get(i + 1).getTitle()) > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isSortedByAuthorTitle(ArrayList<Book> books) {
        for (int i = 0; i < books.size() - 1; i++) {
            if (books.get(i).getAuthor().compareTo(books.get(i + 1).getAuthor()) > 0) {
                return false;
            } else {
                if (books.get(i).getAuthor().compareTo(books.get(i + 1).getAuthor()) == 0) {
                    if (books.get(i).getTitle().compareTo(books.get(i + 1).getTitle()) > 0) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private boolean isSortedByTitleAuthor(ArrayList<Book> books) {
        for (int i = 0; i < books.size() - 1; i++) {
            if (books.get(i).getTitle().compareTo(books.get(i + 1).getTitle()) > 0) {
                return false;
            } else {
                if (books.get(i).getTitle().compareTo(books.get(i + 1).getTitle()) == 0) {
                    if (books.get(i).getAuthor().compareTo(books.get(i + 1).getAuthor()) > 0) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private boolean isSortedByAuthorTitlePrice(ArrayList<Book> books) {
        for (int i = 0; i < books.size() - 1; i++) {
            if (books.get(i).getAuthor().compareTo(books.get(i + 1).getAuthor()) > 0) {
                return false;
            } else {
                if (books.get(i).getAuthor().compareTo(books.get(i + 1).getAuthor()) == 0) {
                    if (books.get(i).getTitle().compareTo(books.get(i + 1).getTitle()) > 0) {
                        return false;
                    } else {
                        if (books.get(i).getTitle().compareTo(books.get(i + 1).getTitle()) == 0) {
                            if (books.get(i).getPrice() > books.get(i + 1).getPrice()) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }

    @Test
    public void AuthorComparatorSortingTest() {
        Collections.sort(books, new BookAuthorComparator());
        Assert.assertTrue(isSortedByAuthor(books));
    }

    @Test
    public void TitleComparatorSortingTest() {
        Collections.sort(books, new BookTitleComparator());
        Assert.assertTrue(isSortedByTitle(books));
    }

    @Test
    public void AuthorTitleComparatorSortingTest() {
        Collections.sort(books, new BookAuthorTitleComparator());
        Assert.assertTrue(isSortedByAuthorTitle(books));
    }

    @Test
    public void TitleAuthorComparatorSortingTest() {
        Collections.sort(books, new BookTitleAuthorComparator());
        Assert.assertTrue(isSortedByTitleAuthor(books));
    }

    @Test
    public void AuthorTitlePriceComparatorSortingTest() {
        Collections.sort(books, new BookAuthorTitlePriceComparator());
        Assert.assertTrue(isSortedByAuthorTitlePrice(books));
    }
}
