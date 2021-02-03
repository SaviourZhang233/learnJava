public class Main {

    //构造一个带傀儡节点的链表
    public static Node createListWithDummy(){
        Node dummy = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        dummy.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        return dummy;
    }

    public static void main(String[] args) {
         Node dummy = createListWithDummy();
//         dummy.printWithDummy();
        System.out.println(dummy.lengthWithDummy());

        Node node = new Node(1);
        System.out.println(node.lengthWithDummy());
    }
}
