public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums,new ArrayList<>(),ans);
        return ans;   
    }
    public void backtrack(int[] nums, List<Integer> temp,List<List<Integer>> ans){
        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(temp.contains(nums[i])){
                    continue;
                }
                temp.add(nums[i]);
                backtrack(nums,temp,ans);
                temp.remove(temp.size()-1);
            }
        }
        
    }
}
