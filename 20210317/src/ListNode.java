public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "[" + val + "]";
    }

    public static void main(String[] args) {
        ListNode g = new ListNode(6);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(8);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(1);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(4);
        g.next = a;
        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = f;
        ListNode ret = Solution.partition(g, 9);
        for (; ret != null; ret = ret.next) {
            System.out.println(ret);
        }
    }
}


class Solution {
    // 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
    //如果有两个中间结点，则返回第二个中间结点。
    // 快慢指针做法
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast == null || fast.next == null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // 输入一个链表，输出该链表中倒数第k个结点。
    // 双指针做法
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k == 0) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k - 1; i++) {
            fast = fast.next;
            if (fast == null) {
                break;
            }
        }
        if (fast == null) {
            return null;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    // 将两个升序链表合并为一个新的 升序 链表并返回。
    // 新链表是通过拼接给定的两个链表的所有节点组成的
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode ret = new ListNode(0);
        ListNode cur = ret;
        while (!(cur1 == null || cur2 == null)) {
            if (cur1.val > cur2.val) {
                cur.next = cur2;
                cur2 = cur2.next;
            } else {
                cur.next = cur1;
                cur1 = cur1.next;
            }
            cur = cur.next;
        }
        if (cur1 == null) {
            cur.next = cur2;
        }else {
            cur.next = cur1;
        }
        return ret.next;
    }

    // 现有一链表的头指针 ListNode pHead，给一定值x，
    // 编写一段代码将所有小于x的结点排在其余结点之前
    // 且不能改变原来的数据顺序，返回重新排列后的链表的头指针。
    public static ListNode partition(ListNode pHead, int x) {
       if (pHead == null) {
           return null;
       }
       if (pHead.next == null) {
           return pHead;
       }
       ListNode newHead = new ListNode(0);
       newHead.next = pHead;
       ListNode pre = newHead;
       ListNode cur = pHead;
       ListNode ret = new ListNode(0);
       ListNode newCur = ret;
       while (cur != null) {
           if (cur.val < x) {
               ListNode tmp = cur;
               pre.next = cur.next;
               cur = cur.next;
               newCur.next = tmp;
               newCur = newCur.next;
               continue;
           }
           cur = cur.next;
           pre = pre.next;
       }
       newCur.next = newHead.next;
       return ret.next;
    }

    // 在一个排序的链表中，存在重复的结点，
    // 请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    // 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        if (pHead.next == null) {
            return pHead;
        }
        ListNode pre = pHead;
        ListNode cur = pre.next;
        while (cur != null) {
            if (cur.val == pre.val) {
                pre.next = cur.next;
                cur = cur.next;
                continue;
            }
            cur = cur.next;
            pre = pre.next;
        }
        return pHead;
    }

}
