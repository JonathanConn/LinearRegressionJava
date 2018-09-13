package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadCSV extends LinReg{
	public ArrayList <String> readCSV(String name) throws FileNotFoundException {
		
		ArrayList <String> temp = new ArrayList<String>();
		
		URL url = getClass().getResource(name);
		File file = new File(url.getPath());
        Scanner scanner = new Scanner(file);
        
        scanner.useDelimiter(",");
        
        while(scanner.hasNext()){
        	temp.add(scanner.next());
        }
        
        scanner.close();
        System.out.println(Arrays.toString(temp.toArray()));
        
        return temp;
    }
	
	public ArrayList<Double> parseXDATA(ArrayList<String> array){
		
		
		return null;
	}
	
}
