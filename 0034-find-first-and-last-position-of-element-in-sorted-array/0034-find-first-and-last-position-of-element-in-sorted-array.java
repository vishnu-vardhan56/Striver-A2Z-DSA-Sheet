class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = {-1,-1};
        arr[0] = starting(nums,0,nums.length-1,target);
        arr[1] = ending(nums,0,nums.length-1,target);
        return arr;
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