
/*Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print the maximum sum of the contiguous sub-array in a separate line for each test case.

Constraints:
1 ≤ T ≤ 110
1 ≤ N ≤ 106
-107 ≤ A[i] <= 107

Example:
Input
2
5
1 2 3 -2 5
4
-1 -2 -3 -4
Output
9
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
	    for(int i =0; i< test ; i++)
	    {
	        int size = scn.nextInt();
	        int arr [] = takeInput(size);
	       // kaden(arr, size);
	       // sum(arr, size);
	       System.out.println(kadenOptimize(arr, size));
	    }
	}public static int [] takeInput(int a)
	{
	    int [] arr = new int [a];
	    for(int i =0; i< a; i++)
	    {
	        arr[i] = scn.nextInt();
	    }
	    return arr;
	}
	
	public static void sum(int [] arr, int s)
	{
	    int max = Integer.MIN_VALUE;
	    for(int i =0; i< s; i++)
	    {
	        int sum =0;
	        for(int j = i ; j< s; j++)
	        {
	            
	            sum += arr[j];
	            /*
	            this is n3 
	            int sum =0;
	           
	           
	            for(int k =i ; k<=j ; k++ )
	            {
	               sum += arr[k]; 
	               
	            }
	            
	            max = Math.max(sum , max);
	            
	            */
	        
	        	              //  System.out.println();

	             max = Math.max(sum, max);

	        }
	        
	    }
	    System.out.print(max);
	}
	  public static int maxSubArraySum(int a[]) 
    { 
        int size = a.length; 
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0; 
  
        for (int i = 0; i < size; i++) 
        { 
            max_ending_here = max_ending_here + a[i]; 
            if (max_so_far < max_ending_here) 
                max_so_far = max_ending_here; 
            if (max_ending_here < 0) 
                max_ending_here = 0; 
        } 
        return max_so_far; 
    } 

	public static void kaden(int []arr, int s)
	{
	   int max = 0;
	   int maxsofar = Integer.MIN_VALUE;
	    for(int i =0; i< s; i++)
	    {
	         max = max + arr[i];
	         
	         if(max <arr[i])
	         {
	             max = arr[i];
	         }
	         if(maxsofar < max)
	         {
	             maxsofar = max;
	         }
	    }
	    
	    
	    System.out.println(maxsofar);
	    
	}
	public static int kadenOptimize(int [] arr, int s)
	{
	    int meh =0;
	    int msf = Integer.MIN_VALUE;
	    for(int i =0; i< s; i++)
	    {
	        meh += arr[i];
	        msf = Math.max(meh, msf);
	        
	        if(meh<0)
	        {
	            meh = 0;
	        }
	    }
	    return msf;
	}
	
 }	
	
	
	
	 

