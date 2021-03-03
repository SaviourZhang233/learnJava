class Node {

    public int val;

    public Node next = null;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }

    @Override
    public String toString() {
        return " {" + val + "} ";
    }
}

// 四个有序链表合并为一个长的有序链表
public class Test {
    public static Node creatNode1() {
        Node node1 = new Node(3);
        Node node2 = new Node(7);
        Node node3 = new Node(9);
        Node node4 = new Node(17);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        return node1;
    }

    public static Node creatNode2() {
        Node node1 = new Node(2);
        Node node2 = new Node(5);
        Node node3 = new Node(10);
        Node node4 = new Node(19);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        return node1;
    }

    public static Node creatNode3() {
        Node node1 = new Node(1);
        Node node2 = new Node(9);
        Node node3 = new Node(14);
        node1.next = node2;
        node2.next = node3;
        return node1;
    }

    public static Node creatNode4() {
        Node node1 = new Node(4);
        Node node2 = new Node(7);
        Node node3 = new Node(16);
        Node node4 = new Node(20);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        return node1;
    }

    public static void main(String[] args) {
        Node l1 = creatNode1();
        Node l2 = creatNode2();
        Node l3 = creatNode3();
        Node l4 = creatNode4();

        Node newList = sortFourLinkedLists(l1,l2,l3,l4);
        printList(newList);
    }

    private static Node sortFourLinkedLists(Node l1, Node l2, Node l3, Node l4) {
        Node n1 = l1;
        Node n2 = l2;
        Node n3 = l3;
        Node n4 = l4;
        Node headNode = new Node(0);
        Node cur = headNode;
        Node smallestNode = null;
        do {
            smallestNode = findingSmallestNode(n1,n2,n3,n4);
            cur.next = smallestNode;
            if(smallestNode == null){
                break;
            }
            cur = cur.next;
            if(n1 == smallestNode){
                n1 = n1.next;
            }
            if(n2 == smallestNode){
                n2 = n2.next;
            }
            if(n3 == smallestNode){
                n3 = n3.next;
            }
            if(n4 == smallestNode){
                n4 = n4.next;
            }
        } while (smallestNode != null);
        return headNode.next;
    }

    private static Node findingSmallestNode(Node n1, Node n2, Node n3, Node n4) {

        Node retNode = new Node(99);
        if(n1 != null){
            retNode = retNode.val > n1.val ? n1 : retNode;
        }
        if(n2 != null){
            retNode = retNode.val > n2.val ? n2 : retNode;
        }
        if(n3 != null){
            retNode = retNode.val > n3.val ? n3 : retNode;
        }
        if(n4 != null){
            retNode = retNode.val > n4.val ? n4 : retNode;
        }
        if(n1 == null && n2 == null && n3 == null && n4 == null){
            return null;
        }
        return retNode;
    }

    public static void printList(Node list) {
        for(; list != null; list = list.next){
            System.out.print(list);
        }
    }

}
