class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int a = nums[n-1];
        int b = nums[n-2];
        
        int c = nums[0];
        int d = nums[1];
        
        int res = (a*b)-(c*d);
        return res;
        
    }
}