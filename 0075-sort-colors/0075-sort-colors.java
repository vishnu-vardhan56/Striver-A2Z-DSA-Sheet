class Solution {
    public void sortColors(int[] nums) {
        int c_0 = 0,c_1 = 0, c_2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c_0++;
            }
            else if(nums[i]==1){
                c_1++;
            }
            else{
                c_2++;
            }
        }
        for(int i=0;i<c_0;i++){nums[i] = 0;}
        for(int i=c_0;i<c_0+c_1;i++){nums[i] = 1;}
        for(int i=c_0+c_1;i<nums.length;i++){nums[i] = 2;}
        
    }
}