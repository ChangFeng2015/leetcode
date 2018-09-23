package leetCode.designPattern.iterator;

import java.util.ArrayList;

/**
 * @ClassName BookShelf
 * @Description TODO
 * @Author Dave
 * @Date 2018/9/23 11:53
 * @Version 1.0
 **/
public class BookShelf {

    private ArrayList<Book> books;
    private int index;

    public BookShelf() {
        this.books = new ArrayList<Book>(10);
    }

    public BookShelf(int minSize) {
        this.books = new ArrayList<Book>(minSize);
    }

    public Book getBook(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
