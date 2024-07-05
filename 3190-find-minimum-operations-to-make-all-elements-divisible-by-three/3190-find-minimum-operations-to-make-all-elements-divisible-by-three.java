class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
                int diff = Math.abs(nums[i]-3);
                if(diff>=1){
                    nums[i] = nums[i]-1;
                    count++;
                }else{
                    nums[i] = nums[i]+1;
                    count++;
                }
            }
        }
        return count;
    }
}