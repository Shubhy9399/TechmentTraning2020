package com.techment;

public class SuperMarketTotalStock {
	
    public static void main(String args[]) {
    	int products[]= {34,23,12,32,21,31,10};
    	
    	int sum=0;
    	
    	for(int i=0;i<products.length;i++) {
    		sum = sum + products[i];
    	}
    	System.out.print("Total number of products is:"+sum);
    }
}
