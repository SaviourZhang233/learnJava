class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "[" + val + "]";
    }
}


public class Solution {
    // 在一个排序的链表中，存在重复的结点，
    // 请删除该链表中重复的结点，重复的结点保留，返回链表头指针。
    // 例如，链表1->2->3->3->4->4->5 处理后为 1->2->3->4->5
    public static ListNode deleteDuplication1(ListNode pHead) {
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
        ListNode head = new ListNode(0);
        head.next = pHead;
        ListNode pre = head;
        ListNode cur = pHead;
        while (cur != null) {
            // 找到重复节点，现在判断重复节点到哪里结束
            if (cur.next != null && cur.val == cur.next.val) {
                ListNode end = cur.next;
                // 判断重复节点到哪里结束
                while (end != null && end.val == cur.val) {
                    end = end.next;
                }
                pre.next = end;
                cur = end;
                continue;
            }
            cur = cur.next;
            pre = pre.next;
        }
        return head.next;
    }

    // 判断链表的回文结构
    // 对于一个链表，请设计一个时间复杂度为O(n),
    // 额外空间复杂度为O(1)的算法，判断其是否为回文结构
    // 给定一个链表的头指针A，请返回一个bool值，代表其是否为回文结构。
    // 保证链表长度小于等于900。
    public boolean chkPalindrome(ListNode A) {
        if (A == null || A.next == null) {
            return true;
        }
        int length = length(A);
        int forward = (length / 2) - 1;
        ListNode pre = A;
        for (int i = 0; i < forward; i++) {
            pre = pre.next;
        }
        ListNode cur = pre.next;
        ListNode nex = cur.next;
        if (length % 2 == 0) {
            pre.next = null;
            pre = null;
        }else {
            pre.next = null;
            cur = nex;
            nex = nex.next;
        }
        ListNode trans = transposed(cur);
        return isSame(A, trans);
    }

    private boolean isSame(ListNode a, ListNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (length(a) != length(b)) {
            return false;
        }
        ListNode curA = a;
        ListNode curB = b;
        while (curA != null) {
            if (curA.val != curB.val) {
                return false;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return true;
    }

    private ListNode transposed(ListNode a) {
        if (a == null) {
            return null;
        }
        if (a.next == null) {
            return a;
        }
        ListNode cur = a;
        ListNode pre = null;
        ListNode nex = a.next;
        while (cur != null) {
            cur.next = pre;
            pre = cur;
            cur = nex;
            if (cur == null) {
                break;
            }
            nex = nex.next;
        }
        return pre;
    }

    private int length(ListNode a) {
        if (a == null) {
            return 0;
        }
        ListNode cur = a;
        int ret = 0;
        for (; cur != null; cur = cur.next) {
            ret++;
        }
        return ret;
    }

    // 编写一个程序，找到两个单链表相交的起始节点。
    // 创建两个指针 pApA 和 pBpB，分别初始化为链表 A 和 B 的头结点。然后让它们向后逐结点遍历。
    //当 pApA 到达链表的尾部时，将它重定位到链表 B 的头结点 (你没看错，就是链表 B); 类似的，当 pBpB 到达链表的尾部时，将它重定位到链表 A 的头结点。
    //若在某一时刻 pApA 和 pBpB 相遇，则 pApA/pBpB 为相交结点。
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null && headB == null) {
            return null;
        }
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA.next != null) {
            curA = curA.next;
        }
        while (curB.next != null) {
            curB = curB.next;
        }
        if (curA != curB) {
            return null;
        }
        curA = headA;
        curB = headB;
        while (curA != curB) {
            curA = curA.next;
            curB = curB.next;
            if (curA == null) {
                curA = headA;
            }
            if (curB == null) {
                curB = headB;
            }
        }
        return curA;
    }

    // 给定一个链表，判断链表中是否有环。
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (true) {
            // 改变指针指向这一句应该放在最前面
            // 否则刚进入循环的时候就是 fast == slow
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
            if (fast == null || fast.next == null) {
                break;
            }
        }
        return false;
    }

    // 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
    // 142. 环形链表 II
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        if (hasCycle(head) == false) {
            return null;
        }
        ListNode fast = head;
        ListNode show = head;
        while (true) {
            show = show.next;
            fast = fast.next.next;
            if (show == fast) {
                break;
            }
        }
        ListNode ret = head;
        while (ret != show) {
            ret = ret.next;
            show = show.next;
        }
        return ret;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(2);
        ListNode g = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        Solution solution = new Solution();
        System.out.println(solution.chkPalindrome(a));
    }
}
