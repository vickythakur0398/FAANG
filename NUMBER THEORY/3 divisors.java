/*
Given a value N. The task is to find how many numbers less than or equal to N have numbers of divisors exactly equal to 3.

Input:
The first line contains integer T, denoting number of test cases. Then T test cases follow. The only line of each test case contains an integer N.

Output :
For each testcase, in a new line, print the answer of each test case.

Constraints :
1 <= T <= 103
1 <= N <= 1012

Example:
Input :
3
6
10
30
Output :
1
2
3

Explanation:
Testcase 1: There is only one number 4 which has exactly three divisors 1, 2 and 4.



*/










import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args)
	 {
	 //code
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t>0)
	    {
	        long N = sc.nextLong();
	        int s = (int)Math.sqrt(N);
	        long count = generateSieve(s);
	        System.out.println(count);    
	        t--;
	        
	    }
	 }
	 static long generateSieve(int N)
	 {
	     long count = 0;
	     boolean[] prime = new boolean[N+1];
	     for(int i = 0;i<=N;i++)
	     {
	         prime[i] = true;
	     }
	     for(int i = 2;i*i<=N;i++)
	     {
	         if(prime[i]==true)
	         {
	             for(int j = i*i;j<=N;j+=i)
	             {
	                 prime[j] = false;
	             }
	         }
	     }
	     for(int i = 2;i<=N;i++)
	     {
	         if(prime[i] == true)
	            count++;
	     }
	     
	     return count;
	 }
}
