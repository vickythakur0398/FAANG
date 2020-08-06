/*
Given a positive integer N. The task is to calculate the factorial of N.

Input:
The first line contains an integer 'T' denoting the total number of test cases. T testcases follow. In each test cases, it contains an integer 'N'.

Output:
For each testcase in a new line, print the factorial of N.

Constraints:
1 <= T <= 19
0 <= N <= 18

Example:
Input:
2
1
4

Output:
1
24

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
	        int a = scn.nextInt();
	        long ans = 1;
	        while(a !=0)
	        {
	            ans *= a;
	            a= a-1;
	        }
	        
	        System.out.println(ans);
	    }
	}
	 
}
