//public class Test {
//
//    public static void main(String[] args) {
//
//        //当try区段的程序发生异常且被catch捕捉到时，才会执行catch区段的程序
//        //不管有没有捕捉到异常，都会执行finally部分
////        System.out.println("1");
////        try{
////            System.out.println("2");
////        }catch (Exception e){
////            System.out.println("3");
////        }
////        finally{
////            System.out.println("4");
////        }
//    }
//
//}

public class Test {

    private static void testMethod(){

        System.out.println("testMethod");

    }

    public static void main(String[] args) {

        ((Test)null).testMethod();

    }
}
