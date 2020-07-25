/*
Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.

Input:
The first line contains an integer 'T' denoting the total number of test cases. Then T testcases follow. Each testcases contains two lines of input. The first line denotes the size of the array N. The second lines contains the elements of the array A separated by spaces.

Output: 
For each testcase, print the sorted array.

Constraints:
1 <= T <= 500
1 <= N <= 106
0 <= Ai <= 2

Example:
Input :
2
5
0 2 1 2 0
3
0 1 0

Output:
0 0 1 2 2
0 0 1


*/








//used inbuilt if obligation will do it by quick sort
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static Scanner scn = new Scanner(System.in);
	public static void main (String[] args)
	{
	    
	    int test = scn.nextInt();
	    for(int i =0; i < test ; i++)
	    {
	        int size = scn.nextInt();
	        int arr [] = takeInput(size);
	        sorted(arr);
	        display(arr);
	        
	        
	        
	    }
	    
	    
	}
	public static int [] takeInput(int s)
	{
	    int [] arr = new int [s];
	    for(int i =0; i< arr.length; i++)
	    {
	        arr[i] = scn.nextInt();
	    }
	    return arr;
	}
	
	public static int [] sorted(int [] arr)
	{
	    Arrays.sort(arr);
	    return arr;
	}
	
	
	
	public static void display(int [] arr)
	{
	    for(int val: arr)
	    {
	        System.out.print( val + " ");
	    }
	    System.out.println();
	    
	}
	
	
	
	
	
	 
}
