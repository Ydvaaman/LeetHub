class Solution {
    public int firstMissingPositive(int[] nums) {
      HashSet<Integer> hs  = new HashSet<Integer>();
         int max =Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++)
        {
            max = Math.max(max,nums[i]);
            hs.add(nums[i]);
        }
        for(int i=1;i<=hs.size();i++)
        {
            if(!hs.contains(i))
            {
                return i;
            }
        }
        return max+1;
    }
}