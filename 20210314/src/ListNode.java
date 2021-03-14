public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "[" + val + "]" ;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        System.out.println(Solution.length(a));
        System.out.println(Solution.findKthNode(a, 3));
    }
}

class Solution {

    // 都不带头结点
    // 给你一个链表的头节点 head 和一个整数 val
    // 请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return null;
        }
        // 先处理后面的节点，在处理头结点
        ListNode pre = head;
        ListNode cur = head.next;
//        if(cur != null) {
//            while (cur.val == val) {
//                pre.next = cur.next;
//                cur = cur.next;
//            }
//            pre = pre.next;
//            cur = cur.next;
//        }
        while (cur != null) {
            if(cur.val == val) {
                // 删除
                pre.next = cur.next;
                cur = cur.next;
                continue;
            }
            pre = pre.next;
            cur = cur.next;
        }
        if(head.val == val) {
            return head.next;
        }
        return head;
    }

    // 反转一个单链表
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode nex = head.next;
        while (nex != null) {
            cur.next = pre;
            pre = cur;
            cur = nex;
            nex = nex.next;
        }
        cur.next = pre;
        return cur;
    }

    // 求链表长度
    public static int length(ListNode head) {
        if(head == null) {
            return 0;
        }
        ListNode cur = head;
        int length = 0;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        return length;
    }

    // 寻找第 k 个节点
    public static ListNode findKthNode(ListNode head, int k) {
        if(head == null) {
            return null;
        }
        ListNode ret = head;
        for(int i = 0; i < k - 1; i++) {
            ret = ret.next;
        }
        return ret;
    }

    // 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
    //如果有两个中间结点，则返回第二个中间结点。
    public ListNode middleNode1(ListNode head) {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return head;
        }
        int length = length(head);
        ListNode midNode = findKthNode(head, length / 2);
        return midNode;
    }

    // 快慢指针做法
    public ListNode middleNode(ListNode head) {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return head;
        }
        ListNode show = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next == null) {
            show = show.next;
            fast = fast.next.next;
        }
        ListNode newList = null;
        if(fast.next == null) {
            newList = new ListNode(show.val);
        }
        newList = new ListNode(show.val);
        newList.next = new ListNode(show.next.val);
        return newList;
    }
}
