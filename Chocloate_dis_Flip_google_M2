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
	        int arr[] = takeInput(size);
	        Arrays.sort(arr);
	        int student = scn.nextInt();
	        System.out.println(minChoclate(arr, student));
	        
	    }
	    
	    
	}
	
	public static int [] takeInput(int size)
	{
	    int [] arr = new int [size];
	    
	    for(int i =0; i< arr.length; i++)
	    {
	        arr[i] = scn.nextInt();
	    }
	    
	    return arr;
	}
	
	public static int minChoclate(int [] arr, int m)
	{
	    
	    int min= Integer.MAX_VALUE;
	    for(int i =0;  i+m-1 <arr.length; i++ )
	    {
	      
	       int diff = arr[i+m-1] - arr[i]; 
            if (diff < min) 
                min = diff; 
         
	      
	      
	        
	    }
	    
	            return min; 

	    
	}
	 

}
