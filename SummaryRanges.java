import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        int p = 0;
        for(int i=1;i<=n;i++){
            if(i == n || nums[i] !=nums[i-1]+1){
                if(p == i-1){
                    ans.add(String.valueOf(nums[p]));
                }
                else{
                    ans.add(nums[p] + "->" + nums[i-1]);
                }
                p = i;
            }
        }
        return ans;
    }
    
}
