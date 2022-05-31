package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ReadSymptomsData {

	private final String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) throws IOException {
		if (filepath == null)
			throw new IOException("The filepath cannot be null !");
		this.filepath = filepath;
	}
	
	@Override
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<>();

		try {
			BufferedReader reader = new BufferedReader (new FileReader(filepath));
			String line = reader.readLine();

			while (line != null) {
				result.add(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

}
