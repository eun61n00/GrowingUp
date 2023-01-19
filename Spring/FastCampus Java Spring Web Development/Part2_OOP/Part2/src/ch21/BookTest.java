package ch21;

public class BookTest {

    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book("title0", "author0");
        library[1] = new Book("title1", "author1");
        library[2] = new Book("title2", "author2");
        library[3] = new Book("title3", "author3");
        library[4] = new Book("title4", "author4");

        for (Book book : library) {
            System.out.println(book.toString());
        }
    }
}
