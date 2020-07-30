/*
Given two arrays X and Y of positive integers, find number of pairs such that xy > yx (raised to power of) where x is an element from X and y is an element from Y.

Input:
The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow. 
Each test consists of three lines. The first line of each test case consists of two space separated M and N denoting size of arrays X and Y respectively. 
The second line of each test case contains M space separated integers denoting the elements of array X. 
The third line of each test case contains N space separated integers denoting elements of array Y.

Output:
Corresponding to each test case, print in a new line, the number of pairs such that xy > yx.

Constraints:
1 ≤ T ≤ 100
1 ≤ M, N ≤ 105
1 ≤ X[i], Y[i] ≤ 103

Example:
Input
1
3 2
2 1 6
1 5

Output
3

Explanation:
Testcase 1: The pairs which follow xy > yx are as such: 21 > 12,  25 > 52 and 61 > 16 





*/






// niche kara h vo samaj lio or iska logic dekh lio fir se mne kia to muje laga sahi h par 
//test case fail ho rhe the 
//isko bina samje tepa h jo niche kia h vo
//ye to khud kiah but ye o/p galat aa rha h 
//baliki logic sahi h 
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
	        int a = scn.nextInt();
	        int b = scn.nextInt();
	        
	        int [] arr1 = new int [a];
	        int [] arr2 = new int[b];
	        
	        for(int j=0; j< a; j++)
	        {
	            arr1[j] = scn.nextInt();
	        }
	        
	        for(int k =0; k< b;k++)
	        {
	            arr2[k] = scn.nextInt();
	        }
	        
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        pairs(arr1, arr2,  a , b);
	    }
	    
	    
	    
	}
	
	public static void pairs(int [] arr1, int [] arr2, int a , int b)
	{
	    int count = 0;
	    for(int i =0; i< a; i++)
	    {
	        
	        for(int j =0; j< b ;j++)
	        {
	            
	            int min = arr1[i];
	            int max = arr2[j];
	            double v = Math.pow(min, max);
	            double x = Math.pow(max, min);
	            
	             if (v > x)
	             {
	              count ++;
	              
	             }
	             
	             min = 0;
	             max = 0;
	        }
	    }
	    
	    System.out.println(count);
	}
	 
}

*/




import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
    public static void input_split(double []array,BufferedReader br) throws IOException{
		int i=0;
		String[] line=br.readLine().trim().split(" ");
		while(i<array.length)
			array[i]=Double.parseDouble(line[i++]);}
	static StringTokenizer st;
	public static String next(BufferedReader br)throws IOException{
		if(st!=null && st.hasMoreTokens())
			return st.nextToken();
			while(true){
				st=new StringTokenizer(br.readLine().trim());
				if(st.hasMoreTokens())
					return st.nextToken();
		}	
	}
	public static int nextInt(BufferedReader br)throws IOException{
	    return Integer.parseInt(next(br));
	}
	public static void main (String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=nextInt(br);
        int n,m;
        double []arr;
        double []brr;
        while(t-->0){
            n=nextInt(br);
            m=nextInt(br);
            arr=new double[n];
            brr=new double[m];
            input_split(arr,br);
            input_split(brr,br);
            System.out.println(func(arr,brr,n,m));
        }
    }
    public static long func(double []arr,double []brr,int n, int m){
        for(int i=0;i<n;i++){
            arr[i]=Math.log(arr[i])/arr[i];
            // System.out.print(arr[i]+" ");
        }
        for(int i=0;i<m;i++){
            brr[i]=Math.log(brr[i])/brr[i];
            // System.out.print(brr[i]+" ");
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        int i=0,j=0;
        long ans=0;
        while(i<n&&j<m){
            if(arr[i]>brr[j])
                j++;
            else{
                ans+=j;
                i++;
            }
        }
        ans+=(n-i)*m;
        return ans;
    }
}
