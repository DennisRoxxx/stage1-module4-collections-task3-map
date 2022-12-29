package com.epam.mjc.collections.map;

import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        
        if (sentence.isEmpty()) {
            return map;
        }
        
        String[] text = sentence.split(". , ! ? : ; + - = _ [ ] ( )");
        
        for (String temp : text) {
            String word = temp.toLowerCase();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }
}
