import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class InsertDeleteGetRandom {
    private ArrayList<Integer> li;
    private HashMap<Integer,Integer> map;

    public InsertDeleteGetRandom() {
        li = new ArrayList<>();
        map = new HashMap<>();
        
    }

    public boolean search(int val){
        return map.containsKey(val);
    }
    
    public boolean insert(int val) {
        if(search(val)){
            return false;
        }
        li.add(val);
        map.put(val,li.size()-1);
        return true;
        
    }
    
    public boolean remove(int val) {

        if(!search(val)){
            return false;
        }
        int index = map.get(val);
        li.set(index,li.get(li.size()-1));
        map.put(li.get(index),index);
        li.remove(li.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {

        Random r = new Random();
        return li.get(r.nextInt(li.size()));
        
    }
}
