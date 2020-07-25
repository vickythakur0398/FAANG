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
	        int [] arr = takeInput(size);
	        System.out.println(sum(arr));
	    }
	    
	}
	public static int [] takeInput(int s )
	{
	    int [] arr = new int [s];
	    for(int i =0; i<s; i++ )
	    {
	        arr[i] = scn.nextInt();
	    }
	    
	    return arr;
	    
	}
	
	public static int sum(int [] arr)
	{
	    int total = 0;
	    for(int i =0; i< arr.length; i++)
	    {
	        total += arr[i];
	        
	    }
	    
	    return total;
	}
	
	
	
	
	
	
	
	
	 
}
