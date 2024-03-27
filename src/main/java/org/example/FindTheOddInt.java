package org.example;

import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {

    public int findTheOddInt(int[] a) {
        Map<Integer,Integer> countOfIntegers = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            countOfIntegers.put(a[i], countOfIntegers.getOrDefault(a[i],0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : countOfIntegers.entrySet()) {
              if(entry.getValue()%2 != 0) {
                  return entry.getKey();
              }
        }
        return 0;
    }

}
