class Solution {
    public int maxProfit(int[] arr) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min = Math.min(arr[i],min);
            max = Math.max(max, arr[i]-min);
        }
        return max;
    }
}