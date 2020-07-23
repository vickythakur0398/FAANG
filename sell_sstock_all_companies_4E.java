/*
The cost of stock on each day is given in an array A[] of size N. Find all the days on which you buy and sell the stock so that in between those days your profit is maximum.

Input: 
First line contains number of test cases T. First line of each test case contains an integer value N denoting the number of days, followed by an array of stock prices of N days. 

Output:
For each testcase, output all the days with profit in a single line. And if there is no profit then print "No Profit".

Constraints:
1 <= T <= 100
2 <= N <= 103
0 <= Ai <= 104

Example
Input:
3
7
100 180 260 310 40 535 695
4
100 50 30 20
10
23 13 25 29 33 19 34 45 65 67

Output:
(0 3) (4 6)
No Profit
(1 4) (5 9)


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
	     for(int i =0; i< test; i++)
	     {
	         int size = scn.nextInt();
	         int arr [] = takeInput(size);
	         sellStock(arr);
	     }
	     
	 }
	 
	 public static int[] takeInput(int n)
	 {
	     int [] arr = new int[n];
	     for(int i = 0; i< n ; i++)
	     {
	         arr[i] = scn.nextInt();
	     }
	     
	     
	     return arr;
	 }
	 
	 public static void sellStock(int [] arr)
// 	 {
// 	     int buy = 0;
// 	     int sell = 0;
// 	     int count =0;
	     
// 	     for(int i =0; i<arr.length; i++)
// 	     {
// 	        if(buy ==0 && sell != arr.length-1)
// 	        {
// 	            if(arr[i] < arr[i+1]){
// 	            buy = i;
// 	            }
// 	        }
// 	        else if(sell == 0 && sell != arr.length-1 )
// 	        {
// 	            if(arr[i] > arr[i+1])
// 	            {
// 	                sell = i;
// 	            }
// 	        }
	        
// 	        else
// 	        {
// 	            sell = i;
// 	        }
	        
// 	        if(buy !=0 && sell != 0)
// 	        {
// 	            System.out.print( /*"(" +buy+ " " + sell+ ")"*/"("+buy+" "+sell+") ");
	            
// 	            buy = 0;
// 	            sell = 0;
// 	            count ++;
// 	        }
// 	     }
// 	     if(count ==0)
// 	     {
// 	         System.out.println("No Profit");
// 	     }
// 	 }


// }

{
		int sell=-1;
		int buy=-1;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(buy==-1&&i!=arr.length-1)
			{
				if(arr[i]<arr[i+1])
				{
					buy=i;
				}
			}
			else if(buy!=-1&&i!=arr.length-1)
			{
				if(arr[i]>arr[i+1])
				{
					sell=i;
				}
			}
			else
			{
				sell=i;
			}
			if(buy!=-1&&sell!=-1)
			{
				System.out.print("("+buy+" "+sell+") ");
				buy=-1;
				sell=-1;
				count++;
			}
		}
		if(count==0)
		{
			System.out.print("No Profit");
		}
		System.out.println();
	}
 }




















