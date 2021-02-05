public class Node {

    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }

    @Override
    public String toString() {
        return "[" + val + "]" + " ";
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

    //不带傀儡结点,根据下标插入,返回插入后的链表
    public Node insert(int val,int index){
        //判断下标的合法性
        if(index < 0 || index > this.length()){
            return null;
        }
        //头插
        if(index == 0){
            Node newNode = new Node(val);
            newNode.next = this;
            return newNode;
        }
        //中间插入和尾插
        Node pre = this;
        //找到被插入的位置的前一个节点
        for(int i = 0; i < index - 1; i++){
            pre = pre.next;
        }
        Node newNode = new Node(val);
        newNode.next = pre.next;
        pre.next = newNode;
        return this;
    }

    //不带傀儡结点的，根据值删除，删除最近的一个，返回的结果为删除后的链表
    public Node remove(int val){
        //被删除的节点是第一个结点
        if(this.val == val){
            return this.next;
        }
        Node pre = this;
        Node cur = pre.next;
        for(; cur != null; pre = pre.next,cur = cur.next){
            if(cur.val == val){
                pre.next = cur.next;
                return this;
            }
        }
        return this;
    }

    //不带傀儡节点的链表，根据下标删除，返回删除后的链表
    public Node delete(int index){
        //判断下标的合法性
        if(index < 0 || index > this.length() - 1){
            return this;
        }
        //删除第一个节点的情况
        if(index == 0){
            return this.next;
        }
        Node pre = this;
        Node cur = pre.next;
        for(int i = 1; i < index; i++){
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = cur.next;
        return this;
    }

    //通过遍历，打印每个节点的值
    public void print(){
        if(this == null){
            System.out.println("该链表为空");
            return;
        }
        for(Node cur = this; cur != null; cur = cur.next){
            System.out.print(cur);
        }
        System.out.println();
        return;
    }
}
