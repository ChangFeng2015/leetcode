package leetCode.designPattern.iterator;

import org.junit.Test;

/**
 * @ClassName BookShelfTest
 * @Description TODO
 * @Author Dave
 * @Date 2018/9/23 12:02
 * @Version 1.0
 **/
public class BookShelfTest {

    @Test
    public void shelfTest() {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("book A"));
        bookShelf.appendBook(new Book("book B"));
        bookShelf.appendBook(new Book("book C"));
        bookShelf.appendBook(new Book("book d"));
        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
