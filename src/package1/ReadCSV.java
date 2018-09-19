package package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadCSV extends LinReg{
	public ArrayList <String> readCSV(String name) throws FileNotFoundException {
		
		ArrayList <String> temp = new ArrayList<String>();
		
        String csvFile = name;
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
		return temp;
    }
	
	public ArrayList<Double> parseXDATA(ArrayList<String> array){
		
		
		return null;
	}
}

