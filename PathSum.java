import javax.swing.tree.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return cal(root,targetSum,0);
    }
    public boolean cal(TreeNode root, int targetSum, int sum){
        if(root == null){
            return false;
        }
        sum+=root.val;
        if(root.left == null && root.right == null){
            return sum == targetSum;
        }

        return cal(root.left,targetSum,sum) || cal(root.right,targetSum,sum);
    }
}
