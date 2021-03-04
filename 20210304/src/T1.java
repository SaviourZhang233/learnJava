public class T1 {

    public int a = retInt();

    {
        a = 1;
        b = 1;
        System.out.println("代码块初始化");
    }

    public int b = retInt();

    private int retInt() {
        System.out.println("就地初始化");
        return 1;
    }

    public T1() {
        a = 1;
        b = 1;
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        T1 t1 = new T1();
    }
}
