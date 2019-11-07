package com.hackathon.usecase3.dataPreparation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataFormatter {

	private String pathToCsv = "E:/dev/hackathon/fundamentalsData/";

	public void dataReader() throws IOException  {
		BufferedReader csvReader=null;
		try {
			csvReader = new BufferedReader(new FileReader(pathToCsv ));
			String row;
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
			     
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			csvReader.close();
		}
		
		
		
	}
	 
}
