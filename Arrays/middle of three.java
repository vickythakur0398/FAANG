/*
Given three distinct numbers, find the number with value in middle (Try to do it with minimum comparisons).

Input:
First line contains an integer, the number of test cases 'T'. Each test case should contain three distinct numbers a, b and c.

Output:
Print middle of three numbers.

Constraints: 
1 <= T <= 100
-1000 <= a, b, c <= 1000

Example:
Input:
2
20 30 40
12 32 11
Output:
30
12
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
	        //int size = scn.nextInt();
	        int arr [] = new int [3];
	        for(int j =0; j< 3; j++)
	        {
	            arr[j] = scn.nextInt();
	        }
	        
	        Arrays.sort(arr);
	        
	       System.out.println(arr[1]);
	        
	    }
	}
	 
}
