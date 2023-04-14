package zadnie32;

public class TestAuthor {
    public static void Main(String[] args) {

        Author author = new Author("Bolesław", "Prus", 55);

        Author author1 = new Author("Bolesław", "Leśmian", 55);

        Author author2 = new Author("Eliza", "Orzeszkowa", 34);


        // Wywołanie getterów i wydrukowanie wyników
        System.out.print("Author Name = " + author.getName() + " ");
        System.out.print("Surname = " + author.getSurname() + ", ");
        System.out.print("age = " + author.getAge());
        System.out.println();

        System.out.print("Author Name = " + author1.getName() + " ");
        System.out.print("Surname = " + author1.getSurname() + ", ");
        System.out.print("age = " + author1.getAge());
        System.out.println();

        System.out.print("Author Name = " + author2.getName() + " ");
        System.out.print("Surname = " + author2.getSurname() + ", ");
        System.out.print("age = " + author2.getAge());
        System.out.println();


        System.out.println(author.toString());
    }
}