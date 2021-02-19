import T.Test;

public class Test2 {

    public int a = 0;

    public double b = 0.0;

//    //成员内部类
//    class T1{
//        public int i;
//    }

//    //静态内部类 == 成员内部类 + static
//    static class T2{
//        public int i;
//    }

    public void fun(){
        System.out.println("哈哈哈");
    }

    public void fun1(){
        System.out.println(a);
    }

    public static void main(String[] args) {

        //成员内部类依赖外部类的对象，因为他是一个外部类的一个成员，在外部的static方法中不能直接实例化
        //T1 t = new T();

        //这样也是不行的，没办法new T1();
        //Test2 test2 = new Test2();
        //new T1();

        //静态内部类
        //静态内部类类似于类属性，可以直接初始化
        //T2 t2 = new T2();

        //匿名内部类
        //定义在方法或者代码块里
        //这个类没有名字，是Test2类的一个子类，继承于Test2
        Test2 test2 = new Test2() {
            //可以重写方法
            @Override
            public void fun(){
                System.out.println("呵呵呵");
            }
            //也可以添加属性，但是这个属性想在外部访问的时涉及向下转型
            //在外部访问的时候是通过指向父类的引用访问的
            //就不可以向下转型，因为向下转型需要子类引用（但是子类的名字不知道）
            //所以在外部访问没有太大意义
            //但是可以在这个类的内部访问这个属性
            public int c = 1;
            //在类内部访问该属性
            @Override
            public void fun1(){
                System.out.println(c);
            }
        };
        System.out.println(test2.a);

        //直接外部访问不可行
        //System.out.println(test2.c);
        //调用方法在类内部访问该属性，输出 1
        test2.fun1();
        //调用重写后的方法，输出 呵呵呵
        test2.fun();

        //局部内部类 定义到方法内部作为局部变量
        class T3{
            //属性，方法等
            public int a = 10;
            public void fun(){
                System.out.println("hahaha");
            }
        }
        T3 t3 = new T3();
        t3.fun();
        System.out.println(t3.a);

        Test test = new Test();
        //在权限外访问
        //私有属性，报错
        //System.out.println(test.b);
        //保护属性，报错
        //System.out.println(test.c);
        //默认属性，报错
        //System.out.println(test.d);
    }

}
