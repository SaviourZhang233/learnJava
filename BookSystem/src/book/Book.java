package book;

public class Book {

    //书名
    private String name;
    //作者
    private String author;
    //单价
    private double price = 0.0;
    //类别
    private String type;
    //是否借出
    private boolean isBorrowed = false;

    public Book(String name, String author, double price, String type, boolean isBorrowed) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
        this.isBorrowed = isBorrowed;
    }
}
