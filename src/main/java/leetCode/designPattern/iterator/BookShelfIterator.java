package leetCode.designPattern.iterator;

public class BookShelfIterator implements Iterator<Book> {

    BookShelf bookShelf;
    int last;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.last = 0;
    }

    @Override
    public boolean hasNext() {
        return last < bookShelf.getLength();
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBook(last);
        last++;
        return book;
    }
}
