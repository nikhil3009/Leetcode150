public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total = 0;
        int res = 0;
        int gsum = 0;
        int csum = 0;
        for(int i=0;i<n;i++){
            gsum += gas[i];
            csum += cost[i];
        }
        if(gsum<csum){
            return -1;
        }

        for(int i=0;i<n;i++){
            total +=gas[i] - cost[i];

            if(total<0){
                total = 0;
                res = i+1;
            }
        }
    return res;
        
    }
    
}
