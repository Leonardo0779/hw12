public class Book {
    private String name;
    private Author author;
    private int yearOfPublishing;

    public Book(String name, Author author, int yearOfPublishing) {
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }
}



