import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
       int in[] = new int[numCourses];
       for(int i=0;i<numCourses;i++){
        adj.add(new ArrayList<>());
       } 
       for(int i=0;i<prerequisites.length;i++){
        adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
       }
       for(int i=0;i<numCourses;i++){
        for(int it:adj.get(i)){
            in[it]++;
        }
       }
       Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(in[i] == 0){
                q.add(i);
            }
        }
        int ans[] = new int[numCourses];
        int j=0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            ans[j++] = node;
            for(int it:adj.get(node)){
                in[it]--;
                if(in[it] == 0){
                    q.add(it);
                }
            }
        }
        if( j == numCourses){
            return ans;
        }
        int arr[] = {};
        return arr;
    }
}
