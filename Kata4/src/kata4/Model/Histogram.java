
package kata4.Model;

import java.util.HashMap;
import java.util.Set;

public class Histogram <T> {
    
    private final HashMap<T,Integer>  histogram  = new HashMap<> ();

    public Integer get(Object key) { return histogram.get(key); }

    public Set<T> keySet() {
        return histogram.keySet();
    }
    
    public void increment (T key){ histogram.put(key, histogram.containsKey(key)? histogram.get(key)+1:1); }
}