import java.util.HashMap;

public class RomantoInteger {
    public int romanToInt(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum = 0;

        for(int i=n-1;i>=0;i--){
            char c = s.charAt(i);
            int val = map.get(c);
            sum+=val;
            if(i>0 && val>map.get(s.charAt(i-1))){
                sum -= map.get(s.charAt(i-1));
                i--;
            }
        }
        return sum;
    }
    
}
