package Classes.Book;

public class Book implements Comparable<Book> {
    private static int edition;
    private String title;
    private String author;
    private String isbn;
    private int price;

    public Book(String title, String author, int price, int edition, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        Book.edition = edition;
        this.isbn = isbn;
    }

    public static int getEdition() {
        return edition;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", edition='" + edition + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (price != book.price) return false;
        if (!title.equals(book.title)) return false;
        if (!author.equals(book.author)) return false;
        return edition == book.edition;

    }

    @Override
    public int hashCode() {
        int result = title.hashCode() * 11;
        result = result + author.hashCode() * 17;
        result = result + price * 31;
        return result;
    }

    @Override
    protected Object clone() {
        return new Book(title, author, price, edition, isbn);
    }

    @Override
    public int compareTo(Book o) {
        return this.getIsbn().compareTo(o.getIsbn());
    }
}
