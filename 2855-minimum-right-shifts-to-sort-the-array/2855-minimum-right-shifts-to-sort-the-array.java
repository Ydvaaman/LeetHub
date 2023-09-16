class Solution {

    public int minimumRightShifts(List<Integer> nums) {
        // finding the min value
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            min = Math.min(min, nums.get(i));
        }
        //finding the index of min value
        int index = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == min) {
                index = i;
            }
        }
        for (int i = index + 1; i < nums.size(); i++) {
            if (nums.get(i) < nums.get(i - 1)) {
                return -1;
            }
        }
        for (int i = 0; i < index; i++) {
            if (i == 0) {
                if (nums.get(i) < nums.get(nums.size() - 1)) {
                    return -1;
                }
            }
            else if (nums.get(i) < nums.get(i - 1)) {
                return -1;
            }
        }
        
        
        return index==0?0:(nums.size()-index);
    }
}
