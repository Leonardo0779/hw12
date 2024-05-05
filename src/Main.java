
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Nikolay", "Gogol");
        Author pushkin = new Author("Nikolay", "Gogol");
        Book book = new Book("Dead Souls", "Gogol", 1835);
        book.setYearOfPublishing(1997);
        Book book2 = new Book("Viy", "Gogol", 1833);
        System.out.println(book);
    }
}