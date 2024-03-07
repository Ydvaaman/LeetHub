class Solution {
    public int minOperations(int[] nums) {
        int val = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] <= nums[i-1]){
               val+= nums[i-1] - nums[i] + 1;
                nums[i]+=nums[i-1] - nums[i] + 1;
            }
        }
        return val;
    }
}