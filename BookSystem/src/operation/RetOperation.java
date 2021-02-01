package operation;

import book.BookList;

import java.util.Scanner;

public class RetOperation implements IOperation{

    @Override
    public void work(BookList books) {
        System.out.println("归还书籍");
        System.out.println("请输入所要归还书籍的书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for(int i = 0;i < books.getSize();i++){
            if(name.equals(books.getBooks()[i].getName())){
                if(books.getBooks()[i].getBorrowed() == true){
                    books.getBooks()[i].setBorrowed(false);
                    System.out.println("归还成功。");
                }else{
                    System.out.println("该书未被借出。");
                }
                return;
            }
        }
        System.out.println("未找到该书，归还失败。");
        return;
    }
}
