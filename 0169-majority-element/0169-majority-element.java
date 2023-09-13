class Solution {
    public int majorityElement(int[] nums) {
        int c =0;
        int ele = 0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                c++;
                ele = nums[i];
            }
            else if(nums[i]== ele){
                c++;
            }
            else{
                c--;
            }
        }
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele){c2++;}
        }
        if(nums.length/2 < c2){return ele;}
        return -1;
    }
}