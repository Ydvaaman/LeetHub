class Solution {
    public int[] findErrorNums(int[] nums) {
          int[] result = new int[2];
        Map<Integer, Integer> numCount = new HashMap<>();

        // Count the occurrences of each number in the array
        for (int num : nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }

        // Find the repeated and missing numbers
        for (int i = 1; i <= nums.length; i++) {
            if (numCount.containsKey(i)) {
                if (numCount.get(i) == 2) {
                    result[0] = i; // Repeated number
                }
            } else {
                result[1] = i; // Missing number
            }
        }

        return result;
    }
}