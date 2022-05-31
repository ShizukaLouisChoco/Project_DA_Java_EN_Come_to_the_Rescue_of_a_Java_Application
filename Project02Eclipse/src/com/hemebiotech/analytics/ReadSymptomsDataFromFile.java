package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 * @author Alex
 * @version 1.0.0
 */
public class ReadSymptomsDataFromFile implements ReadSymptomsData {

	private final String filepath;

	/**
	 * ReadSymptomDataFromFile Constructor
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomsDataFromFile(String filepath) throws IOException {
		if (filepath == null)
			throw new IOException("The filepath cannot be null !");
		this.filepath = filepath;
	}
	/**
	 * getSymptoms method
	 * @return String data in List type from the .txt format
	 */
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
