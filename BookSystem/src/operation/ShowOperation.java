package operation;

import book.BookList;

public class ShowOperation implements IOperation{

    @Override
    public void work(BookList books) {
        System.out.println("展示所有书籍");
        for(int i = 0;i < books.getSize();i++){
            System.out.println(books.getBooks()[i]);
        }
        System.out.println("所有书籍显示完毕");
    }
}
