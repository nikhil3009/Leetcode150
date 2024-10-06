import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class PopulatingNextRightPointersinEachNodeII {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node prev = null;
            int size = q.size();
            for(int i=0;i<size;i++){
                Node cur = q.poll();
                if(prev!=null){
                    prev.next = cur;
                }
                prev = cur;
                if(cur.left!=null){
                    q.offer(cur.left);
                }
                if(cur.right!=null){
                    q.offer(cur.right);
                }
            }
            prev.next = null;
        }
        
        return root;
    }
}
