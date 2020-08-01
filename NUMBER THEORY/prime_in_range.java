/*
Generate all prime numbers between two given numbers.

Input:

The first line of the input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of a single line containing two space separated integers m and n.
Output:

For every test case print all prime numbers p such that m <= p <= n, space separated. Separate the answers for each test case by a new line.

Constraints:
1<=T<=60
1 <= m <= n <= 100000,
n - m <= 100000

Example:

Input:

2

1 10

3 5

Output:

2 3 5 7

3 5

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
	        int b = scn.nextInt();
	        printall(a, b);
	        System.out.println();
	       //System.out.println(isprime(a));
	    }
    }
    public static void printall(int a , int b)
    {
        for(int i = a; i <= b; i++)
        {
            boolean x = isprime(i);
            
           if(x == true)
           {
               System.out.print(i + " ");
           }
        }
    }
    
    public static boolean isprime(int num)
    {
     if(num ==1)
     {
         return false;
     }
     int flag = 0;
     for(int i =2; i< num ; i++)
     {
         if(num %i ==0)
         {
             flag = 1;
         }
     }
     
     if(flag ==0)
     {
         return true ;
     }
     
     return false;
     
     
       
       }
	 
}
