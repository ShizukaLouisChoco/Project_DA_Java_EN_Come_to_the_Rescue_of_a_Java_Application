package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

public class AnalyticsApplication {
    private static final String filepath = "Project02Eclipse/symptoms.txt";
    public static void main (String[] args) throws IOException {

        ReadSymptomsData myReader = new ReadSymptomDataFromFile(filepath);
        List<String> mySymptomsList = myReader.getSymptoms();
        System.out.println(mySymptomsList);

    }
}
