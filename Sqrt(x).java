public class Sqrt(x) {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int low = 0;
        int high = x;
        int result = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            long square = (long) mid*mid;
            if(square == x){
                return mid;
            }
            else if(square <x){
                result = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return result;
    }
}
