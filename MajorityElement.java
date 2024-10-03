public class MajorityElement {
    public int majorityElement(int[] nums) {
        int max = 0;
        int maj = -1;
        for(int i=0;i<nums.length;i++){
            if(max <= 0){
                maj = nums[i];
                max = 1;
            }
            else if(nums[i] == maj){
                max++; 
            }
            else{
                max--;
            }
        }
        max = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == maj){
                max++;
            }
        }

        return max>nums.length/2 ? maj : -1;
        
    }
    
}
