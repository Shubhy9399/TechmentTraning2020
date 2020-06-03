package Dayprograms;

class BinarySearch{  
    public static int binarySearch(int arr[], int first, int last, int find){  
        if (last>=first){  
            int mid = first + (last - first)/2;  
            if (arr[mid] == find){  
            return mid;  
            }  
            if (arr[mid] > find){  
            return binarySearch(arr, first, mid-1, find);//search in left side of the array
            }else{  
            return binarySearch(arr, mid+1, last, find);//search in right side of the array
            }  
        }  
        return -1;  
    }  
    public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  
        int find = 30;  
        int last=arr.length-1;  
        int result = binarySearch(arr,0,last,find);  
        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }  
}  
