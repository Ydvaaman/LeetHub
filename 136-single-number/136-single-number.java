class Solution {
    public int singleNumber(int[] nums) {
        label:
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
                if(nums[i]==nums[j]) continue label;
            }
            return nums[i];
        }
        return 0;
    }
}