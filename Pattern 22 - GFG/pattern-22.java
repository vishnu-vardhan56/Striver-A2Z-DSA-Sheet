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
            obj.printSquare(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printSquare(int n) {
        int arr[][] = new int[2*n][2*n];
        for(int i=0;i<n;i++){
            for(int j=i;j<2*n-i-1;j++){
                for(int k=i;k<2*n-1-i;k++){
                    arr[j][k] = n-i;
                }
            }
        }
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}