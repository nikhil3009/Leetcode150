public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode();
        ListNode right = new ListNode();

        ListNode ltail = left;
        ListNode rtail = right;
        ListNode cur = head;
        while(cur != null){
            if(cur.val<x){
                ltail.next = cur;
                ltail = ltail.next;
            }
            else{
                rtail.next = cur;
                rtail = rtail.next;
            }
            cur = cur.next;
        }
        ltail.next = right.next;
        rtail.next = null;;
        return left.next;
    }
}
