package operation;

import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {

    @Override
    public void work(BookList books) {
        System.out.println("借阅书籍");
        System.out.println("请输入你要借阅的书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for(int i = 0;i < books.getSize();i++){
            if(name.equals(books.getBooks()[i].getName()) && books.getBooks()[i].getBorrowed() == false){
                books.getBooks()[i].setBorrowed(true);
                System.out.println("成功借阅");
                return;
            }
            if(name.equals(books.getBooks()[i].getName()) && books.getBooks()[i].getBorrowed() == true) {
                System.out.println("该书已被借出");
                return;
            }
        }
        System.out.println("对不起，没有找到该书。");
        return;
    }
}
