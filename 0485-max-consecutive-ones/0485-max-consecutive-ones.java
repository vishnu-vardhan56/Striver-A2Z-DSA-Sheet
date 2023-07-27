class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxc = 0;
        int c = 0,i=0;
        while(i<nums.length){
            if(nums[i]==1){
                c++;
            }
            else{
                c=0;
            }
            maxc = Math.max(maxc,c);
            i++;
        }
        return maxc;
    }
}