/*
Given a number N, calculate the prime numbers upto N using Sieve of Eratosthenes.  

Input: 
The first line of the input contains T denoting the number of testcases. T testcases follow. Each testcase contains one line of input containing N.

Output: 
For all testcases, in a new line, print all the prime numbers upto or equal to N.

Constraints:
1 <= T<= 100
1 <= N <= 104

Example:
Input:
2
10
35
Output:
2 3 5 7
2 3 5 7 11 13 17 19 23 29 31 




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
	        Sieve(num);
	        System.out.println();
	    }
	}
	public static void Sieve(int num)
	{
	    boolean prime[] = new boolean[num+1]; 

	    
	    //storing true at all the odd places kyuki 
	    //we have to check them only
	    for(int i = 3; i< prime.length; i = i+2 )
	    {
	        prime[i] = true;
	    }
	    
	    //now marking the multiples 
	    for(int i = 3 ; i <num ; i +=2  )
	    {
	        if(prime[i] == true)
	        {
	            for(int p = (i*i) ; p<= num; p = p+i )
	            {
	                prime[p] = false;
	            }
	        }
	    }
	    
	   // prime[num] = false;
	    prime[2] = true;
	    
	    
	    for(int k =2; k< prime.length; k++)
	    {
	        if(prime[k] == true)
	        {
	        System.out.print(k + " ");
	        }
	    }
	    
	}
	 
}
