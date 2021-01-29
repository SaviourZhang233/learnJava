package operation;

import book.BookList;

public class DelOperation implements IOperation{

    @Override
    public void work(BookList books) {
        System.out.println("删除书籍");
    }
}
