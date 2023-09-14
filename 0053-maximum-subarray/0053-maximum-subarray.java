class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
       // int prevmax = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum +=nums[i];
            max = Math.max(sum,max);
            if(sum<0){sum = 0;}
            // sum = Math.max(sum,nums[i]);
            // prevmax = Math.max(sum,prevmax);
        }
        return max;
    }
}