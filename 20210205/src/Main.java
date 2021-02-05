public class Main {

    public static Node createList(){
        Node node0 = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        return node0;
    }

    //将一个数组转化为一个不带傀儡节点的链表
    public static Node arrayToLinkedList(int[] array){
        //傀儡节点，方便处理
        Node head = new Node(0);
        Node tail = head;
        for (int x:array) {
            tail.next = new Node(x);
            tail = tail.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        Node list = createList();
        list.print();
//        System.out.println();
//        //list.insert(6,4).print();
//        System.out.println();
//        list.insert(2,5).print();
//        //list.insert(0,0).print();
        //list.remove(0).print();
        //list.remove(4).print();
        //list.remove(7).print();
//        int[] a = {1,2,3,4,5,6,7};
//        int[] a = {};
//        Node newList = arrayToLinkedList(a);
//        if(newList == null){
//            System.out.println("空链表");
//        }
        //newList.print();
        //list.delete(0).print();
        //list.delete(4).print();
        list.delete(2).print();
    }

}
