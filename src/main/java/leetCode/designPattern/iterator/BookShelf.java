package leetCode.designPattern.iterator;

import java.util.LinkedList;

public class BookShelf implements Aggregate {

    LinkedList<Book> books;

    public BookShelf() {
        books = new LinkedList<>();
    }

    boolean appeand(Book book) {
        return books.add(book);
    }

    int getLength() {
        return books.size();
    }

    Book getBook(int index) {
        return books.get(index);
    }


    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
