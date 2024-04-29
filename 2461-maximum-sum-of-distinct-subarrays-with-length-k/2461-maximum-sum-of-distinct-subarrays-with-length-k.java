import java.util.HashMap;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i = 0;
        int j = 0;
        long sum = 0;
        long max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        while (j < nums.length) {
            sum += nums[j];
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (map.size() == k) {
                    max = Math.max(max, sum);
                }
                sum -= nums[i];
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }
                i++;
                j++;
            }
        }
        return max;
    }
}
