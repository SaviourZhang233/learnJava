import operation.*;

import java.util.Scanner;

public class NormalUser extends User{

    public NormalUser(String name) {
        super.setName(name);
        IOperation[] operations = {
                new BorrowOperation(), new RetOperation(),
                new LookupOperation(), new ShowOperation(),
                new ExitOperation()
        };
        super.setOperations(operations);
    }

    @Override
    public int menu() {
        System.out.println("-----------------------------");
        System.out.println("亲爱的 "+getName()+" 您好");
        System.out.println(" 欢迎使用傻蛋图书管理系统 ");
        System.out.println(" 1 借阅书籍   2 归还书籍 ");
        System.out.println(" 3 查找书籍   4 显示所有书籍信息");
        System.out.println(" 5 退出系统   ");
        System.out.println(" 请选择你要的操作 ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("-----------------------------");
        return choice;
    }
}
