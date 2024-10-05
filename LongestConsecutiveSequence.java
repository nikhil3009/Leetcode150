import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int ans= 1;
        HashSet<Integer> st = new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }

        for(int it:st){
            if(!st.contains(it-1)){
                int start = it;
                int count = 1;
                while(st.contains(start+1)){
                    start = start+1;
                    count = count+1;
                }
                ans = Math.max(ans,count);
            }
        }
        return ans;
    }
}
