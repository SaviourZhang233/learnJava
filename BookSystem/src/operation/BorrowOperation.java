package operation;

import book.BookList;

public class BorrowOperation implements IOperation {

    @Override
    public void work(BookList books) {
        System.out.println("借阅书籍");
    }
}
