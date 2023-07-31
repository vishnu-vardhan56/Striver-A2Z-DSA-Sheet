//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] nums, int n, int target) {
        int arr[] = {-1,-1};
        arr[0] = starting(nums,0,nums.length-1,target);
        arr[1] = ending(nums,0,nums.length-1,target);
        if(arr[0]==-1){return 0;}
        return arr[1]-arr[0]+1;
    }
    public static int starting(int nums[],int start,int end,int target){
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                ans = mid;
                end = mid-1;
            }
            else if (target<nums[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static int ending(int nums[],int start,int end,int target){
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                ans = mid;
                start = mid+1;
            }
            else if (target<nums[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
}