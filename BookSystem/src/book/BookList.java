package book;

import book.Book;

public class BookList {

    //最多存放100本书的书本数组
    private Book[] books = new Book[100];
    //当前书本数目
    private int size = 0;

    public BookList(Book[] books, int size) {
        this.books = books;
        this.size = size;
    }

    public Book[] getBooks() {
        return books;
    }

    public int getSize() {
        return size;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
