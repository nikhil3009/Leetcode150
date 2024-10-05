import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        int n = words.length;
        int m = pattern.length();
        if(n != m){
            return false;
        }
        HashMap<String,Character> w2c = new HashMap<>();
        HashMap<Character,String> c2w = new HashMap<>();

        for(int i=0;i<n;i++){
            String temp = words[i];
            char c = pattern.charAt(i);
            if((w2c.containsKey(temp) && w2c.get(temp) != c )||(c2w.containsKey(c) && ! c2w.get(c).equals(temp)  )){
                return false;
            }
            w2c.put(temp,c);
            c2w.put(c,temp);
        }
        return true;
        
    }
}
