public class MaximumSumCircularSubarray {
    int maxi = nums[0];
        int mini = nums[0];
        int cmax = 0;
        int cmin  = 0;
        int total = 0;

        for(int i=0;i<nums.length;i++){
            cmax = Math.max(nums[i],cmax+nums[i]);
            cmin = Math.min(nums[i],cmin+nums[i]);
            maxi = Math.max(maxi,cmax);
            mini = Math.min(mini,cmin);
            total += nums[i];
        }
        return maxi>0 ? Math.max(maxi,total-mini) :maxi;
}
