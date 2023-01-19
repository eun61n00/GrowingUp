package ch23;

import ch21.Book;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("title0", "author0"));
        library.add(new Book("title1", "author1"));
        library.add(new Book("title2", "author2"));
        library.add(new Book("title3", "author3"));
        library.add(new Book("title4", "author4"));

        for (int i = 0; i < library.size(); i++) {
            System.out.println(library.get(i).toString());
        }
    }
}
