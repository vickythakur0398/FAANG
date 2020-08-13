/*
You are given two numbers a and b. You need to find the sum of a and b under modulo M (M = 109+7)

Example 1:

Input:
a = 9223372036854775807
b = 9223372036854775807
Output: 582344006
Explanation: 9223372036854775807 +
9223372036854775807 = 
18446744073709551614.
Now do (18446744073709551614) mod (109+7)
= 582344006
Example 2:

Input:
a = 1000000007
b = 1000000007
Output: 0
Explanation: 1000000007 + 1000000007  =
(2000000014‬)mod(109+7) = 0
Your Task:
You don't need to read input or print anything. Your task is to complete the function sumUnderModulo() that takes a and b as parameters and returns sum of a and b under modulo M.

Expected Time Complexity : O(1)
Expected Auxilliary Space :  O(1)

Constraints:
1 <= a,b <= 263-1

** For More Input/Output Examples Use 'Expected Output' option **
*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0) {
            String[] str = read.readLine().trim().split(" ");
            Long a = Long.parseLong(str[0]);
            Long b = Long.parseLong(str[1]);
            
            System.out.println(new Modulo().sumUnderModulo(a,b));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Modulo {
    public static long sumUnderModulo(long a, long b)
    {
        int M=1000000007;
        // Your code here, return sum of a and b
            // int M=1000000007;
    //your code here
    // long aa = (a+b)%M;
    long aa = ((a%M)+(b%M))%M;
    //  long aaa = (aa)%M;
    
    return aa;

    }   
}

