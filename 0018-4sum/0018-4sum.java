class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int start = j + 1;
                int last = n - 1;
                while (start < last) {
                     long  sum = nums[i];
                     sum+=nums[j];
                     sum+=nums[start];
                     sum+=nums[last];
                    if (sum == target) {
                        list.add(Arrays.asList(nums[i], nums[j], nums[start], nums[last]));
                        start++;
                        last--;
                        while (start < last && nums[start] == nums[start - 1])
                            start++;
                        while (start < last && nums[last] == nums[last + 1])
                            last--;
                    } else if (sum < target) {
                        start++;
                    } else {
                        last--;
                    }
                }
                while (j + 1 < n && nums[j] == nums[j + 1])
                    j++;
            }
            while (i + 1 < n && nums[i] == nums[i + 1])
                i++;
        }
        return list;
    }
}
