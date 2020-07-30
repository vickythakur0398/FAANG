/*
Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively i.e first element should be max value, second should be min value,
third should be second max, fourth should be second min and so on...

Note: O(1) extra space is allowed. Also, try to modify the input array as required.

Input:
First line of input conatins number of test cases T.
First line of test case contain an integer denoting the array size N and second line of test case contain N space separated integers denoting the array elements.

Output:
Output the modified array with alternated elements.

Constraints:
1 <=T<= 100
1 <=N<= 107
1 <=arr[i]<= 107

Example:
Input:
2
6
1 2 3 4 5 6
11 
10 20 30 40 50 60 70 80 90 100 110

Output:
6 1 5 2 4 3
110 10 100 20 90 30 80 40 70 50 60




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
	        int arr [] = new int [size];
	        
	        for(int j =0; j< size; j++)
	        {
	            arr[j] = scn.nextInt();
	        }
	        
	       arr(arr, size); 
	       System.out.println();
	    }
	}
	public static void arr(int [] arr,int s)
	{
	    
	    int starting_pointer=0 ;
	    int ending_pointer= s-1;
	    int i = s-1;
	    int j = 0;
	    int k =0;
	  
	    int arrnew [] = new int [s];
	    //ye jab h agar size 1 ho bas to ye 
	    
	    if(s ==1 )
	    {
	        arrnew[k] = arr[k];
	       
	    }
	    
	    while(starting_pointer < ending_pointer)
	    {
	        //ye uske lie h jisme ki size odd ho usme 
	        //midlle element hi aa rha tha to uske lie aisa karna h
	         if(s %2 != 0)
	        {
	            arrnew[s-1] = arr[(s)/2];
	        }
	        arrnew[k++] = arr[ending_pointer--];
	        

	        
	        arrnew[k++] = arr[ starting_pointer++];
	       

	    }
	    
	    //ye dusra method h isme jhol jhmal nhi h sida karo
	    //jo mne kia h usme 2 corner cases h ek jab size odd ho or 
	    //jab size ek ho vo
	   /*
	    boolean flag = true;
	    for(int i=0; i< s; i++)
	    {
	        if(flag == true)
	        {
	            arrnew[i] = arr[ending_pointer];
	            ending_pointer--;
	        }
	        else
	        {
	            arrnew[i] = arr[starting_pointer];
	            starting_pointer++;
	        }
	        
	        flag = !flag;
	        
	    }
	    */
	    
	    
	    
	    for(int var : arrnew)
	    {
	        System.out.print(var + " ");
	    }
	    
	}
	 
}






