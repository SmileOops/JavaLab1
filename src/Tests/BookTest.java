package Tests;

import Classes.Book.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BookTest {

    private boolean isSorted(ArrayList<Book> books) {
        for (int i = 0; i < books.size() - 1; i++) {
            if (books.get(i).getIsbn().compareTo(books.get(i).getIsbn()) > 0) return false;
        }

        return true;
    }

    @Test
    public void SortingTest() {
        ArrayList<Book> books = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            books.add(new Book("test", "test", 1, 2, "123-23223-" + random.nextInt(1000) + "-6"));
        }

        Collections.sort(books);

        Assert.assertTrue(isSorted(books));
    }

}