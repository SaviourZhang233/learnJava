package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{

    @Override
    public void work(BookList books) {
        System.out.println("删除书籍");
        System.out.println("请输入所要删除的书籍的书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for(int i = 0;i < books.getSize();i++){
            if(name.equals(books.getBooks()[i].getName())){
                if(i == books.getSize() - 1){

                }else{
                    books.getBooks()[i] = books.getBooks()[books.getSize() - 1];
                }
                books.setSize(books.getSize() - 1);
                System.out.println("成功删除");
                return;
            }
        }
        System.out.println("未找到该书籍");
        return;
    }
}
