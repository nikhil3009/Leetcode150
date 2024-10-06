import java.util.HashMap;

import javax.swing.tree.TreeNode;

public class ConstructBinaryTreefromInorderandPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n  = inorder.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        TreeNode root = build(map,postorder,0,postorder.length-1,inorder,0,inorder.length-1);
        return root;
    }
    public TreeNode build(HashMap<Integer,Integer> map,int[] postorder,int ps,int pe,int[] inorder,int is,int ie){
        if(ps>pe || is>ie){
            return null;
        }
        TreeNode node = new TreeNode(postorder[pe]);
        int index = map.get(node.val);
        int numLeft = index-is;
        node.left = build(map,postorder,ps,ps+numLeft-1,inorder,is,index-1);
        node.right = build(map,postorder,ps+numLeft,pe-1,inorder,index+1,ie);
        return node;
    }
}
