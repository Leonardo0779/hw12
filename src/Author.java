public class Author {
    private String firstName = "Nikolay";
    private String lastName = "Gogol";

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + lastName;
    }
}
