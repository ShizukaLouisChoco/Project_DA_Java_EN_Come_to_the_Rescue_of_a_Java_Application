package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProcessSymptomsImpl implements ProcessSymptoms {
    @Override
    public Map<String, Integer> makeSortedMapFromList(List<String> SymptomsList){
        Map<String, Integer> map = new TreeMap<>();
        for (String line : SymptomsList){
            Integer value = map.getOrDefault(line,0);
            Integer newValue = value +1;
            map.put(line, newValue);
        }

        return map;
    }


}
