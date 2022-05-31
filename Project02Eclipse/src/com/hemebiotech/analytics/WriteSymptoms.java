package com.hemebiotech.analytics;

import java.util.Map;
/**
 * Make Map typed data to String data
 * writeFilepath will be defined in main method
 *
 */

public interface WriteSymptoms {
    /**
     *writeSymptomFileFromMap method
     * @param symptomsMap: Map typed data with string data (Symptom name)in key and Integer data(Counts of symptoms) in value
     */
    void writeSymptomFileFromMap(Map<String, Integer> symptomsMap);
}
