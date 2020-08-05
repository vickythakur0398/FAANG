/*

Given a number N. The task is to print all its unique prime factors in increasing order.

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow.
The first line of each test case is N.

Output:
For each testcase, in a new line, print all prime factors in increasing order separated by space.

Constraints:
1 ≤ T ≤ 10000
2 ≤ N ≤ 106

Example:
Input:
2
100
35
Output:
2 5
5 7




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
	        int num = scn.nextInt();
	        primefactor(num);
	        System.out.println();
	    }
	}
	
	public static void primefactor(int num)
	{
	    for(int i =2; i<= Math.sqrt(num); i++)
	    {
	        if(num %i ==0)
	        {
	            int count = 0;
	            while(num%i ==0)
	            {
	                count ++;
	                num = num/i;
	            }
	            System.out.print(i + " ");
	        }
	    }
	    if(num != 1)
	    {
	    System.out.print(num);
	    }
	}
	
	 
}
