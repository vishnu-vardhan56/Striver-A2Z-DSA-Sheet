//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String strs[], int n){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(min,strs[i].length());
        }
        boolean check = true;
        String res = "";
        for(int i=0;i<min;i++){
            for(int j=0;j<n;j++){
                if(strs[0].charAt(i)!=strs[j].charAt(i)){
                    check = false;
                    break;
                }
            }
            if(check){
                res+=strs[0].charAt(i);
            }
            else{
                break;
            }
        }
        if(res.length()==0){return "-1";}
        return res;
    }
}