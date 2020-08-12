/*
Smallest divisible number 
Given a number n the task is to complete the function which returns an integer denoting the smallest number evenly divisible by each number from 1 to n.

Input:
The first line of input contains an integer T denoting the no of test cases then T test cases follow. Each line contains an integer N.

Output:
For each test case output will be in new line denoting the smallest number evenly divisible by each number from 1 to n.

Constraints:
1<=T<=50
1<=n<=25

Example(To be used only for expected output):
Input:
2
3 
6
Output:
6
60

*/


// { Driver Code Starts
import java.util.*;
class SDN{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			GfG g=new GfG();
			System.out.println(g.getSmallestDivNum(n));
		}
	}
}// } Driver Code Ends


/*Complete the Given Function*/
class GfG{
	public static long getSmallestDivNum(int n)
	{
//add code here.
   long ans = 1;
   for(int i =2; i<= n; i++)
   {
       long a = (ans*i);
       long b= gcd(ans,i);
       long lcm = (long)a/b;
   
    ans = lcm;
       
   }
   
   return ans;
}
public static long gcd(long a,long b)
{
if(b==0){
return a;
}
else{
return gcd(b,a%b);
}
}



}
