/*
Given two sorted arrays arr1[] and arr2[] in non-decreasing order with size n and m. The task is to merge the two sorted arrays into one sorted array (in non-decreasing order).

Note: Expected time complexity is O((n+m) log(n+m)). DO NOT use extra space.  We need to modify existing arrays as following.

Input:
First line contains an integer T, denoting the number of test cases. First line of each test case contains two space separated integers X and Y,
denoting the size of the two sorted arrays. Second line of each test case contains X space separated integers, denoting the first sorted array P.
Third line of each test case contains Y space separated integers, denoting the second array Q.

Output:
For each test case, print (X + Y) space separated integer representing the merged array.

Constraints:
1 <= T <= 100
1 <= X, Y <= 5*104
0 <= arr1i, arr2i <= 109

Example:
Input:
2
4 5
1 3 5 7
0 2 6 8 9
2 3
10 12
5 18 20

Output:
0 1 2 3 5 6 7 8 9
5 10 12 18 20


*/






//i did from both ways but there is one more efficient way which i have to learn i did from string builder
//this is taking o(1) space
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
	        int a = scn.nextInt();
	        int b = scn.nextInt();
	        int arr1 [] = new int [a];
	        for(int k =0; k< a; k++)
	        {
	            arr1[k] = scn.nextInt();
	        }
	        
	       int arr2 [] = new int[b];
	       for(int k =0; k< b; k++)
	       {
	           arr2[k] = scn.nextInt();
	       }
	       
	       arr(arr1, arr2, a , b);
	       System.out.println();
	    }
	}
	
	
	public static void arr(int a [], int b [], int aa , int bb)
	{
	        int arr [] = new int[aa+bb];
	        int i =0;
	        int j =0;
	        int k =0;
	        while(i < aa && j < bb)
	        {
	            if(a[i] < b[j])
	            {
	                arr [k] = a[i];
	                i++;
	                k++;
	            }
	            
	            else
	            {
	                arr[k] = b[j];
	                j++;
	                k++;
	                
	            }
	        }
	        
	        while(i < aa)
	        {
	            arr[k] = a[i];
	            i++;
	            k++;
	            
	        }
	        
	        while(j < bb)
	        {
	            arr[k] = b[j];
	            k++;
	            j++;
	        }
	       // Arrays.sort(arr);
	       
	       for(int ii : arr)
	       {
	           System.out.print(ii +" ");
	       }
	}
	 
}

*/

//same logic h bas array ki jagah string builder use kar lia

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	  BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(s.readLine());
	  while(t-->0){
	      String[] str=s.readLine().split(" ");
	      int n = Integer.parseInt(str[0]);
	      int m = Integer.parseInt(str[1]);
	      int[] arr1 = new int[n];
	      int[] arr2 = new int[m];
	      str=s.readLine().split(" ");
	      for(int i=0;i<n;i++)
	          arr1[i]=Integer.parseInt(str[i]);
	      str=s.readLine().split(" ");
	      for(int i=0;i<m;i++)
	          arr2[i]=Integer.parseInt(str[i]);
	      solve(arr1,n,arr2,m);
	  }
	}
	
	public static void solve(int[] arr1, int n, int[] arr2, int m){
	   
	    int i=0,j=0;
	    StringBuilder sb=new StringBuilder("");
	    while(i<n && j<m){
	        if(arr1[i]<arr2[j])
	            {
	              sb.append(arr1[i]+" ");
	              i++;
	            }
	        else
	            {
	              sb.append(arr2[j]+" ");
	              j++;   
	            }
	    }
	    
	    while(i<n){
	        sb.append(arr1[i]+" ");
	        i++;
	    }
	    while(j<m){
	        sb.append(arr2[j]+" ");
	        j++;
	    }
	    
	    
	    System.out.println(sb.toString());
	}
}
