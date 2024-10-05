import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if(sl!=tl){
            return false;
        }
        HashMap<Character,Character> smap = new HashMap<>();
        HashMap<Character,Character> tmap = new HashMap<>();

        for(int i=0;i<sl;i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if((smap.containsKey(sc) && smap.get(sc)!=tc)||(tmap.containsKey(tc) && tmap.get(tc) != sc)){
                return false;
            }
            smap.put(sc,tc);
            tmap.put(tc,sc);
        }
        return true;
    }
}
