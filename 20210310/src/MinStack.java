import java.util.Stack;

// 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
public class MinStack {

    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        A.push(x);
        if(B.isEmpty() == true) {
            B.push(x);
            return;
        }
        int min = B.peek();
        if(x < min) {
            min = x;
        }
        B.push(min);
    }

    public void pop() {
        if(A.isEmpty() == true) {
            return;
        }
        A.pop();
        B.pop();
    }

    public int top() {
        if(A.isEmpty() == true) {
            return 0;
        }
        return A.peek();
    }

    public int getMin() {
        if(B.isEmpty() == true) {
            return 0;
        }
        return B.peek();
    }
}
