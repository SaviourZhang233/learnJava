package book;

import book.Book;

public class BookList {

    //最多存放100本书的书本数组
    private Book[] books = new Book[100];
    //当前书本数目
    private int size = 0;

//    public BookList(Book[] books) {
//        this.books = books;
//        this.size = books.length;
//    }


    public BookList() {
        books[0] = new Book("海贼王","尾田荣一郎",135.99,"少年热血漫画",false);
        books[1] = new Book("火影忍者","岸本齐史",120.80,"少年热血漫画",false);
        books[2] = new Book("龙珠","鸟山明",169.90,"少年热血漫画",false);
        size = 3;
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
