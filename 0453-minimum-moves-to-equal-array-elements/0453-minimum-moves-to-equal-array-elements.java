class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int result = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            result = result + nums[i] - min;
        }
        return result;
    }
}