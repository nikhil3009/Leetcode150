import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Pair{
    int start;
    int end;
    Pair(int start, int end){
        this.start = start;
        this.end = end;
    }
}
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        int j=0;
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<Pair> res=new ArrayList<>();
        while(j<n){
            if(intervals[j][0] <= end){
                end = Math.max(end,intervals[j][1]);
                j++;
            }
            else{
                res.add(new Pair(start,end));
                start = intervals[j][0];
                end = intervals[j][1];
                j++;
            }
        }
        res.add(new Pair(start,end));

        int ans[][] = new int[res.size()][2];
        int i=0;
        for(Pair p : res){
            ans[i][0] = p.start;
            ans[i][1] = p.end;
            i++;
        }
        return ans;
    }
}
