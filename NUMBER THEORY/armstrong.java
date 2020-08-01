/*
For a given 3 digit number, find whether it is armstrong number or not.
An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 
371 is an Armstrong number since 33 + 73 + 13 = 371

Input:
First line contains an integer, the number of test cases 'T'. T testcases follow. Each test case contains a positive integer N.

Output:
For each testcase, in a new line, print "Yes" if it is a armstrong number else print "No".

Constraints:
1 <= T <= 31
100 <= N < 1000

Example:
Input:
1
371
Output:
Yes




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
	        int num = scn.nextInt();
	        int x = num;
	        int ans = 0;
	        int countt = count(num); 
	        while(num != 0)
	        {
	            int rem = num %10;
	            ans += Math.pow(rem, countt);
	            
	            num = num /10;
	            
	        }
	        
	        if(x == ans)
	        {
	            System.out.println("Yes");
	        }
	        else{
	            	            System.out.println("No");

	        }
	    }
	}
	public static int count(int num)
	{
	    int c= 0; 
	    while(num != 0)
        {
            c++;
            num = num /10;
        }	
        
        return c;
	    
	}
	 
}

