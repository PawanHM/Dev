package com.ds;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] a = {36, 19, 29, 12, 5, 5, 19, 13,39, 6, 5};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<a.length;i++){
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i])+1);
            } else {
                map.put(a[i], 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" == "+entry.getValue());
        }
    }

    public boolean equals(Object obj) {
        return (this == obj);
    }
}
