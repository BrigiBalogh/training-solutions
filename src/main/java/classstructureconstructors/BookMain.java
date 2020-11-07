package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {
        Book book= new Book ("Mijazaki Josifumi","Sinrin-joku");

        book.register("102030");

        System.out.println("Szerző:"+book.getAuthor());
        System.out.println("Könyv Címe:"+book.getTitle());
        System.out.println("Regisztrációs szám:"+book.getRegNumber());
    }
}
