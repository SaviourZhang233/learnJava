public class Animal {
    public String name;

    private String name1;

    public String name3;

    //若父类中只有含参构造方法，没有无参构造
    //那么子类也必须显式写构造方法
    //否则编译器不知道你要调用哪一个方法，传入什么参数
    public Animal(String name, String name1) {
        this.name = name;
        this.name1 = name1;
    }

    public Animal(String name){
        this.name = name;
    }

    //若父类没有构造方法或者父类中含有无参构造方法、
    //那么在子类中可以不用显式的写出构造方法，或者写一个无参构造但是方法体内没有任何东西
    //例如：子类中这样写构造方法
    //public Cat() { }
    //编译器会自己调用默认构造或者无参构造
    public Animal(){
        name = "花花";
        name1 = "黑黑";
        name3 = "动物";
    }

    public void eat(String food){
        System.out.println(name + food);
    }

}
