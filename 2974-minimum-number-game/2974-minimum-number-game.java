class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[nums.length];
        int idx = 0;
        for(int i=0;i<nums.length;i=i+2){
            int alice = nums[i];
            int bob = nums[i+1];
            ans[idx] = bob;
            ans[idx+1] = alice;
            idx = idx+2;
        }
       return ans;
    }
}