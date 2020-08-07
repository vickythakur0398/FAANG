/*
Write a program to calculate nPr. nPr represents n permutation r and value of nPr is (n!) / (n-r)!.

Input: 
The first line of the input contains T denoting the number of testcases. T testcases follow. First line of the test case will be the value of n and r respectively.

Output:
For each test case, in a new line, output will be the value of nPr.

Constraints:
1 <= T <= 100
1 <= n,r <= 20
n >= r

Example:
Input:
2
2 1
10 4
Output:
2
5040

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
	    for(int i =0; i< test; i++)
	    {
	        long n = scn.nextLong();
	        long r = scn.nextLong();
	        System.out.println(NPR(n, r));
	       
	        
	        
	    }
	}
	public static long fact(long n)
	{
	    long ans = 1;
	    while(n!=0)
	    {
	        ans *= n;
	        n--;
	        
	    }
	    
	    return ans;
	}
	
	public static long NPR(long n , long r)
	{
	    return fact(n)/fact(n-r);
	}
	 
}
