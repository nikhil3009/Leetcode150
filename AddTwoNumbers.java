public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0;
        while(temp1 != null || temp2 != null){
            int sum = carry;
            if(temp1 != null){
                sum+=temp1.val;
            }
            if(temp2 != null){
                sum+=temp2.val;
            }
            ListNode ne = new ListNode(sum%10);
            carry = sum/10;
            cur.next = ne;
            cur = cur.next;
            if(temp1 != null)
            {
                temp1 = temp1.next;
            }
            if(temp2 != null)
            {
                temp2 = temp2.next;
            }
        }
        if(carry == 1){
            ListNode ne = new ListNode(1);
            cur.next = ne;
        }
        return dummy.next;
    }
}
