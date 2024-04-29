class Solution {
    public int smallestRangeI(int[] nums, int k) {
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
        for(int num:nums){
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        
        int minPos = min + k;
        int maxPos = max - k;
        
        if(minPos >= maxPos){
            return 0;
        }
        return maxPos - minPos;
      
    }
}