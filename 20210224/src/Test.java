import java.lang.reflect.Field;

public class Test {


    //理解字符串不可变和final的区别
    //final如果修饰引用，是指引用的指向不可变
    //字符串不可变是指字符串的内容不可变
    public int a = 10;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        final Test t = new Test();
        Test t1 = new Test();
        //不可行，final的引用，引用的指向不可变
        //t = t1;
        //可以改变引用指向对象的内容
        t.a = 100;
        System.out.println(t.a);
        String str1 = "hello";
        str1 = str1 + "hi";
        System.out.println(str1);
        //进入String的源码，可以看见我们的String是借助于char[]类型实现的
        //字符串内容不可变但是可以通过特殊手段改变内容
        //这种特殊手段叫 自省 或者 反射
        //下面给出例子

        String string = "hello";
        //我们把类看成图纸，把类下面的对象看成根据图纸制造出来的零件
        //1.获取到String的类对象，类对象：站在更高到的角度把每一个类看成一个对象，可以理解为图纸对象
        //对应的操作为 String.class
        //2.根据String中的value这个属性名，在类对象中拿到对应的字段（仍然是图纸的一个部分）
        //对应的操作为 getDeclaredField("value")
        Field valueField = String.class.getDeclaredField("value");
        //3.让value这个private的成员也可以被访问到
        valueField.setAccessible(true);
        //4.根据得到的局部图纸把对象拆开，取出对应局部图纸的零件部分
        char[] value = (char[])valueField.get(string);
        //5.修改内容
        value[4] = 'a';
        //查看修改后的内容
        System.out.println(string);
    }
}
