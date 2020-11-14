package attributes.book;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Vaszistha jóga");
        System.out.println(book.getTitle());

        book.setTitle( "A rádzsa-jóga");
        System.out.println(book.getTitle());
    }
}
