class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int sum =0;
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int rem = target - nums[i];
            if(h.containsKey(rem)){
                arr[0] = h.get(rem);
                arr[1] = i;
                return arr;
            }
            h.put(nums[i],i);

        }
        return arr;
    }
}