package kata2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Histogram implements Iterable<Integer>{
    
    private final Map<Integer,Integer> counts = new TreeMap<>();
    Histogram(int... values ) {
        for (int value : values) {
            counts.put(value, counts.getOrDefault(value, 0) +1);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return counts.keySet().iterator();
    }
    
    public int getCount(int value){
        return counts.get(value);
    }
    
    

}
