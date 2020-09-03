/*
Given a positive integer N. The task is to check if N is a power of 2. That is N is 2x for some x.

Input:
The first line contains T denoting the number of test cases. Each test case contains a single positive integer N.

Output:
Print "YES" if it is a power of 2 else "NO" (Without the double quotes).

Constraints:
1 <= T <= 100
0 <= N <= 1018

Example:
Input :
2
1
98

Output :
YES
NO

Explanation:
Testcase 1:  1 is equal to 2 raised to 0 (20 == 1).

*/





/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static Scanner scn = new Scanner(System.in);
	public static void main (String[] args) {
		//code
		int test = scn.nextInt();
		for(int i = 0; i< test; i++)
		{
		    long a = scn.nextLong();
		    yo(a);
		    
		}
	}
	
	public static void yo(long a)
	{
	    
	   long num = a;
	   while((num%2==0) && (num!=0))
	   {
	      long rem = num/2;
	      num = rem;
	      
	   }
	   
	   if(num ==1)
	   {
	       System.out.println("YES");
	   }else{
	   	   System.out.println("NO");
	   }
	   
	}
}
