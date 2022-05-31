package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Program for an Application which gets, counts and sorts symptoms from Symptoms.txt and make results.out file
 *
 * @author shizukatanigawa
 * @version 1.0.0
 */

public class AnalyticsApplication {
    private static final String filepath = ("Project02Eclipse/symptoms.txt");
    private static final String writeFilepath = ("Project02Eclipse/results.out");

    /**
     * main method
     */
    public static void main (String[] args) throws IOException {
        ReadSymptomsData myReader = new ReadSymptomsDataFromFile(filepath);
        List<String> mySymptomsList = myReader.getSymptoms();

        ProcessSymptoms myProcess = new ProcessSymptomsImpl();
        Map<String,Integer> myMap = myProcess.makeSortedMapFromList(mySymptomsList);

        WriteSymptoms myWriter = new WriteSymptomsInFile(writeFilepath);
        myWriter.writeSymptomFileFromMap(myMap);
    }
}
