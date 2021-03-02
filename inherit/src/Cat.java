public class Cat extends Animal{

    public String name2;

    public String name3;


    //创建子类实例的时候是先创建父类实例，再创建子类实例
    //而且我们要求，如果子类构造方法需要你显式调用
    //父类的构造方法必须在第一行，否则报错

    //可以根据super关键字调用父类构造方法
    //根据super后括号内的内容调用不同的构造方法
    //这里是方法重载的知识
    public Cat(String name,String name1,String name2){
        //这个就不行，父类构造必须在第一行，规定
        //System.out.println("子类构造");
        super(name);
    }

    public Cat(){
        name2 = "呱呱";
        name3 = "猫";
    }

    public void fun(){
        System.out.println(name);

        //'name1' has private access in 'Animal'
        //System.out.println(name1);
        //也不可以用 super 调用 private 属性和方法
        //System.out.println(super.name1);
    }

    //在继承中，this 和 super
    //如果子类的属性是通过父类继承来的，那么 this.属性 和 super.属性 是一个东西
    //如果此时修改一个，另一个也会改变
    //如果某个属性是子类新添加的，
    //那么,通过 super 不能访问到
    //如果新添加的属性和父类中的属性重名，
    //那么，this 和 super 访问的是两个不同的属性
    //修改一个不影响另外一个
    public void fun1(){
        System.out.println("name 为父子类中公用的属性");
        System.out.println("this.name = " + this.name);
        System.out.println("super.name = " + super.name);
        System.out.println("改变公用属性 name 为 花大姐");
        this.name = "花大姐";
        System.out.println("this.name = " + this.name);
        System.out.println("super.name = " + super.name);
        System.out.println("name2 为子类中新添加的属性");
        System.out.println("this.name2 = " + this.name2);
        //用 super 访问子类中新添加的属性，直接报错
        //System.out.println(super.name2);
        System.out.println("name3 为父子类中重名的属性，但是实际上不同");
        //可见它们只是重名，实际上是不同的两个属性
        System.out.println("this.name3 = " + this.name3);
        System.out.println("super.name3 = " + super.name);
        System.out.println("改变子类父类中重名的属性");
        this.name3 = "妙蛙种子";
        System.out.println("this.name3 = " + this.name3);
        System.out.println("super.name3 = " + super.name);

    }


    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
        cat.fun1();
    }

}
