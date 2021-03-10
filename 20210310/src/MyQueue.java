import java.util.Stack;

// 请你仅使用两个栈实现先入先出队列。
// 队列应当支持一般队列支持的所有操作（push、pop、peek、empty）
public class MyQueue {
    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        A.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(A.empty() == true) {
            return 0;
        }
        while (A.size() > 1) {
            int tmp = A.pop();
            B.push(tmp);
        }
        int ret = A.pop();
        while (B.size() > 0) {
            int tmp = B.pop();
            A.push(tmp);
        }
        return ret;
    }

    /** Get the front element. */
    public int peek() {
        if(A.empty() == true) {
            return 0;
        }
        int tmp = 0;
        while (A.size() > 0) {
            tmp = A.pop();
            B.push(tmp);
        }
        while (B.size() > 0) {
            int tmp1 = B.pop();
            A.push(tmp1);
        }
        return tmp;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return A.empty();
    }

}
