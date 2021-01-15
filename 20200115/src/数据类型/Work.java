package 数据类型;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Scanner;

public class Work {
    //完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，
    // 还是等于随机生成的数字，等于的时候退出程序。
    public static void guessNum(){
        Random random = new Random();
        Scanner scanner=new Scanner(System.in);
        int guessNum=random.nextInt(99)+1;
        while(true){
            System.out.println("请输入一个数");
            int num=scanner.nextInt();
            if(num<guessNum){
                System.out.println("低了");
            }
            else if(num>guessNum){
                System.out.println("高了");
            }
            else {
                System.out.println("猜对了");
                break;
            }
        }
    }

    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
    public static double func1(){
        double ret = 0;
        double tmp = -1;
        for(int i = 1 ;i <= 100;i++){
            tmp *= (-1);
            ret += 1/(tmp*i);
        }
        return ret;
    }

    //求两个正整数的最大公约数
    public static int greatestCommonDivisor(int a,int b){
        int ret = a<b?a:b;
        for(;ret>=1;ret--){
            if(a%ret==0&&b%ret==0){
                break;
            }
        }
        return ret;
    }

    //编写代码模拟三次密码输入的场景。
    // 最多能输入三次密码，密码正确，提示“登录成功”,密码错误，
    // 可以重新输 入，最多输入三次。三次均错，则提示退出程序
    public static void simulatedLanding(String user,String pass){//两个变量为用户名和密码
        Scanner scanner=new Scanner(System.in);
        int i=0;
        for(i=0;i<3;i++){
            System.out.println("请输入用户名");
            String u=scanner.next();
            System.out.println("请输入密码");
            String p=scanner.next();
            if(user.equals(u)==true&&pass.equals(p)==true){
                break;
            }
            else {
                System.out.println("用户名或密码不正确");
            }
        }
        if(i==3){
            System.out.println("登录次数太多，登录失败");
        }
        else {
            System.out.println("登陆成功");
        }
    }

    //输出n*n的乘法口诀表，n由用户输入。
    public static void printMulFormulaTable(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个数");
        int line=scanner.nextInt();
        for(int i=1;i<=line;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"  ");
            }
            System.out.println();
        }
    }

    //求一个整数，在内存当中存储时，二进制1的个数。
    public static int func2(int a){
        int b=1;
        int ret=0;
        for(int i=0;i<31;i++){
            if((a&b)!=0){
                ret++;
            }
            b<<=1;
        }
        return ret;
    }

    //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
    public static void func4(int a){//递归写法
        if(a<10&&a>0){
            System.out.println(a);
        }
        else{
           func4(a/10);
           System.out.println(a%10);
        }
    }

    public static void func5(int a){//非递归
        int b=a;
        int[] c=new int[100];
        int i=0;
        while(b>0){
            c[i]=b%10;
            b/=10;
            i++;
        }
        i--;
        for(int j=i;j>=0;j--){
            System.out.println(c[j]);
        }
    }

    public static void main(String[] args) {
        //guessNum();
        //System.out.println(func1());
        //System.out.println(greatestCommonDivisor(124,12));
        //("zhangsan","123456");
        //printMulFormulaTable();
        //System.out.println(func2(14754));
        func4(1234);
        //func5(1234);
    }
}
