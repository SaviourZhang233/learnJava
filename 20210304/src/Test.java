class Cat {

    public String name;// 名称

    public String gander;// 公母

    // 静态属性
    public static int number ;// 猫咪的数量

    // 静态方法
    public static void showNumber() {// 显示猫咪的数量
        System.out.println("此时猫咪的总数为 " + number);
    }

    // 静态代码块
    static {
        number = 100;// 猫咪的数量为100
        System.out.println("静态代码块");
    }

    // 含有两个参数的构造方法
    public Cat(String n, String g) {
        name = n;
        gander = g;
    }

}

public class Test {
    public static void main(String[] args) {
        // 调用静态方法或者属性，注意这里没有实例化对象
        Cat.showNumber();
        Cat.showNumber();
    }
}
