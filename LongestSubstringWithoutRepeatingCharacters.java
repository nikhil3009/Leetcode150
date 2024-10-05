import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int res = 0;
        HashSet<Character> hs = new HashSet<>();
        for(int j=0;j<s.length();j++) {
            while(hs.contains(s.charAt(j))){
                hs.remove(s.charAt(i));
                i++;
            }
            hs.add(s.charAt(j));
            res = Math.max(res,j-i+1);
        }
        return res;
        
    }
    
}
