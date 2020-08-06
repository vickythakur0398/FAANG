/*
Given two numbers A and B. The task is to find the GCD of those 2 numbers.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains two space separated integers A and B.

Output:
For each testcase, in a new line, print the GCD of the two numbers.

Constraints:
1 <= T <= 100
1 <= A, B <= 103

Example:
Input:
98 56
48 18

Output:
14
6



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
	    for(int j =0; j< test; j++)
	    {
	        int a = scn.nextInt();
	        int b = scn.nextInt();
	        int hcf = 1;
	        for(int i =1; i<= Math.min(a,b) ; i++ )
	        {
	            if(a%i ==0 && b%i ==0)
	            {
	                hcf = i;
	            }
	        }
	        
	        System.out.println(hcf);
	    }
	}
	 
}
