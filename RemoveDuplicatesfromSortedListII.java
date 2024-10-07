public class RemoveDuplicatesfromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while(cur != null){
            if((cur.next != null && cur.next.next != null) && (cur.next.val == cur.next.next.val)){
                ListNode temp = cur.next.next;
                while((temp != null && temp.next != null) && (temp.val == temp.next.val)){
                    temp = temp.next;
                }
                cur.next = temp.next;
            }
            else{
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
