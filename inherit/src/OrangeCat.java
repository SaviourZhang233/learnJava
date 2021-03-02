//final代表这个类不能被别的类继承
public final class OrangeCat extends Cat{

    public String name3;

    public OrangeCat(){
        name3 = "橘猫";
    }

    //这是多次继承，橘猫->猫->动物
    //测试多次继承的 super 关键字
    public void fun3(){
        System.out.println("this.name3 = " + this.name);
        System.out.println("super.name3 = " + super.name);
        //System.out.println("super.super.name3 = " + super.super.name3);
    }

    public static void main(String[] args) {
        OrangeCat orangeCat = new OrangeCat();
        orangeCat.fun3();
    }


}
