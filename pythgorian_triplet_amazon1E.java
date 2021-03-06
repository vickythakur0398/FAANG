/*
Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.

*/


//package gfg;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class pythagorian_triplet_amazon_1E {


static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int test = scn.nextInt();
		for(int i= 0; i<test; i++ )
		{
			int size = scn.nextInt();
					
			int arr [] = takeInput(size);
//			System.out.println(Trick(arr));
//			display(square(arr));
			int[] arrn = square(arr);
//			display(arrn);
			System.out.println(Pytha(arrn , size));
			
			
		}
	}
	public static void display(int[] arr) {
		// TODO Auto-generated method stub
		for(int val:arr)
		{
			System.out.print(val+" ");
		}
	}
	public static int[] takeInput(int size)
	{  int [] a = new int[size];
		for(int i =0; i< a.length; i++)
		{
			a[i] = scn.nextInt();
		}
		
		return a;
	}
	//thi sis by brute force complexity o(n3)
//	public static String Trick(int [] arr)
//	{
////		
////		
//		
//		for(int i =0; i< arr.length; i++ )
//		{
//			int a = Array.getInt(arr, i) ;
////			int a2 = (int)Math.pow(a, 2);
//			int a2 = a*a;
//
//			for(int k = i+1; k< arr.length; k++)
//			{
//			int 	b = Array.getInt(arr, k);
////			int 	b2 = (int)Math.pow(b, 2);
//			int b2 = b*b;
//
//				
//				for(int j =k+1 ; j< arr.length; j++ )
//				{
//				int 	 c = Array.getInt(arr, j);
////				int 	 C2 = (int)Math.pow(c, 2);
//				int C2 = c*c;
//					 
//					 if((a2+b2) == C2|| (a2+C2 == b2) || (b2+C2 == a2))
//					 {
////						 System.out.println("YES");
////						 isPythagoras(a2 ,  b2 , C2);
//						 return "YES";
//						 
////						 break;
//						
////					 }
//					 
//						 
//					 }
//
//				}
//			}
////		System.out.println("NO");
//		}
//		return "NO";
//	}
//	
	
	//optimised soln o(n2)
	public static int [] square(int[] arr)
	{
		int [] arrn = new int[arr.length];
		for(int i =0; i< arrn.length; i++ )
		{
			arrn[i] = arr[i] * arr[i];
		}
		
		Arrays.sort(arrn);
		
		return arrn;
	}
	
	public static String Pytha(int[] arr , int size)
	{
//		int n = arr.length;
		for(int i =size-1; i>=2; i--)
		{
			int first = 0;
			int last = i-1;
		
		
		while(first < last )
		{
			if((arr[first] + arr[last]) == arr[i])
			{
				return "Yes";
			}
			else if ((arr[first] + arr[last]) < arr[i])
		
				first++;
			else 
				last--;
			}
		
// 		first =0;
// 		last = i-1;
		}
		
		
		return "No";
		
	}
}


