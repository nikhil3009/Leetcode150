public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int res = 0;
        int dup = x;
        while(dup>0){
            int ld = dup%10;
            res =res*10+ld;
            dup = dup/10;
        }
        return res == x ? true:false;
        
    }
}
