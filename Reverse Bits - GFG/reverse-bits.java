//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long reversedBits(Long X) {
        String s = Long.toBinaryString(X);
        String f=  String.format("%32s", s).replaceAll(" ", "0"); 
        StringBuilder sd = new StringBuilder(f);
        sd.reverse();
        long res = Long.parseLong(sd.toString(),2);
        return res;
    }
}