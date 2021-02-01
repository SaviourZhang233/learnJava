package operation;

import book.BookList;

import java.util.Scanner;

public class LookupOperation implements IOperation{

    @Override
    public void work(BookList books) {
        System.out.println("查找书籍（模糊查）");
        System.out.println("请输入要查找的书名或关键字：");
        Scanner scanner = new Scanner(System.in);
        String keyWord = scanner.nextLine();
        int flag = 0;
        for(int i = 0;i < books.getSize();i++){
            if(books.getBooks()[i].getName().contains(keyWord)){
                if(flag == 0){
                    System.out.println("查找到如下信息：");
                }
                System.out.println(books.getBooks()[i]);
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("未查找到任何书籍信息。");
        }else{
            System.out.println("查找完毕。");
        }
        return;
    }
}
