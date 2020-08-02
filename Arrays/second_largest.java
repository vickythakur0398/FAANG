/*
Given an array of elements. Your task is to find the second maximum element in the array.

Input:
The first line of input contains an integer T which denotes the number of test cases. Then T test cases follows. First line of each test case contains a single integer N which denotes the number of elements in the array. Second line of each test case contains N space separated integers which denotes the elements of the array.
Output:
For each test case in a new line print the second maximum element in the array. If there does not exist any second largest element, then print -1.


Constraints:
1<=T<=100
2<=n<=1000
1<=a[i]<=106


Example:
Input:
2
5
2 4 5 6 7
6
7 8 2 1 4 3
Output:
6
7
 


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
	        int size = scn.nextInt();
	        int arr [] = new int [size];
	        for(int k =0; k< size ; k++)
	        {
	            arr[k] = scn.nextInt();
	            
	        }
	        
	        Arrays.sort(arr);
	        System.out.println(second(arr, size));
	        
	    }
	}
	public static int second(int [] arr, int s)
	{
	    for(int i =s-1; i>1; i--)
	    {
	        if(arr[i] != arr[i-1])
	        {
	            return arr[i-1];
	        }
	    }
	    
	    return -1;
	}
	 
}
