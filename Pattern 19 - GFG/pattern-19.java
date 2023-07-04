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
        for (int i=0;i<2*n;i++){
            int s = n-i,sp=i;
            if(i>=n){
                s= i-n+1;
                sp = n-s;
            }
            for(int j=s;j>0;j--){
                System.out.print("*");
            }
            for(int j=0;j<sp;j++){
                System.out.print("  ");
            }
            for(int j=s;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}