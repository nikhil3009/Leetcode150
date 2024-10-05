public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int n = s.length();
        if(n == 0){
            return true;
        }

        int left = 0;
        int right=n-1;

        while(left<=right){
            char char1 = s.charAt(left);
            char char2 = s.charAt(right);
            if(!Character.isLetterOrDigit(char1)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(char2)){
                right--;
                continue;
            }
            if(Character.toLowerCase(char1) != Character.toLowerCase(char2)){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
    
}
