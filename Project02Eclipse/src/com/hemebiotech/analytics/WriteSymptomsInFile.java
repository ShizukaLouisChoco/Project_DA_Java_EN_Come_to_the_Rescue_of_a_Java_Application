package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class WriteSymptomsInFile implements WriteSymptoms{
    private final String writeFilepath;

    public WriteSymptomsInFile(String writeFilepath) throws IOException {
        if(writeFilepath == null)
            throw new IOException("The writeFilepath cannot be null !");
        this.writeFilepath = writeFilepath;
    }

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
