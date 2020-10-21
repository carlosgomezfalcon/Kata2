package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        Integer[] data = {1,2,3,3,8,1,7,8,2,3,-11,3,1,14,3};
    
        Histogram histo = new Histogram(data);
        
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }        
    }
}
