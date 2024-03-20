class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }else if(nums[i]!=nums[i+1]){
                continue;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]==0){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}