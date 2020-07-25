/*
Given an integer array Arr[] and an element x. The task is to find if the given element is present in array or not.

Input:
First line contains an integer, the number of test cases 'T'. For each test case, first line contains an integer 'N', size of array. The second line contains the elements of the array separated by spaces. Third line contains element to be find in the array.

Output:
For each testcase, output a single line containing first index of element to be found in array. If element is not in the array, then print "-1" (without quotes).

Constraints:
1 <= T <= 100
1 <= N <= 100
1 <= Arr[i] <= 100

Example:
Input:
2
4
1 2 3 4
3
2 4 7 8
1

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
	    for(int i =0; i < test ; i++)
	    {
	        int size = scn.nextInt(); 
	       int [] arr = takeInput(size);
	       int find = scn.nextInt();
	       System.out.println(find_index(arr, find));

	    }
	    
	}public static int [] takeInput(int size)
	{
	    int [] arr = new int [size];
	    for(int i =0; i< arr.length; i++)
	    {
	        arr[i] = scn.nextInt();
	    }
	    
	    return arr;
	}
	
	public static int find_index(int[] arr, int s)
	{
	    int element =0; 
	    for(int i = 0; i< arr.length; i++)
	    {
	        if(arr[i] == s)
	        {
	            return i;
	        }
	        else{
	            element++;
	            
	        }
	    }
	    
	    return -1;
	}
	 
}
