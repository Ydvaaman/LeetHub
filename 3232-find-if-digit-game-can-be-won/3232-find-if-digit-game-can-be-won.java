class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumA  = 0;
        int sumB = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                sumA+=nums[i];
            }else{
                sumB+=nums[i];
            }
        }
        if(sumA>sumB){
            return true;
        }else if(sumB>sumA){
            return true;
        }
        return false;
    }
}