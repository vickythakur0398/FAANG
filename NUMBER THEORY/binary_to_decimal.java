/*
Given a Binary Number B, Print its decimal equivalent.

Input:
The first line of input contains an integer T denoting the number of test cases. 
The description of T test cases follow. Each test case contains a single Binary number B. 

Output:
For each testcase, in a new line, print each Decimal number in new line.

Constraints:
1 <= T <= 100
1 <= Digits in Binary <= 16

Example:
Input:
2
10001000
101100
Output:
136
44





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
	        long a = scn.nextLong();
	       // long temp = a;
	       
	        
	       btod(a);
	    }
	}
	
	public static void btod(long a)
	{
	    long ans = 0;
	    long multiplier = 1;
	    while(a !=0 )
	    {
	      long rem = a%10;
	      ans =  ans + rem * multiplier ;
	      multiplier = multiplier * 2;
	      
	      
	      
	   
	      a = a/10;
	      
	    }
	    
	    System.out.println(ans);
	}
	 
}
