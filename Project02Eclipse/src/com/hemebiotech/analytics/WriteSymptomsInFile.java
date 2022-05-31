package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * @author shizukatanigawa
 * @version 1.0.0
 */
public class WriteSymptomsInFile implements WriteSymptoms{
    private final String writeFilepath;
    /**
     * WriteSymptomInFile constructor
     * @param writeFilepath : filepath to generate new .txt file
     */
    public WriteSymptomsInFile(String writeFilepath) throws IOException {
        if(writeFilepath == null)
            throw new IOException("The writeFilepath cannot be null !");
        this.writeFilepath = writeFilepath;
    }

    /**
     * writeSymptomFileFromMap method
     * Data will be written like : Name of symptom = counts of symptom
     * @param symptomsMap: Map typed data with string data (Symptom name)in key and Integer data(Counts of symptoms) in value
     */
    @Override
    public void writeSymptomFileFromMap(Map<String, Integer> symptomsMap)  {
        try{
            FileWriter writer = new FileWriter (writeFilepath);
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(writer));
            for(Map.Entry<String, Integer> entry : symptomsMap.entrySet() ){
                String line = entry.getKey() + "=" +entry.getValue();
                printWriter.println(line);
                System.out.println(line);
            }
            printWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }


}
