import org.w3c.dom.Node;

public class CopyListwithRandomPointer {
    public Node copyRandomList(Node head) {
        Node temp = head;
        while(temp!=null){
            Node ne = new Node(temp.val);
            ne.next = temp.next;
            temp.next = ne;
            temp = temp.next.next;
        }
        Node temp1 = head;
        while(temp1 !=null){
            if(temp1.random != null){
                temp1.next.random = temp1.random.next;
            }
            temp1 = temp1.next.next;
        }
        Node dummy = new Node(-1);
        Node res = dummy;
        Node temp2 = head;
        while(temp2 !=null){
            res.next = temp2.next;
            temp2.next = res.next.next;
            temp2 = temp2.next;
            res = res.next;
        }
        return dummy.next;
    }
}
