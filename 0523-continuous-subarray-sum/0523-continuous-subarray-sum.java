class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            
            int remainder = sum % k;
            
            if (mp.containsKey(remainder)) {
                if (i - mp.get(remainder) >= 2) {
                    return true;
                }
            } else {
                mp.put(remainder, i);
            }
        }
        
        return false;
    }
}