//https://leetcode.com/problems/unique-paths/solutions/22958/math-solution-o-1-space
// this is combinations summ and there is no order to take steps.
//in order to reach the last position we need to take m-1+n-1 steps i.e m+n-2;
//formula is n!/(n-r)!.r!.
// here n = m+n-2, n-r = m+n-2-n-1 => (m-1)!. r can only be n-1 or m-1 not both.
public class UniquePaths {
    public int uniquePaths(int m, int n){
        if(m == 1 || n == 1){
            return 1;
        }
        m--;
        n--;
        if(m<n){
            int temp = m;
            m = n;
            n = temp;
        }
        long res = 1;
        for(int i=1;i<=n;i++){
            res = res*(m+i)/i;
        }
        return (int)res;

    }
}
