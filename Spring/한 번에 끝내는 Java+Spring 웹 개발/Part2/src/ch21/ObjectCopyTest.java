package ch21;

public class ObjectCopyTest {

    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("title0", "author0");
        library[1] = new Book("title1", "author1");
        library[2] = new Book("title2", "author2");
        library[3] = new Book("title3", "author3");
        library[4] = new Book("title4", "author4");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for (int i = 0; i < library.length; i++) {
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }

        library[0].setTitle("copy test");

//        System.arraycopy(library, 0, copyLibrary,  0, 5);
        System.out.println("=== Library ===");
        for (Book book : library) {
            System.out.println(book.toString() + " " + System.identityHashCode(book));
        }
        System.out.println("=== Copy Library ===");
        for (Book book : copyLibrary) {
            System.out.println(book.toString() + " " + System.identityHashCode(book));
        }
    }
}
