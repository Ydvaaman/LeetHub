class Solution {
    public int pivotIndex(int[] nums) {
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
            }
            int lsum=0;
            int rsum=sum;
            for(int i=0;i<nums.length;i++){
                rsum = rsum-nums[i];
                if(lsum==rsum) return i;
                else lsum+=nums[i];
            }
        
        return -1;
        
    }
}