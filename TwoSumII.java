public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;
        int i=0;
        int j = n-1;
        int sum = 0;
        int ans[] = new int[2];
        while(i<j){
            sum = numbers[i] + numbers[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            else{
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            }

        }
    return ans;

        
    }
    
}
