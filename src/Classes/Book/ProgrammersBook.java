package Classes.Book;

public class ProgrammersBook extends Book{
    private String language;
    private int level;

    public ProgrammersBook(String title, String author, int price, int edition, String isbn, String language, int level) {
        super(title, author, price, edition, isbn);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "ProgrammersBook{" +
                "title='" + this.getTitle() + '\'' +
                ", author='" + this.getAuthor() + '\'' +
                ", edition='" + getEdition() + '\'' +
                ", price=" + this.getPrice() + '\'' +
                ", language='" + language + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProgrammersBook that = (ProgrammersBook) o;

        if (level != that.level) return false;
        return language.equals(that.language);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode() + language.hashCode() * 11;
        result = result + level * 31;
        return result;
    }
}
