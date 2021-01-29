import book.Book;
import book.BookList;

import java.util.Scanner;

public class Main {

    public static int menu(){
        System.out.println("欢迎使用傻蛋图书管理系统");
        System.out.println("请选择你的角色");
        System.out.println("1 管理员    2 用户    ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
//        System.out.println("请输入您的名字");
//        String name = scanner.next();
        return choice;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        User user = null;
//        Book[] books ={
//                new Book("海贼王","尾田荣一郎",135.99,"少年热血漫画",false),
//                new Book("火影忍者","岸本齐史",120.80,"少年热血漫画",false),
//                new Book("龙珠","鸟山明",169.90,"少年热血漫画",false)
//        };
        BookList bookList = new BookList();
        while (true){
            int userChoice = menu();
            System.out.println("请输入您的名字");
            String name = scanner.next();
            int operationChoice = 0;
            if(userChoice == 1){
                user = new Admin(name);
                while (true){
                    operationChoice =  user.menu();
                    user.doOperation(operationChoice,bookList);
                }
            }else if(userChoice == 2){
                user = new NormalUser(name);
                while (true){
                    operationChoice = user.menu();
                    user.doOperation(operationChoice,bookList);
                }
            }else {
                System.out.println("您的输入有误，请重新输入");
            }
        }

    }

}
