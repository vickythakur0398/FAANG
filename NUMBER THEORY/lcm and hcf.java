/*
Given two numbers A and B. The task is to find out their LCM and GCD.

Input:
The first line of input contains an integer T denoting the number of testcases. T testcases follow. In each test cases, there are two numbers A and B separated by space.

Output:
For each testcase in a new line, print LCM and GCD separated by space.

Constraints:
1 <= T <= 104
1 <= A <= 108
1 <= B <= 108

Example:
Input:
2
5 10
14 8

Output:
10 5
56 2



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
	        long a = scn.nextLong();
	        long b = scn.nextLong();
	        long x = gcd(a,b);
	        long y = lcm(x, a,b);
	        System.out.print(y + " " + x);
	        System.out.println();
	    }
	}
	public static long gcd(long a, long b)
	{
	    if(b == 0)
	    {
	        return a;
	    }
	    
	    long gcdd =  gcd(b , a%b);
	   // System.out.print(gcdd + " ");
	    return gcdd;
	}
	
	public static long lcm(long hcf, long a, long b)
	{
	    long x = a*b;
	    long lcf = x/hcf;
	    
	    
	    return lcf;
	    
	}
	 
}
