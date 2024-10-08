public class Combinations {
    List<List<Integer>> ans;
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        backtrack(1,new ArrayList<Integer>(),n,k);
        return ans;
    }
    public void backtrack(int start, List<Integer> comb, int n, int k){
        if(comb.size() == k){
            ans.add(new ArrayList<>(comb));
            return;
        }
        for(int i=start;i<=n;i++){
            comb.add(i);
            backtrack(i+1,comb,n,k);
            comb.remove((Integer)i);
        }
    }
}
