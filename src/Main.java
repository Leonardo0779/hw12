
public class Main {
    public static void main(String[] args) {
        Author gogol = new Author("Nikolay ", "Gogol");
        Author Turgenev = new Author("Ivan", "Turgenev");
        Book book = new Book("Dead Souls",gogol,1835);
        book.setYearOfPublishing(1997);
        Book book2 = new Book("Mumu",Turgenev,1852);
        System.out.println(book);
    }
}