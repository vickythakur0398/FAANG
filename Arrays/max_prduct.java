/*
Given an array of positive integers. The task is to print the minimum product of any two numbers of the given array.

Input:
The first line of input contains an integer T denoting the number of test cases. 
Then T test cases follow. Each test case consists of two lines. First line of each test case contains a integer N and the second line contains N space separated array elements.

Output:
For each test case, print the minimum product of two numbers in new line.

Constraints:
1<=T<=100
2<=N<=105
1<=A[i]<=105

Example:
Input:
2
4
2 7 3 4
4
5 3 6 4

Output:
6
12




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
	        long arr [] = takeInput(size);  
	        System.out.println(max_product(arr,size));
	    }
	    
	    
	}
	public static long [] takeInput(int size)
	    {
	        long arr [] = new long [size];
	        for(int i =0; i<size; i++ )
	        {
	            arr[i] = scn.nextInt();
	        }
	        return arr;
	    }
	public static long max_product(long [] arr, int s)
	    {
	        Arrays.sort(arr);
	       // System.out.println(arr[0]);
	       // System.out.println(arr[1]);
	        
	       // System.out.print(arr[0]*arr[1]);

	        return (arr[0]*arr[1]);
	    }
	 
}
