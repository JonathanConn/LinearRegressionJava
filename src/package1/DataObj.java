package package1;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DataObj extends ReadCSV{
	
	//x and y arraylist size
	public static int size = 0;
	
	//x and y axis data
	private static ArrayList <Double> xData = new ArrayList<Double>();
	private static ArrayList<Double> yData = new ArrayList<Double>();
	
	//unparrsed data
	private static ArrayList<String> zData = new ArrayList<String>();
	
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
	
	public ArrayList<Double> getXDATA(){
		return xData;
	}
	public void setXDATA(ArrayList<Double> xarray) {
		xarray.addAll(xData);
	}
	
	public ArrayList<Double> getYDATA(){
		return yData;
	}
	public void setYDATA(ArrayList<Double> yarray) {
		yarray.addAll(yData);
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
	
	
	
	
	//------------------------------------------------------------
	
	
	public DataObj(String fileName) throws FileNotFoundException {
		setFile(fileName);
		zData = readCSV(file);
		xData = parseXDATA(zData);
	//	yData = parseYDATA(zDATA);
	}
	
	
	
}
