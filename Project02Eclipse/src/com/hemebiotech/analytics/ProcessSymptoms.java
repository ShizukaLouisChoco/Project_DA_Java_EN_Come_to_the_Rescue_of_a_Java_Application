package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface ProcessSymptoms {
    Map<String, Integer> makeSortedMapFromList(List<String> SymptomsList);
}