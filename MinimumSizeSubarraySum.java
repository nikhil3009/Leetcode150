public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        while(right<n){
            sum += nums[right];
            while(sum>=target){
                int cur = right-left+1;
                ans = Math.min(ans,cur);
                sum -=nums[left];
                left++;
            }
            right++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
    
}
