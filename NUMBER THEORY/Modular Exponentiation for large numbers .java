/*
Implement pow(A, B) % C.

In other words, given A, B and C, find (AB)%C.

 

Input:

The first line of input consists number of the test cases.

 The following T lines consist of 3 numbers each separated by a space and in the following order:

A B C

'A' being the base number, 'B' the exponent (power to the base number) and 'C' the modular.

 

Output:

In each separate line print the modular exponent of the given numbers in the test case.


Constraints:

1 ≤ T ≤ 70

1 ≤ A ≤ 10^5

1 ≤ B ≤ 10^5

1 ≤ C ≤ 10^5


Example:

Input:

3
3 2 4
10 9 6
450 768 517

Output:

1
4
34
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
	        long base = scn.nextLong();
	        long power = scn.nextLong();
	        long modulo = scn.nextLong();
	        System.out.println(expo(base, power, modulo));
	    }
	}
	
	public static long expo(long a , long b, long c  )
	{
	    long res = 1;
	    while(b > 0)
	    {
	     if(b %2 == 0)
	     {
	         a = (a*a)%c;
	         b = b/2;
	     }
	     
	     res = (res*a)%c;
	     b--;
	    }
	    
	    
	    return res;
	}
	 
}
