/*

Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. 
Each test case consists of two lines. First line of each test case contains an Integer N denoting size of array and the second line contains N space separated elements.

Output:
For each test case, print the count of all triplets, in new line. If no such triplets can form, print "-1".

Constraints:
1 <= T <= 100
3 <= N <= 105
1 <= A[i] <= 106

Example:
Input:
2
4
1 5 3 2
3
3 2 7
Output:
2
-1



*/







import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static Scanner scn = new Scanner(System.in);
	public static void main (String[] args)
	
	{
	    int test = scn.nextInt();
	    for(int i =0; i< test ; i++ )
	    {
	        int size = scn.nextInt();
	        int arr [] = input(size);
	        Arrays.sort(arr);
	       // System.out.println(max(arr, size));
	        max(arr, size);
	        
	    }
	}public static int [] input(int s)
	{
	    int arr [] = new int [s];
	    for(int i=0; i< arr.length; i++)
	    
	    {
	        arr[i] = scn.nextInt();
	    }
	    return arr;
	}
	
	public static void max(int [] arr, int s)
	{   
	    int count =0;
	    int j =0;
	    int k =0;
	    boolean flag = false;
	   for(int i =s; i>= 1; i--)
	   {
	       
	        j = 0;
	        k = s-2;
	       int sum = 0;
	       while(j < k)
	       {
	           sum = arr[j] + arr[k];
	           if(sum == arr[i-1])
	           {
	               count++;
	               j++;
	               k--;
	               flag = true;
	           }
	          else if(sum < arr[i-1])
	           {
	               j++;
	           }
	           else 
	           {
	               k--;
	           }
	       }
	       
	       
	   }
	   
	   if(flag == true)
	       {
	           System.out.println(count);
	       }
	       else{
	          System.out.println("-1");
 
	       }
	   
	}
	
	 
}
