import java.util.*;
public class  HappyNumber {
    public boolean isHappy(int n) {
        if(n == 1 || n == -1){
            return true;
        }
        HashSet<Integer> st = new HashSet<>();
        while(!st.contains(n)){
            st.add(n);
            n = sumOfSquares(n);
            if(n == 1){
                return true;
            }
        }
        return false;
    }

    public int sumOfSquares(int num){
        int output = 0;
        while(num != 0){
            int digit = num%10;
            digit = digit*digit;
            output+=digit;
            num = num/10;
        }
        return output;
    }
    
}
