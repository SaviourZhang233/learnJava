package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation {

    @Override
    public void work(BookList books) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("添加书籍");
        System.out.println("请输入书名：");
        String name = scanner.next();
        System.out.println("请输入作者：");
        String author = scanner.next();
        System.out.println("请输入单价：");
        double price = scanner.nextDouble();
        System.out.println("请输入书籍类型：");
        String type = scanner.next();
        Book newBook = new Book(name,author,price,type,false);
        books.getBooks()[books.getSize()] = newBook;
        books.setSize(books.getSize() + 1);
        System.out.println("添加成功");
    }
}
