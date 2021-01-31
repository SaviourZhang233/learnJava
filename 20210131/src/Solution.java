public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode retList = new ListNode(0);
        ListNode listNode = null;
        listNode = retList;
        while(list1 != null || list2 != null){
            if(list1.val < list2.val){
                retList.next = list1;
                list1 = list1.next;
                retList = retList.next;
            }
            else {
                retList.next = list2;
                list2 = list2.next;
                retList = retList.next;
            }
        }
        if(list2 == null){
            retList.next = list1;
        }
        if(list1 == null){
            retList.next = list2;
        }
        return listNode.next;
    }

    public static void main(String[] args) {

    }
}