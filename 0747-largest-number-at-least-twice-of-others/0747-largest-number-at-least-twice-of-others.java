class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int idx =-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                idx = i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max && max < 2*nums[i]){
                return -1;
            }
        }
        return idx;
    }
}