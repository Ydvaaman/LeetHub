class Solution {
    public void moveZeroes(int[] nums) {
        int insertPosition = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }
        while(insertPosition < nums.length){
            nums[insertPosition] = 0;
            insertPosition++;
        }
        
    }
}