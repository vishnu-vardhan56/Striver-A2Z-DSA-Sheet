class Solution {
    public boolean search(int[] nums, int k) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==k){
                return true;
            }
            if(nums[mid]==nums[low] && nums[mid]==nums[high]){
                low = low+1;
                high = high-1;
                continue;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=k && k<=nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(nums[mid]<=k && k<=nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return false;
    }
}