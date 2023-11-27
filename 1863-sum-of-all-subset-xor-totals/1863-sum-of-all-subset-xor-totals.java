class Solution {

    int ans(int[] nums, int i, int sum) {
        if (i >= nums.length) {
            return sum;
        }
        return ans(nums, i + 1, sum ^ nums[i]) + ans(nums, i + 1, sum);
    }

    public int subsetXORSum(int[] nums) {
         return ans(nums,0,0);
    }
}
