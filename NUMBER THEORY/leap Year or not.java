/*For an input year tell whether the year is leap or not. 

Input:
First line contains an integer, the number of test cases 'T' Each test case should contain a positive integer N(Year).


Output:
Print "Yes" if it is a leap year else "No". (Without the double quotes)


Constraints:
1<=T<=31
1<=N<=9999


Example:
Input:
1
4

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
	    for(int i=0; i< test; i++)
	    {
	        int year = scn.nextInt();
	        
	        if(year%400 ==0 || (year %4 ==0 && year%100 != 0 ))
	        {
	            System.out.println("Yes");
	        }
	        else
	        System.out.println("No");
	    }
	}
	 
}
