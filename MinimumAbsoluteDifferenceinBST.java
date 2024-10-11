public class MinimumAbsoluteDifferenceinBST {
    int mini = Integer.MAX_VALUE;
    Integer prev = null;
    public int getMinimumDifference(TreeNode root) {
        if(root == null){
            return mini;
        }
        getMinimumDifference(root.left);
        if(prev!=null){
            mini = Math.min(mini,root.val-prev);
        }
        prev = root.val;
        getMinimumDifference(root.right);
        return mini;
        
    }
}
