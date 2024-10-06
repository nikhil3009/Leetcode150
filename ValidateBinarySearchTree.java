import javax.swing.tree.TreeNode;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        return bst(root,min,max);
        
    }
    public boolean bst(TreeNode root,long min, long max){
        if(root == null){
            return true;
        }
        if(root.val <=min || root.val >=max){
            return false;
        }

        return bst(root.left,min,root.val) && bst(root.right,root.val,max);
    }
}
