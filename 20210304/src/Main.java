class Person {
    private String name;
    private  int age;
    private String sex;
    //默认构造函数
    public Person() {
        // 通过 this 调用自身的构造方法
        // 必须放在该方法体的第一行
        this("关羽", 25, "男");
    }
    //带有3个参数的构造函数 注意此时形参的命名和属性的命名一样
    public Person(String name,int age,String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void eat() {
        System.out.println(this.name+" 正在吃饭！");
    }
    public void show(){
        System.out.println("name: "+this.name+" age: "+this.age+" sex: "+this.sex);
        //在show方法当中，通过this引用来调用本类的eat方法
        this.eat();
    }
}
public class Main{
    public static void main(String[] args) {
        Person p1 = new Person();//调用不带参数的构造函数 如果程序没有提供会调用不带参数的构造函数
        p1.show();
        Person p2 = new Person("张飞",20,"男");//调用带有3个参数的构造函数
        p2.show();
    }
}

