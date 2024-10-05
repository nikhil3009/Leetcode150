import java.util.ArrayList;
import java.util.List;
class Pair{
    int start;
    int end;
    Pair(int start, int end){
        this.start = start;
        this.end = end;
    }
}
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<Pair> res = new ArrayList<>();
        int i=0;
        while(i<n && intervals[i][1] < newInterval[0]){
            res.add(new Pair(intervals[i][0],intervals[i][1]));
            i++;
        }
        while(i<n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
           i++;
        }
        res.add(new Pair(newInterval[0],newInterval[1]));
        while(i<n){
            res.add(new Pair(intervals[i][0],intervals[i][1]));
            i++;
        }
        
        int j=0;
        int ans[][] = new int[res.size()][2];
        for(Pair p : res){
            ans[j][0] = p.start;
            ans[j][1] = p.end;
            j++;
        }
        return ans;
    }
}
