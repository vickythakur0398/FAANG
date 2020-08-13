/*
Given an integer N. The task is to find the number of digits that appear in its factorial, where factorial is defined as, factorial(n) = 1*2*3*4……..*N and factorial(0) = 1.

Input:
The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of one line. The first line of each test case consists of an integer N.

Output:
Corresponding to each test case, in a new line, print the number of digits that appear in its factorial.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 104

Example:
Input:
2
5
120
Output:
3
199

Explanation:
Testcase 1: Factorial of 5 is 120. Number of digits in 120 is 3 (1, 2, and 0).



*/


// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		while(T-->0)
		{
		    Factorial obj=new Factorial();
		    int N;
		    N=sc.nextInt();
		   System.out.println(obj.digitsInFactorial(N));
		    
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Factorial
{
    
   public int digitsInFactorial(int n)
   {
  
  /*  {
        //Your code here
         long a = fact(N);
         System.out.println(a);
    int count =0;
    
    while(a!=0)
    {
        count++;
        a /=10;
    }
    
    return count;
    }
    
public static long fact(long N)
{
    if(N==1)
    return 1;
    
    return N*fact(N-1);
}
*/

if (n < 0) 
            return 0; 
  
        // base case 
        if (n <= 1) 
            return 1; 

        double digits = 0; 
        for (int i=2; i<=n; i++) 
        {
            digits += Math.log10(i); 
            // System.out.println(digits + "of" + i);
        }
            
   
        return (int)(Math.floor(digits)) + 1; 

}

}
