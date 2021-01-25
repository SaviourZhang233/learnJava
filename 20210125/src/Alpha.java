import com.sun.javaws.security.AppContextUtil;

class Base {

    Base(String str) {

        System.out.print("Base");

    }

}

public class Alpha extends Base {

    public Alpha(String str){
        super(str);
        System.out.println("Alpha");
    }

    public static void main( String[] args ) {

        new Alpha("nihao");

        //调用父类无参的构造方法

        new Base("nihao");

    }

}