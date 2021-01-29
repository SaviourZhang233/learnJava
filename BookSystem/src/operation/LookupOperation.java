package operation;

import book.BookList;

public class LookupOperation implements IOperation{

    @Override
    public void work(BookList books) {
        System.out.println("查找书籍");
    }
}
