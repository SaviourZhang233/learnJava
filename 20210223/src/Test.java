public class Test {

    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        String d = new String("hello");
        //字符串 == 比较的是引用的地址相不相同
        //a 和 b 都是引用，指向内存中同一块区域，这个区域中存放的就是"hello"
        //这个"hello"在字符串常量池中
        //所以这个结果是true
        System.out.println(a == b);
        //c 和 d 也是引用，但是它的生成过程和a b 不同，它是先根据字符串常量池中的"hello"
        //复制生成两个 new String()，虽然这两个new String()中的内容是一样的
        //但是引用c 和 d 中的地址不同，所以下面结果是false
        System.out.println(c == d);
        //引用指向的字符串内容相同，是true
        System.out.println(c.equals(d));
        //上面的c 和 d 是新开辟了空间，比较低效
        //下面这种写法可以显式入池
        //这个方法是先new一个String的对象，在对这个对象调用intern方法
        //e得到的是intern方法的返回值
        //调用intern方法，会拿着字符串先在常量池中寻找，看当前内容是否在池中
        //若在，则返回池中地址
        //不在，则先将这个字符串入池，然后返回池中地址
        String e = new String("hi");
        //false
        System.out.println(e == "hi");
        e = e.intern();
        //上面这个引用执行完毕之后，没有引用指向new出来的String，所以被回收
        //true
        System.out.println(e == "hi");
    }
}
