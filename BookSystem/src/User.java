import book.BookList;
import operation.IOperation;

abstract public class User {
    //姓名
    private String name;
    //可以进行的操作
    private IOperation[] operations;
    //操作菜单
    public abstract int menu();

    public void doOperation(int choice, BookList bookList){
        operations[choice - 1].work(bookList);
    }

    public String getName() {
        return name;
    }

    public IOperation[] getOperations() {
        return operations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOperations(IOperation[] operations) {
        this.operations = operations;
    }
}
