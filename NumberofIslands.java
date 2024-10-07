import java.util.LinkedList;
import java.util.Queue;

public class NumberofIslands {
    class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public void bfs(int row, int col,int vis[][],char[][] grid){
        vis[row][col] = 1;
        Queue<Pair> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        q.add(new Pair(row,col));
        int dx[] = {0,0,1,-1};
        int dy[] = {-1,1,0,0};
        while(!q.isEmpty()){
            int crow = q.peek().first;
            int ccol = q.peek().second;
            q.remove();
            for(int i=0;i<4;i++){
                int nrow = crow+dx[i];
                int ncol = ccol + dy[i];
                if(nrow>=0 && nrow<n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1')           {
                    q.add(new Pair(nrow,ncol));
                    vis[nrow][ncol] = 1;
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m  = grid[0].length;
        int vis[][] = new int[n][m];
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1' && vis[i][j] == 0){
                    count++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return count;
    }
}
