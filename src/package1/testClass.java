package package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.print.DocFlavor.URL;

public class testClass {	
	public static void main(String[] args) {

		File file = new File("GOOG.csv");
		
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] array = line.split(cvsSplitBy);
    	        for(String i:array) {
    	        	System.out.println(i);
    	        }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        

	}
}
