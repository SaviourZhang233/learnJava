package operation;

import book.BookList;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookList books) {
        System.out.println("退出程序");
        System.exit(0);
    }
}
