// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
class Sorting
{
    //method to print the Elements of the array
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		while(t>0)
		{
		    //taking total elements
			int n = sc.nextInt();
			
			//creating a new array of length n
			int arr[] = new int[n];
			
			//inserting elements to the array
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt(); 
			}
			
			
			//calling bubbleSort() method
			bubbleSort(arr,n);
			
			//calling printArray() method
			printArray(arr);
			
		t--;	
		}
	}
	static void bubbleSort(int arr[], int n)
	{
	    int i, j;
        for (i = 0; i < n-1; i++)      
            new BubbleSort().bubble(arr, i, n);
	 }
}// } Driver Code Ends


//User function Template for Java

/* The task is to complete bubble() which is used 
   in below bubbleSort() */

/* A function to implement bubble sort
void bubbleSort(int arr[], int n)
{
   for (int i = 0; i < n-1; i++)      
        bubble(arr, i, n);
} */
class BubbleSort
{
    
	static void bubble(int arr[], int i, int n)
    {
        boolean swapped ;
       // add your code here
       //You do not need to print
       for(int counter =0; counter< arr.length-1; counter++)
       {
           swapped = false;
           for(int j = 0; j < arr.length -1-counter; j++ )
           {
               if(arr[j] > arr[j+1] )
               {
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   
                   swapped = true;
               }
               
           }
           
           if(swapped == false)
            break;
       }
    }
}
