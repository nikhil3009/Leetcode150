import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        int n = nums.length;
        ans[0] = ans[1] = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int more = target - nums[i];
            if(map.containsKey(more)){
                ans[0] = map.get(more);
                ans[1] = i;
                return ans;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}
