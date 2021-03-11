public class MyCircularDeque {

    private int[] ints = null;
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    // 构造函数,双端队列的大小为k
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        ints = new int[k];
    }

    // 将一个元素添加到双端队列头部。 如果操作成功返回 true
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(size == ints.length) {
            return false;
        }
        ints[head] = value;
        head++;
        head = head % ints.length;
        size++;
        return true;
    }

    // 将一个元素添加到双端队列尾部。如果操作成功返回 true
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(size == ints.length) {
            return false;
        }
        tail--;
        if(tail < 0) {
            tail = ints.length + tail;
        }
        ints[tail] = value;
        size++;
        return true;
    }
    // 从双端队列头部删除一个元素。 如果操作成功返回 true
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(size == 0) {
            return false;
        }
        head--;
        if(head < 0) {
            head = ints.length + head;
        }
        size--;
        return true;
    }

    // 从双端队列尾部删除一个元素。如果操作成功返回 true
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(size == 0) {
            return false;
        }
        tail++;
        tail = tail % ints.length;
        size--;
        return true;
    }

    // 从双端队列头部获得一个元素。如果双端队列为空，返回 -1
    /** Get the front item from the deque. */
    public int getFront() {
        if(size == 0) {
            return -1;
        }
        if(head - 1 < 0) {
            return ints[ints.length - 1];
        }
        return ints[head - 1];
    }

    // 获得双端队列的最后一个元素。 如果双端队列为空，返回 -1
    /** Get the last item from the deque. */
    public int getRear() {
        if(size == 0) {
            return -1;
        }
        return ints[tail];
    }

    // 检查双端队列是否为空
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        return false;
    }

    // 检查双端队列是否满了
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if(size == ints.length) {
            return true;
        }
        return false;
    }
}
