import java.util.Arrays;

class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        if (k == 0) return nums;  // If k is 0, return the original array
        int[] arr = new int[n];
        Arrays.fill(arr, -1);  // Fill the result array with -1
        if (n < 2 * k + 1) {
            return arr;  // If there are not enough elements to form a window, return the filled array
        }

        long window = 0;
        int left = 0;
        int right = 2 * k;
        int count = 2 * k + 1;

        // Calculate the initial window sum
        for (int i = left; i <= right; i++) {
            window += nums[i];
        }
        
        // Set the average for the first valid center position
        arr[k] = (int)(window / count);
        
        // Slide the window across the array
        for (int i = k + 1; i < n - k; i++) {
            window += nums[i + k] - nums[i - k - 1];
            arr[i] = (int)(window / count);
        }

        return arr;
    }
}
