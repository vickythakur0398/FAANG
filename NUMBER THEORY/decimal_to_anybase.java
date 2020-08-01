
/*
Given a decimal number. Write a program to convert it into equivalent binary number.

Input:
First line of input contains a single integer T which denotes the number of test cases.
First line of each test case contains a single integer N which represents a decimal value.

Output:
For each test case, print the binary equivalent of the given decimal value N.

Constraints:
1 <= T <= 103
1 <= N <= 103

Example:
Input:
3
7
10
33
Output:
111
1010
100001





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
	        long num = scn.nextLong();
	        int destination_base = 2;
	        int source_base = 10;
	        System.out.println(decimal_toany( num, destination_base));
	    }
	}
	public static long decimal_toany(long num, int base)
	{
	    
	    long mul = 1;
	    long ans = 0;
	    while(num != 0)
	    {
	        long rem = num % 2; // desyination base daal yaha
	        ans += (mul*rem);
	        mul = mul * 10;
	        num = num/2;  // yaha pe bhi 
	        
	    }
	    
	    return ans;
	    
	}
	 
}
