//public class Test {
//    Test(){
//        System.out.println("测试");
//    }
//
//    public static void main(String[] args) {
//        Test test1 = new Test();
//        Test test2 = new A();
//        Test test3 = new B();
//    }
//}
//
//class A extends Test{
//
//}
//
//class B extends A {
//
//}


//static class B {
//    public int Func() {
//        System.out.print("B");
//        return 0;
//    }
//}
//static class D extends B {
//    @Override
//    public int Func() {
//        System.out.print("D");
//        return 0;
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        B a = new B();
//        B b = new D();
//        a.Func();
//        b.Func();
//    }
//}

public class Test {
    private float f = 1.0f;
    int m = 12;
    static int n = 1;
    public static void main (String args[]) {
        Test t = new Test();
        System.out.println(t.f);
        //this.n;
        //Test.m;
        //Test.f;
    }
}