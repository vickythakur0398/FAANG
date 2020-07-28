/*
Given an array, return length of the longest subarray of non- negative integers.

Note: Subarray here means a continuous part of the array.

Input:
The first line of input contains an integer T denoting the number of test cases. 
Then T test cases follow. Each test case contains an integer n denoting the size of the array. The following line contains n space separated integers forming the array.

Output:
Print the length of the longest subarray of non-negative integers.

Constraints:
1<=T<=10^5
1<=n<=10^5
1<=a[i]<=10^5

Example:
Input:
2
9
2 3 4 -1 -2 1 5 6 3
10
1 0 0 1 -1 -1 0 0 1 0

Output:
4
4

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
	        int [] arr = takeInput(size);
	        System.out.println(lon(arr, size));
	    }
	    
	}
	public static int [] takeInput(int s)
	{
	    int arr [] = new int [s];
	    for(int i =0; i< arr.length; i++)
	    {
	        arr[i] = scn.nextInt();
	    }
	    
	    return arr;
	}
	public static int lon(int [] arr, int s)
	{
	    int highest = 0;
	    for(int i =0; i< s ; i++ )
	    {
	        int count =0;
	        while (i < s && arr[i] >= 0 )
	        {
	            count++;
	            i++;
	        }
	       highest = Math.max(count, highest);

	    }
	    
	    
	    return highest;
	}
	 
}
