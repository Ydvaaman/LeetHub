class Solution {

    public int minMaxGame(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int[] ans = new int[n / 2];
        for (int i = 0; i < n / 2; i++) {
            if (i % 2 == 0) {
                ans[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
            } else {
                ans[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
            }
        }
        return minMaxGame(ans);
    }
}
