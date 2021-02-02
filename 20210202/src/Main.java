public class Main {

    public static Node createList(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        return node1;
    }

    public static void main(String[] args) {
        Node newNodeList = createList();
        //newNodeList.print();
        //Node lastNode = newNodeList.findLastNode();
        //System.out.println(lastNode);
        Node newNode = new Node(3);
        System.out.println(newNode.findPenultimateNode());
        System.out.println(newNodeList.findPenultimateNode());
        System.out.println(newNodeList.length());
//        Node nullNode = null;
//        System.out.println(nullNode.length());
        System.out.println(newNodeList.findNthNode(5));
        System.out.println(newNodeList.contains(6));
        System.out.println(newNodeList.contains(5));
        System.out.println(newNodeList.findLastNthNode1(3));
        System.out.println(newNodeList.findLastNthNode2(1));

    }
}
