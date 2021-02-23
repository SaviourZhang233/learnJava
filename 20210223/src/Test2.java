public class Test2 {

    //理解字符串不可变和final的区别
    //final如果修饰引用，是指引用的指向不可变
    //字符串不可变是指字符串的内容不可变
    public int a = 10;

    public static void main(String[] args) {
        final Test2 t = new Test2();
        Test2 t1 = new Test2();
        //不可行，final的引用，引用的指向不可变
        //t = t1;
        //可以改变引用指向对象的内容
        t.a = 100;
        System.out.println(t.a);
        String str1 = "hello";
        str1 = str1 + "hi";
        System.out.println(str1);
    }
}
