/*
Given an array of integers, your task is to find the smallest and second smallest element in the array. If smallest and second smallest do not exist, print -1.

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case contains an integer n denoting the size of the array.
Then following line contains 'n' integers forming the array.

Output:
Print the smallest and second smallest element if possible,else print -1.

Constraints:
1<=T<=100
1<=n<=100
1<=a[i]<=1000

Example:
Input :
3
5
2 4 3 5 6
6
1 2 1 3 6 7
2
1 1
Output :
2 3
1 2
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
	        int arr [] = new int[size];
	        for(int a = 0; a< size; a++)
	        {
	            arr[a] = scn.nextInt();
	        } 
	        
	       Arrays.sort(arr);
	      
	        small(arr);
	               // System.out.println("-1");
	               // break;
	            

	   }
	 }
	 
	 public static int small(int [] arr)
	 {
	    for(int k =0; k <arr.length-1; k++)
	        {
	            if(arr[k] != arr[k+1])
	            {
	                System.out.print(arr[k] + " ");
	                System.out.print(arr[k+1]);
	                System.out.println();
	                return 0;


	            }	        
	            
	        }
	        
	        System.out.println("-1");
	        return -1;
	 }
	 
	 
	 
	            
}
