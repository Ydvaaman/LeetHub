class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int n=0;
        int sum2=0;
        int res;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
         for(int i=0;i<nums.length;i++){
           while(nums[i] > 0)
        {
            n = nums[i] % 10;
            sum2 = sum2 + n;
            nums[i] = nums[i] / 10;
        }
        }
        return res=Math.abs(sum-sum2);
        
    }
}