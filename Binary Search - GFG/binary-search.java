//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int nums[], int n, int target) {
        int l = 0;
        int r = nums.length-1;
        return (bs(nums,l,r,target));
    }
    public static int bs(int nums[],int l,int r,int target){
        if(l<=r){ 
            int mid = (int)(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(target<nums[mid]){
                return bs(nums,l,mid-1,target);
            }
            else{
                return bs(nums,mid+1,r,target);
            }
        }
        return -1;
    }
}