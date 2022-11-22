public class Book {
    private String name;
    private int yearPublication;
    Author author;
    public Book(String name, int yearPublication, Author author) {
        this.name = name;
        this.yearPublication = yearPublication;
        this.author = author;
    }
    public String getName() {
        return this.name;
    }
    public int getYearPublication() {
        return this.yearPublication;
    }
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
    public Author getAuthor() {
        return author;
    }
}
