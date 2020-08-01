/*
You are given an array A representing size of candles which reduce 1 unit in a day. Room is illuminated using given x candles, 
where x is the size of array A. Question is to find maximum number of days room is without darkness.

Input:
The first line of input consists of an integer T denoting the number of test cases. T testcases follow. Each test case contains an integer N denoting the size of the array. 
Then in the next line are N space separated elements of the array.

Output:
For each test case, print the maximum number of days room will be illuminated.

Constraints:
1<=T<=200
1<=N<=107
1<=Elements of array <=1018

Example:
Input:
2
3
1 1 2
5
2 3 4 1 2
Output:
2
4






*/





/*

ye sahi h but fail ho rhe bade no. pe bakio ke cahl rhe h or long se nhi hua
//niche wala
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
	        for(int j =0; j<size; j++)
	        {
	            arr[j] = scn.nextInt();
	        }
	        
	        int max = arr[i];
	        for(int k =0; k< size; k++)
	        {
	            if(arr[k] > max)
	            {
	                max = arr[k];
	            }
	        }
	        System.out.println(max);
	    }
	}
	 
}

*/



import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    long max=0;
		    long temp;
		    int n=sc.nextInt();
		    for(int i=0;i<n;i++ ){
		        temp=sc.nextLong();
		        if(temp>max)
		            max=temp;
		    }
		    System.out.println(max);
		}
	}
}
