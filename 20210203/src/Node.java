//链表
//各种方法

public class Node {
    public int val;
    public Node next;

    public Node(int val){
        this.val = val;
        this.next = null;
    }

    @Override
    public String toString() {
        return "[" + val + "]" + " ";
    }

    //带傀儡节点的链表打印每一个元素
    public void printWithDummy(){
        if(this.next == null){
            return;
        }
        Node cur = this.next;
        for(; cur != null; cur = cur.next){
            System.out.print(cur);
        }
        return;
    }

    //求链表长度，不带傀儡节点
    public int length(){
        Node cur = this;
        int length = 0;
        for(; cur != null; cur = cur.next){
            length++;
        }
        return length;
    }

    //求链表长度，带傀儡节点
    public int lengthWithDummy(){
        Node cur = this.next;
        int length = 0;
        for(; cur != null; cur = cur.next){
            length++;
        }
        return length;
    }

    //插入，不带头结点



    //不带傀儡节点，插入
}



