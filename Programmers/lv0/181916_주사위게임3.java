import java.util.*;

class Solution {
    
    public int solution(int a, int b, int c, int d) {
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        treeMap.put(a,treeMap.getOrDefault(a,0) + 1);
        treeMap.put(b,treeMap.getOrDefault(b,0) + 1);
        treeMap.put(c,treeMap.getOrDefault(c,0) + 1);
        treeMap.put(d,treeMap.getOrDefault(d,0) + 1);
        
        
        if(treeMap.size() == 1) { // p p p p
            int p = treeMap.firstKey();
            return 1111 * p;
        }
        
        if(treeMap.size() == 2) { //p p q q || p p p q
            int n = treeMap.get(treeMap.firstKey());
            if(n == 2) { // p p q q
                int p = treeMap.firstKey();
              treeMap.pollFirstEntry();
                int q = treeMap.firstKey();
                return (p + q) * Math.abs(p-q);
            } else if(n == 3) { // p p p q
                int p = treeMap.firstKey();
               treeMap.pollFirstEntry();
                int q = treeMap.firstKey();
                return (10 * p + q) * (10 * p + q);
            } else if(n == 1) {
                int q = treeMap.firstKey();
               treeMap.pollFirstEntry();
                int p = treeMap.firstKey();
                return (10 * p + q) * (10 * p + q);
            }
        }
        
        if(treeMap.size() == 3) { // p p q r
            int duple = 0;
            for(int i : treeMap.keySet()) {
                if (treeMap.get(i) == 2) {
                    duple = i;
                }    
            }
            treeMap.remove(duple);
            int q = treeMap.firstKey();
            treeMap.pollFirstEntry();
            int r = treeMap.firstKey();
            return q * r;
        }
        
        if(treeMap.size() == 4) { // 모두 다른 경우
            int min = Integer.MAX_VALUE;
            for(Integer p : treeMap.keySet()) {
                min = Math.min(min,p);
            }
            return min;
        }
        return -1;
    }
}
