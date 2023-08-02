class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while(low < high)
        {
        int mid1 = (low+high)/2;
        if(nums[mid1] < nums[mid1+1])
        low = mid1+1;
        else
        high = mid1;
        }
        return low;
    }
}