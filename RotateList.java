public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        int len = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            len = len+1;
        }
        k = k%len;
        if( k ==0){
            return head;
        }
        temp.next = head;
        int tailLen = len-k;
        ListNode tail = head;
        for(int i=1;i<tailLen;i++){
            tail = tail.next;
        }
        head = tail.next;
        tail.next = null;
        return head;
        
    }
}
