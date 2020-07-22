/*Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

Input:
The first line of input contains an integer T, denoting the number of testcases. Then T test cases follow. Each test case consists of three lines. First line of each testcase contains an integer N denoting size of the array. Second line contains N space separated integer denoting elements of the array. Third line of the test case contains an integer K.

Output:
Corresponding to each test case, print the kth smallest element in a new line.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= T <= 100
1 <= N <= 105
1 <= arr[i] <= 105
1 <= K <= N

Example:
Input:
2
6
7 10 4 3 20 15
3
5
7 10 4 20 15
4
Output:
7
15

Explanation:
Testcase 1: 3rd smallest element in the given array is 7.
Testcase 2: 4th smallest elemets in the given array is 15.
*/

package june_21_arrays;

import java.util.*;

public class amazon_microsfoft_4M 
{
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int test = scn.nextInt();

		for (int i = 0; i < test; i++) 
		{
			int size = scn.nextInt();
			int arr [] = takeInput(size);
			int k = scn.nextInt();
			sorting(arr, k-1);
//			display(arr);
		}

	}
	
	public static int [] takeInput(int s)
	{
		
		int [] arr = new int [s];
		
		for(int i =0; i<s; i++)
		{
			arr[i] = scn.nextInt();
		}
		
		Arrays.sort(arr);
		return arr;
	}
	
	public static void display(int [] arr)
	{
		for(int val:arr)
		{
			System.out.println(val + " ");
		}
		
	}
	
	public static void sorting(int[] arr,  int k)
	{

		int element = arr[k];
		
		System.out.println(element);
	}
	
	

}

























