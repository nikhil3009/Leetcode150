import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        doit(root,ans,0);
        return ans;  
    }
    public void doit(TreeNode root,List<Integer> ans,int level){
        if(root == null){
            return;
        }
        if(ans.size() == level){
            ans.add(root.val);
        }
        doit(root.right,ans,level+1);
        doit(root.left,ans,level+1);
    }
}
