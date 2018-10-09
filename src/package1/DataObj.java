package package1;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DataObj extends ReadCSV{
	
	//x and y arraylist size
	public static int size = 0;
	
	//x and y axis data
	private static ArrayList <Double> timeData = new ArrayList<Double>();
	private static ArrayList<Double> closeData = new ArrayList<Double>();
	
	//unparrsed data
	private static ArrayList<String> allData = new ArrayList<String>();
	
	//linreg formula
	String formula = "";
	
	//filename
	String file = "";
	
	//Getters and setters block---------------------------------
	public int getSize() {
		return size;
	}
	public void setSize(int x) {
		size = x;
	}
	
	public ArrayList<Double> gettimeData(){
		return timeData;
	}
	public void settimeData(ArrayList<Double> xarray) {
		xarray.addAll(timeData);
	}
	
	public ArrayList<Double> getcloseData(){
		return closeData;
	}
	public void setcloseData(ArrayList<Double> yarray) {
		yarray.addAll(closeData);
	}
	
	public String getFormula() {
		return formula;
	}
	public void setFormula(String x) {
		formula = x;
	}
	
	public String getFile() {
		return file;
	}
	public void setFile(String x) {
		file = x;
	}
	
	public String toString() {
		return getFormula();
	}
	
	
	//------------------------------------------------------------
	
	
	public DataObj(String fileName) throws FileNotFoundException {
		setFile(fileName);
		allData = readCSV(file);
		timeData = parseTimeDATA(allData);
//		closeData = parseCloseDATA(allData);
		
		
	}
	
	
	
}
