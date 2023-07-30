class Solution {
    public int search(int[] nums, int target) {
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