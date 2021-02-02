//自我实现链表
//和相关操作

public class Node {
    //保存节点的值
    public int val;
    //指向下一个节点的指针
    public Node next;

    public Node(int val){
        this.val = val;
        this.next = null;
    }

    @Override
    public String toString() {
        return "[" + val + "]";
    }

    //通过遍历，打印每个节点的值
    public void print(){
        if(this == null){
            System.out.println("该链表为空");
            return;
        }
        for(Node cur = this; cur != null; cur = cur.next){
            System.out.println(cur);
        }
        return;
    }

    //通过遍历，找到链表的最后一个节点
    public Node findLastNode(){
        if(this == null){
            System.out.println("该链表为空");
            return null;
        }
        Node cur = this;
        while (cur.next != null){
            cur = cur.next;
        }
        return cur;
    }

    //通过遍历找到链表的倒数第二个节点
    public Node findPenultimateNode(){
        if(this == null || this.next == null){
            System.out.println("该链表不存在倒数第二个节点");
            return null;
        }
        Node cur = this;
        for(; cur.next.next != null; cur = cur.next);
        return cur;
    }

    //求链表长度
    public int length(){
        Node cur = this;
        int length = 0;
        for(; cur != null; cur = cur.next){
            length++;
        }
        return length;
    }

    //找到链表的第n个节点
    public Node findNthNode(int n){
        if(n > this.length() || n <= 0){
            return null;
        }
        Node cur = this;
        for(int i = 1; i < n; cur = cur.next){
            i++;
        }
        return cur;
    }

    //找到链表中是否包含某个元素
    public boolean contains(int val){
        Node cur = this;
        for(; cur != null; cur = cur.next){
            if(cur.val == val){
                return true;
            }
        }
        return false;
    }

    //找到链表中倒数第n个节点
    //思路一：某个链表长度为10，找倒数第3个节点就是正数第8个节点
    //正数和倒数的关系为：正数 = 长度 + 1 - 倒数；
    public Node findLastNthNode1(int n){
        int length = this.length();
        if(n > length || n <= 0){
            return null;
        }
        int order = length + 1 - n;
        return this.findNthNode(order);
    }
    //思路二；两个指针，第一个指向第n个节点，第二个指向第1个节点
    //两个节点同时向后移动，当第一个指针到达链表末尾时，第二个指向的位置就是倒数第n个节点
    public Node findLastNthNode2(int n){
        int length = this.length();
        if(n > length || n <= 0){
            return null;
        }
        Node antecedentPoint = this.findNthNode(n);
        Node retPoint = this;
        for(; antecedentPoint.next != null; antecedentPoint = antecedentPoint.next){
            retPoint = retPoint.next;
        }
        return retPoint;
    }
    
}
