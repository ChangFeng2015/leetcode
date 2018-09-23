package leetCode.designPattern.iterator;

/**
 * @ClassName BookShelfIterator
 * @Description TODO
 * @Author Dave
 * @Date 2018/9/23 11:56
 * @Version 1.0
 **/
public class BookShelfIterator implements Iterator<Book> {

    private BookShelf bookShelf;
    private int last;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        last = 0;
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBook(last);
        last++;
        return book;
    }

    @Override
    public boolean hasNext() {
        return last < bookShelf.getLength();
    }
}
