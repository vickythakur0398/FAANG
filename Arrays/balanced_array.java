/*

Given an array of even size, task is to find minimum value that can be added to an element so that array become balanced. 
An array is balanced if the sum of the left half of the array elements is equal to the sum of right half.

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case contains the number of elements in the array a[] as n and next line 
contains space separated n elements in the array a[].

Output:
Print an integer which is the required answer.

Constraints:
1<=T<=20
2<=n<=10000
1<=a[i]<=100000

Example:
Input:
2
6
1 2 1 2 1 3
2
20 10

Output:
2
10



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
	        for(int j =0; j< size; j++)
	        {
	            arr[j] = scn.nextInt();
	        }
	        System.out.println(bal(arr, size));
	    }
	}
	public static int bal(int [] arr, int size)
	{
	    int left = 0;
	    int right = 0;
	    int mid = size/2;
	    int a =0;
	    int b = size-1;
	    
	    while(mid !=0)
	    {
	        left += arr[a++];
	        right += arr[b--];
	        mid --;
	        
	        
	    }
	    int aa= left;
	    int bb = right;
	    while(aa != bb)
	    {
	        if(aa < bb)
	        {
	            aa++;
	        }
	        else{
	            bb++;
	        }
	    }
	    
	    if(left < right)
	    {
	        int x = aa- left;
	        return x;
	    }
	    
	    return bb - right;
	}
	 
}
