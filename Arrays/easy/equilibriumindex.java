/*
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
	        int arr [] = takeInput(size);
	        System.out.println(equiop(arr, size));
	        
	    }
	    
	}
	public static int [] takeInput(int s)
	{
	    int arr [] = new int [s];
	    for(int i =0; i< arr.length; i++)
	    {
	        arr[i] = scn.nextInt();
	    }
	    return arr;
	}
	
	public static int sum(int [] arr)
	{
	    int sum =0;
	    for(int i =0; i< arr.length ; i++)
	    {
	        sum += arr[i];
	        
	    }
	    
	    return sum;
	}
	
	public static int equiop(int [] arr, int s)
	{
	    int sum = sum(arr);
	    int left = 0;
	    int right = sum;
	    
	    for(int i =0; i< s; i++)
	    {
	        
	        right -= arr[i];
	        if(left == right)
	        {
	            return i+1;
	        }
	        
	        left += arr[i];
	    }
	    return -1;
	}
	
	
	
	public static int equi(int [] arr , int s)
	{
	    for(int i =0; i< s; i++)
	    {
	        int sumL =0;
	        int sumR =0;
	        
	        //calculating left side of sum
	        for(int j =0; j<i ; j++ )
	        {
	            sumL = arr[j];
	        }
	        
	        //calculating right side of sum
	        for(int j = i+1; j < arr.length; i++)
	        {
	            sumR = arr[j];
	        }
	        if(sumL == sumR)
	        {
	            return i;
	        }
	    }
	    return -1;
	}

	 
}


*/


import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine().trim());
		while(testCase-- > 0){
		    int sz = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[sz];
		    int sum=0, leftsum=0;
		    boolean printLast = true;
		    String input[] = br.readLine().trim().split(" ");
		    
		    for(int i = 0 ; i < sz ; i++){
		        arr[i] = Integer.parseInt(input[i]);
		        sum = sum + arr[i];
		    }
		  
		    for(int i = 0 ; i < sz ; i++){
		       if(i != 0)
		       leftsum = leftsum+arr[i-1];
		       sum = sum - arr[i];
		       
		       if(leftsum == sum){
		          printLast = false;
		           System.out.println(i+1);
		       }
		    }
		    if(printLast)
		    System.out.println("-1");
		}
	}
}
