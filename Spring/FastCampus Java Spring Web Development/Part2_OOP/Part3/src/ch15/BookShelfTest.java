package ch15;

public class BookShelfTest {

    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("book0");
        bookQueue.enQueue("book1");
        bookQueue.enQueue("book2");
        bookQueue.enQueue("book3");
        bookQueue.enQueue("book4");

        System.out.println(bookQueue.getSize());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }

}
