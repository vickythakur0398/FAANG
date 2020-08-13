/*
Given an array of N positive integers. Your task is to find the GCD of all numbers of the array.

Input:
First line of input contains number of test cases T. First line of test case contains a positive integer N, size of the array. Next line contains the array elements.

Output:
For each testcase, print the GCD of array elements.

Constraints:
1 <= T <= 100
1 <= N <= 106
1 <= Arr[i] <= 106

Example:
Input:
1
2
5 10

Output:
5

Explanation:
Testcase 1: For array elements 5,10 GCD will be 5.
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
	    for(int k =0; k< test; k++)
	    {
	        int num = scn.nextInt();
	        int arr[] = new int [num];
	        for(int i =0; i< num; i++)
	        {
	         arr[i] = scn.nextInt();
	        }
	        
	        GCDARR(arr,  num);
	    }
	}
	
	public static long GCD(long a, long b)
	{
	    if(b==0)
	    return a;
	    
	    return GCD(b, a%b);
	}
	
	public static void GCDARR(int [] arr, int n)
	{
	   // if(n ==1)
	   // {
	   // System.out.println(arr[0]);
	   // }
	    
	    long temp =arr[0];
	    for(int i =1; i< n; i++)
	    {
	        temp = GCD(temp, arr[i]);
	    }
        
        System.out.println(temp);
	    
	}
	 
	 
}
