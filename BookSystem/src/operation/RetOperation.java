package operation;

import book.BookList;

public class RetOperation implements IOperation{

    @Override
    public void work(BookList books) {
        System.out.println("归还书籍");
    }
}
