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

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public boolean getBorrowed() {
        return isBorrowed;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
