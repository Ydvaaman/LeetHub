class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int count = 0;
        int op = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = nums.size() - 1; i >= 0; i--) {
            op++;
            if (nums.get(i) <= k) {
                set.add(nums.get(i));
                // count++;
            } 
            if(set.size()==k)break;
        }

        return op;
    }
}
