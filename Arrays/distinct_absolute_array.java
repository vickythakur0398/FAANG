/*

Count the number of distinct absolute values from a sorted array containing N integers. An absolute value of a number is | a |  ( positive ) value of it.
 

Input
The first line of input contains an integer T denoting the number of test cases. Then T test cases
follow. 
The first line of each test case contains an integer N, where N is the size of the array A[ ].
The second line of each test case contains N space separated sorted integers, denoting elements of the array
A[ ].

Note: The array can contain duplicate values.
 

Output:
For each test case output a single line containing the no of distinct absolute values present in the array .
Remember to output the answer of each test case in a new line.
 

Constraints:
1 <= T <= 100
1 <= N <= 30
-10^9<= A[i] <= 3*10^9
 

Examples :

Input:
3
4
-35 73 73 73 
9
-44 -31 -6 6 46 52 52 55 93
6
-3 -2 0 3 4 5


Output:
2
7
5


Expected Time Complexity:
O(n)


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
	    for(int i =0; i< test ;i++)
	    {
	        int size = scn.nextInt();
	        int [] arr = takeInput(size);
	        System.out.println(dis(arr));
	        
	    }
	}public static int [] takeInput(int s)
	{
	    int arr [] = new int [s];
	    for(int i =0; i< arr.length; i++)
	    {
	        arr[i] = scn.nextInt();
	    }
	    
	    for(int i =0; i< arr.length; i++)
	    {
	        if(arr[i] < 0)
	        {
	            int a = arr[i];
	            arr[i] = -a;
	        }
	    }
	    
	    return arr;
	}
	public static int dis(int [] arr)
	{
	    if(arr.length == 1)
	    {
	        return 1;
	    }
	    Arrays.sort(arr);
	    int c= 1;
	    int corner = 0;
	    for(int i =0;i< arr.length-1; i++ )
	    {
	       // c = 1;
	        if(arr[i] != arr[i+1])
	        {
	            c += 1;
	            corner = arr[i+1];
	        }
	    }
	    
	   // if(corner != arr[arr.length-2])
	   // {
	   //     c = c+1;
	   // }
	    
	    return c;
	}
	 
}
