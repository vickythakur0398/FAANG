/*
Given an array which contains all elements occurring k times, but one occurs only once. Find that unique element.

Input:
The first line consists of an integer T i.e number of test cases. The first line of each test case consists of two integers n and k. 
The next line consists of n spaced integers. 

Output:
Print the required output.

Constraints: 
1<=T<=100
2<=k 1<=a[i]<=10000

Example:
Input:
2
7 3
6 2 5 2 2 6 6 
5 4
2 2 2 10 2

Output:
5
10


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
	    for(int i =0;i< test ; i++)
	    {
	        int size = scn.nextInt();
	        int k = scn.nextInt();
	        int arr [] = takeInput(size);
	       // System.out.println(repeat(int[] arr);
	       System.out.println(repeat(arr, k));
	    }
	}
	public static int [] takeInput(int s)
	{
	    int arr [] = new int [s];
	    for(int i=0; i< s; i++)
	    {
	        arr[i] = scn.nextInt();
	    }
	    
	    return arr;
	}
	public static int repeat(int [] arr, int k)
	{
	 for(int i =0; i< arr.length; i++)
	    {
	        int num = arr[i];
	        int s = 0;
	        for(int j =0; j< arr.length; j++)
	            {
	                if(arr[j] == num )
	                {
	                    s++;
	                }
	            }
	            
	            if(s != k)
	            {
	                return num; 
	            }
	    }
	    return -1;
	}
	 
}
