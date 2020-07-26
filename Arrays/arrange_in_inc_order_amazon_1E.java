// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int array[] = new int [n];
        	for(int i=0; i<n; i++)
        		array[i] = sc.nextInt();

            Solution ob = new Solution();
            int result[] = new int[n];
            result =  ob.SortBinaryArray(array,n);

            for(int i=0; i<n; i++)
            	System.out.print(result[i]+" "); 
            System.out.println();
            t--;
        }
    } 
}


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    // code here
	   // Arrays.sort(arr);
	    int j =-1;
	    for(int i =0; i< n; i++)
	    {
	        //dekh agar no. tumhara 1se chota h matlb 0 h kyki array hi 
	        //0 or 1 ka h
	        //to humne j++ kia or usko swap kar dia
	        //dekh agar 0 1  na ho to ye nhi chalega but yaha pe 
	        //agar tera element 1 se kam h to tu usko j++ karega or usi 
	        //j+++ se swap karega to ky hoga ki bas 111 ek jagah rahega
	        //or ye ke swap karega 1 ko 0 se to 0 bhi ek jagah aa jaega
	        if(arr[i] <1)
	        {
	            j++;
	            int temp = arr[j];
	            arr[j] = arr[i];
	            arr[i] = temp;
	            
	        }
	    }
	    return arr;
	} 
} 
