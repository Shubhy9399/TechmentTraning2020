package com.techment;

public class SuperMarket {
	
	public static void main(String args[]) {
		
		int ProductQuantities[]= {23,45,66,24,45,27,30};
		
		int max=0;
		
		for(int i=0;i<ProductQuantities.length;i++) {
			if(max < ProductQuantities[i]) {
				max = ProductQuantities[i];
			}
	    }
		System.out.print("Maximum Product Quantity is:"+max);

	}
}
