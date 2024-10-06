import java.util.HashMap;

import javax.swing.tree.TreeNode;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n  = inorder.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        TreeNode root = build(map,preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        return root;
    }
    public TreeNode build(HashMap<Integer,Integer> map,int[] preorder,int ps,int pe,int[] inorder,int is,int ie){
        if(ps>pe || is>ie){
            return null;
        }
        TreeNode node = new TreeNode(preorder[ps]);
        int index = map.get(node.val);
        int numLeft = index-is;
        node.left = build(map,preorder,ps+1,ps+numLeft,inorder,is,index-1);
        node.right = build(map,preorder,ps+numLeft+1,pe,inorder,index+1,ie);
        return node;
    }
}
