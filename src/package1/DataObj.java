package package1;

import java.util.ArrayList;

public class DataObj {
	//x and y arraylist size
	
	public static int size = 0;
	
	//x and y axis data
	private static ArrayList <Double> xData = new ArrayList<Double>();
	private static ArrayList<Double> yData = new ArrayList<Double>();
	
	
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
	//------------------------------------------------------------
	
	public void DataObj(String fileName) {
		
		
		
	}
	
	
	
}
