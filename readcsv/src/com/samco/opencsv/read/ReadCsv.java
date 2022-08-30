package com.samco.opencsv.read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;

public class ReadCsv
{
public static void main(String[] args) throws IOException{
	try {
		File file  = new File("/home/samcouser/Documents/csv/CsvFile");
		FileReader filereader = new FileReader(file);
		CSVReader reader = new CSVReader(filereader);
		List<String[]> data = reader.readAll();
		data.forEach(x -> System.out.println(Arrays.toString(x)));
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
