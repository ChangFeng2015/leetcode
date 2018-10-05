package leetCode.designPattern.iterator;

import leetCode.designPattern.Adaptor.FileIO;
import leetCode.designPattern.Adaptor.FileProperties;
import org.junit.Test;

import java.io.IOException;

public class BookShelfTest {
    @Test
    public void test() {
        BookShelf bookShelf = new BookShelf();
        for (int i = 0; i < 10; i ++) {
            Book bookOne = new Book("book " + i);
            bookShelf.appeand(bookOne);
        }

        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getName());
        }

    }

}
