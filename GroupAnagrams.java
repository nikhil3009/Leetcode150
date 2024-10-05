import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char temp[] = s.toCharArray();
            Arrays.sort(temp);
            String c = new String(temp);
            if(!map.containsKey(c)){
                map.put(c,new ArrayList<>());
            }
            map.get(c).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
