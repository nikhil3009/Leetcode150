public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,ans,new ArrayList<Integer>(),0,target);
        return ans;
    }

    public void backtrack(int[] candidates,List<List<Integer>> ans,List<Integer> temp, int start,int remain){
        if(remain<0){
            return;
        }
        else if(remain == 0){
            ans.add(new ArrayList<>(temp));
        }else{
            for(int i=start;i<candidates.length;i++){
                temp.add(candidates[i]);
                backtrack(candidates,ans,temp,i,remain-candidates[i]);
                temp.remove(temp.size()-1);
            }
        }
    }
}
