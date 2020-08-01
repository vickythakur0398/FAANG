/*

Write a program to reverse digits of a number N.

Input:
The first line of input contains an integer T, denoting the number of test cases. T testcases follow. Each test case contains an integer N.

Output:
For each test case, print the reverse digits of number N .

Constraints:
1 ≤ T ≤ 104
1 ≤ N ≤ 1015

Example:
Input:
2
200
122
Output:
2
221




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
	        long num = scn.nextLong();
	        long ans = 0;
	        
	        while(num !=0)
	        {
	            long rem = num%10;
	            ans = ans*10 + rem;
	            num = num /10;
	        }
	        System.out.println(ans);
	    }
	}
	 
}
