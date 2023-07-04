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
        for(int i=0;i<2*n-1;i++){
            int s=i,sp=n-i;
            if(i>=n){
                s = (2*n)-i-2;
                sp = i-n+2; 
            }
            for(int j=0;j<=s;j++){
                System.out.print("*");
            }
            for(int j=sp;j>1;j--){
                System.out.print("  ");
            }
            for(int j=0;j<=s;j++){
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}