class Solution {

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product = nums[i];
            for (int j = i; j < nums.length; j++) {
                if (i != j) product *= nums[j];
                if (product > max) {
                    max = product;
                }
            }
            product = 1;
        }
        return max;
    }
}
