import java.util.LinkedList;
import java.util.Queue;

// 请你仅使用两个队列实现一个后入先出（LIFO）的栈，
// 并支持普通队列的全部四种操作（push、top、pop 和 empty）。
public class MyStack {
    Queue<Integer> A = new LinkedList<>();
    Queue<Integer> B = new LinkedList<>();

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        A.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(A.isEmpty() == true) {
            return 0;
        }
        while(A.size() > 1) {
            int tmp = A.poll();
            B.offer(tmp);
        }
        int ret = A.poll();
        Queue<Integer> tmp1 = A;
        A = B;
        B = tmp1;
        return ret;
    }

    /** Get the top element. */
    public int top() {
        if(A.isEmpty() == true) {
            return 0;
        }
        int tmp = 0;
        while(A.size() > 0) {
            tmp = A.poll();
            B.offer(tmp);
        }
        Queue<Integer> tmp1 = A;
        A = B;
        B = tmp1;
        return tmp;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return A.isEmpty();
    }
}
