class Solution {
    public int climbStairs(int n) {
        int arr[] = new int[n+1];
        return findWays(arr,n);
    }
    public static int findWays(int dp[],int n){
        if(n<=1){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        return dp[n] = findWays(dp,n-1)+findWays(dp,n-2);
    }
}