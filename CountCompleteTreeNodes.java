import javax.swing.tree.TreeNode;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        int count = countN(root);
        return count;
    }
    public int countN(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = countN(root.left);
        int right = countN(root.right);
        return left+right+1;
    }
}
