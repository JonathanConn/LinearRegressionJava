package package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ReadCSV extends LinReg{
	public ArrayList <String> readCSV(String name) throws FileNotFoundException {
		File file = new File(name);
		
        String line = "";
        String cvsSplitBy = ",";

        ArrayList<String> temp = new ArrayList<String>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        	
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] array = line.split(cvsSplitBy);
    	        for(String i:array) {
    	        	temp.add(i);
    	        }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return temp;
	}
	public ArrayList<Double> parseTimeDATA(ArrayList<String> array){
		
		//remove first 6 elements
		for(int i = 0; i <= 6;i++)array.remove(0);
		
		for(Iterator<String> it = array.iterator(); it.hasNext();) {
			String data = it.next();
			if (! data.contains("-")) {
				it.remove();
		    }
		}
		
		System.out.println(array);
		
		return null;
	}
	public ArrayList<Double> parseCloseDATA(ArrayList<String> array){
		//remove first 6 elements
		for(int i = 0; i <= 6;i++)array.remove(0);
		
		
		
		return null;
	}
}

