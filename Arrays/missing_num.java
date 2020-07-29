/*
Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing, the missing number is to be found.

Input:
The first line of input contains an integer T denoting the number of test cases. For each test case first line contains N(size of array). The subsequent line contains N-1 array elements.

Output:
Print the missing number in array.

Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 107
1 ≤ C[i] ≤ 107

Example:
Input:
2
5
1 2 3 5
10
1 2 3 4 5 6 7 8 10

Output:
4
9

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
	  for(int i =0;  i<test ; i++)
	  {
	      int size = scn.nextInt();
	      int arr [] = takeInput(size);
	   //   System.out.println(ser(arr, size));
	      System.out.println(serxor_optimize(arr, size));
	   //   dis(arr);
	  }
	    
	}
	
	public static int [] takeInput(int a)
	{
	    int [] arr = new int [a-1];
	    for(int i =0; i< arr.length; i++)
	    {
	        arr[i] = scn.nextInt();
	    }
	    return arr;
	}
	
	public static int ser(int [] arr, int n)
	{
	  int total = n *(n+1)/2;
	  int sum =0;
	  for(int i=0; i< arr.length; i++)
	  {
	    sum += arr[i];  
	  }
	  return total -sum;
// 	  return sum;
// 	  return arr.length;
	   
	}
	
	
 }
