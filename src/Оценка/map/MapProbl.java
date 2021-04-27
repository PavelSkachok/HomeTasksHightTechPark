package Оценка.map;

import java.util.*;

public class MapProbl {
   static  <K> Map<K,Integer> arrayToMap(K[] ks){
      Set<K> set=new HashSet<>(Arrays.asList(ks));
       int z=0;
      Integer[] kol=new Integer[set.size()];
       for (K s:set) {

           kol[z]=0;
           for (int j = 0; j < ks.length; j++) {
               if (s.equals(ks[j])){
                   kol[z]++;
               }
           }
           z++;
       }
        Map<K, Integer> map = new HashMap<>();
       int i=0;
        for (K s:set) {
            map.put(s,kol[i]);
            i++;
        }
        return map;
    }
}
