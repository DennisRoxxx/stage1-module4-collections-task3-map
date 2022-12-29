package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer> swapMap = new HashMap<>();
        for (Map.Entry<Integer, String> sw : sourceMap.entrySet()) {
            swapMap.put(sw.getValue(), sw.getKey());
        }
        return swapMap;
    }
}
