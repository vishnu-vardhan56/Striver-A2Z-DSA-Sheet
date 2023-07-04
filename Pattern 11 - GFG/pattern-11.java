//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
       for(int i=1;i<=n;i++){
           int begin = 0;
            if(i%2==0){begin = 1;}
           for(int j=1;j<=i;j++){
              begin = 1- begin;
              System.out.print(begin+" ");
           }
           System.out.println();
       }
    }
}