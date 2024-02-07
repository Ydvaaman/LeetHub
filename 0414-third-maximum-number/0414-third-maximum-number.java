class Solution {
    public int thirdMax(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]!=nums[i+1]){
                count++;
            }
                    if(count==2) return nums[i];

        }
    return max;
    }
}