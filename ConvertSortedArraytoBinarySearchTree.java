public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;

        return createBST(nums, 0,n-1);
    }
    public TreeNode createBST(int nums[], int le, int ri){
        if(le>ri){
            return null;
        }
        
        int mid = le+(ri-le)/2;
        TreeNode root= new TreeNode(nums[mid]);
        root.left = createBST(nums,le,mid-1);
        root.right = createBST(nums,mid+1,ri);
        return root;
    }
}
