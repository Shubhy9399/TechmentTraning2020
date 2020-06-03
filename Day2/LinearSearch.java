package Dayprograms;

public class LinearSearch{    
public static int linearSearch(int[] arr, int find){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == find){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] a1= {10,20,30,50,70,90};    
        int find = 50;    
        System.out.println(" Element is found at index: "+linearSearch(a1, find));    
    }    
}    