package package1;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class LinReg {
	public static String linearReg(ArrayList<Double> x, ArrayList<Double> y, int size) {
		//summation of x and y
		Double sumX = 0.0;
		Double sumY = 0.0;
		
		//summation of x^2 and y^2
		Double sumX2 = 0.0;
		Double sumY2 = 0.0;
		
		//summation of x^2 and y^2
		Double sumXY = 0.0;
		
		//y=a+bx values of a,b
		double aVal,bVal;
		
		//adding all elements to sum vars
		for(Double i : x) sumX += i;
		for(Double i : y) sumY += i;
		
		//adding all elements to sum^2 vars
		for(Double i : x) sumX2 += i*i;
		for(Double i : y) sumY2 += i*i;
		
		for(int i = 0; i < size; i++) {
			sumXY += (x.get(i) * y.get(i));
		}
				
		
		/**
		 * Calculating a 
		 * 
		 * a = [(Ey)(Ex^2) - (Ex)(Exy)] / [n(Ex^2)-(Ex)^2] 
		 * 
		 */
	
		double aNum = ((sumY * sumX2) - (sumX * sumXY)) / ( (size * sumX2) - (sumX * sumX));
		
		/**
		 * Calculating b
		 * 
		 * b = [ (n(Exy) - (Ex)(ey)) / (n(Ex^2) - (Ex)^2 ) ] 
		 * 
		 */
		
		double bNum = ( (size * sumXY) - (sumX * sumY) ) / ( (size * sumX2) - (sumX * sumX) );
		
		
		System.out.println(sumX +"\t"+ sumY);
		System.out.println(sumXY);
		System.out.println(aNum);
		System.out.println(bNum);
		
		DecimalFormat f = new DecimalFormat("##.00");
		
		return "y = " + f.format(aNum) + " + " + f.format(bNum)+"x";
		
	}
}
