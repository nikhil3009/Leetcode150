public class FirstandLastOccurenceofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int first = searchF(nums,target);
        if(first == -1){
            return new int[]{-1,-1};
        }
        int last = searchL(nums,target);
        return new int[]{first,last};
        
    }
    public int searchF(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                ans = mid;
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public int searchL(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                ans = mid;
                low = mid+1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}
